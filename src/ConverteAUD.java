public class ConverteAUD extends Conversao{

    public ConverteAUD(double usd_Aud, double usd_Brl, double brl_Eur, double eur_Gbp) {
        super(usd_Aud, usd_Brl, brl_Eur, eur_Gbp);
    }

    public double converteAudBrl(){
        return converteAudUsd() * super.usd_Brl;
    }

    public double converteAudEur(){
        return converteAudBrl() * super.brl_Eur;
    }

    public double converteAudUsd(){
        return 1 / this.usd_Aud;
    }

    public double converteAudGbp(){
        return converteAudEur() * super.eur_Gbp;

    }

}