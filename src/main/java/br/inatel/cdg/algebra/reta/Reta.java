package br.inatel.cdg.algebra.reta;

public class Reta {
    Ponto p1;
    Ponto p2;

    public Reta(String p1x,String p1y,String p2x,String p2y) {
        double p1xd = Double.parseDouble(p1x);
        double p2xd = Double.parseDouble(p2x);
        double p1yd = Double.parseDouble(p1y);
        double p2yd = Double.parseDouble(p2y);
        p1 = new Ponto(p1xd,p1yd);
        p2 = new Ponto(p2xd,p2yd);
    }

    public double coefAng(){
        if (p1.x == 0 && p2.x ==0)
            return 0;
        return (p2.y - p1.y) / (p2.x - p1.x);
    }

    public double coefLin(){
        if (p1.x == 0 && p2.x ==0)
            return 0;
        return p1.y - this.coefAng() * p1.x;
    }

}
