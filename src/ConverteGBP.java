public class ConverteGBP extends Conversao{
    public ConverteGBP(double usd_Aud, double usd_Brl, double brl_Eur, double eur_Gbp) {
        super(usd_Aud, usd_Brl, brl_Eur, eur_Gbp);
    }

    public double converteGbpAud(){
        return converteGbpUsd() * super.usd_Aud;
    }

    public double converteGbpBrl(){
        return converteGbpEur() / super.brl_Eur;
    }

    public double converteGbpUsd(){
        return converteGbpBrl() / super.usd_Brl;
    }

    public double converteGbpEur(){
        return 1 / super.eur_Gbp;
    }
}