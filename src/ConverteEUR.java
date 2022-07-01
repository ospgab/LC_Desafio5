public class ConverteEUR extends Conversao{
    public ConverteEUR(double usd_Aud, double usd_Brl, double brl_Eur, double eur_Gbp) {
        super(usd_Aud, usd_Brl, brl_Eur, eur_Gbp);
    }

    public double converteEurAud(){
        return converteEurUsd() * super.usd_Aud;
    }

    public double converteEurBrl(){
        return 1 / super.brl_Eur;
    }

    public double converteEurUsd(){
        return converteEurBrl() * super.usd_Brl;
    }

    public double converteEurGbp(){
        return super.eur_Gbp;
    }
}