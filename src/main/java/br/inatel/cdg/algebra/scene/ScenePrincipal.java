package br.inatel.cdg.algebra.scene;

import br.inatel.cdg.algebra.reta.Reta;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ScenePrincipal {

    private Button btnCalcCoefAngular, btnCalcCoefLinear; //Button representa botoes
    private Label labelP1x,labelP1y,labelP2x,labelP2y; //Label representam rótulos
    private TextField txtP1x,txtP1y,txtP2x,txtP2y,txtCL,txtCA; //TextField Representam áreas de texto
    private Reta reta;

    public void criaScenePrincipal(Stage stage){

        //Criando os labels para os pontos e os campos de texto para os dados
        labelP1x = new Label("Ponto P1.x: "); //rótulos
        txtP1x = new TextField(); //área de texto onde vc digitara alguma coisa


        //HBox é usado para agrupar elementos horizontalmente
        HBox gHP1x = new HBox(labelP1x, txtP1x); //Passamos no construtor todos os elementos. Você poderá criar vários grupos horizontais

        //------------------P1y------------------------//
        //Criando os labels para os pontos e os campos de texto para os dados
        labelP1y = new Label("Ponto P1.y: "); //rótulos
        txtP1y = new TextField(); //área de texto onde vc digitara alguma coisa


        //HBox é usado para agrupar elementos horizontalmente
        HBox gHP1y = new HBox(labelP1y, txtP1y); //Passamos no construtor todos os elementos. Você poderá criar vários grupos horizontais

        //------------------P2x------------------------//
        //Criando os labels para os pontos e os campos de texto para os dados
        labelP2x = new Label("Ponto P2.x: "); //rótulos
        txtP2x = new TextField(); //área de texto onde vc digitara alguma coisa


        //HBox é usado para agrupar elementos horizontalmente
        HBox gHP2x = new HBox(labelP2x, txtP2x); //Passamos no construtor todos os elementos. Você poderá criar vários grupos horizontais


        //------------------P2y------------------------//
        //Criando os labels para os pontos e os campos de texto para os dados
        labelP2y = new Label("Ponto P2.y: "); //rótulos
        txtP2y = new TextField(); //área de texto onde vc digitara alguma coisa


        //HBox é usado para agrupar elementos horizontalmente
        HBox gHP2y = new HBox(labelP2y, txtP2y); //Passamos no construtor todos os elementos. Você poderá criar vários grupos horizontais



        //Agora vamos criar a area que mostrará o que foi calculado
        txtCA = new TextField();
        txtCA.setEditable(false);//vamos deixar false para apenas mostrar texto
        txtCA.setText("Coef Angular:");

        //Agora vamos criar a area que mostrará o que foi calculado
        txtCL = new TextField();
        txtCL.setEditable(false);//vamos deixar false para apenas mostrar texto
        txtCL.setText("Coef Linear:");

        HBox gHCalc = new HBox(txtCA, txtCL); //Passamos no construtor todos os elementos. Você poderá criar vários grupos horizontais


        //Criamos o botão
        btnCalcCoefAngular = new Button("Calcula Coeficiente Angular");
        //Criamos a ação que o botão responderá as ser pressionado
        btnCalcCoefAngular.setOnAction(evento -> {
            //Aqui dentro é a ação que será executado ao pressionar o botão
            reta = new Reta(txtP1x.getText(),txtP1y.getText(),txtP2x.getText(),txtP2y.getText());
            txtCA.setText("Coef Angular: " + reta.coefAng());
        });

        //Criamos o botão
        btnCalcCoefLinear = new Button("Calcula Coeficiente Linear");
        //Criamos a ação que o botão responderá as ser pressionado
        btnCalcCoefLinear.setOnAction(evento -> {
            //Aqui dentro é a ação que será executado ao pressionar o botão
            reta = new Reta(txtP1x.getText(),txtP1y.getText(),txtP2x.getText(),txtP2y.getText());
            txtCL.setText("Coef Linear: " + reta.coefLin());
        });

        HBox gHBot = new HBox(btnCalcCoefAngular, btnCalcCoefLinear); //Passamos no construtor todos os elementos. Você poderá criar vários grupos horizontais


        //VBox é usada para agrupar elementos verticalmente
        //No construtor passamos todos os elementos que serão agrupados, que podem ser outros grupos
        VBox layoutFinal = new VBox(gHP1x,gHP1y,gHP2x,gHP2y,gHCalc,gHBot);//Aqui vamos agrupar verticalmente o grupo (Label + Texto) o Botao e A area que aparecer o texto digitado
        //Criamos a Scene
        Scene scene = new Scene(layoutFinal, 300 , 200);

        stage.setTitle("Software Para Calculos de Álgebra Linear");
        stage.setScene(scene);
        stage.show();
    }

}
