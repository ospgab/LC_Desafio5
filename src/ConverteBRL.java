public class ConverteBRL extends Conversao {
    private double usd_Brl;
    private double brl_Eur;

    public ConverteBRL(double usd_Aud, double usd_Brl, double brl_Eur, double eur_Gbp) {
        super(usd_Aud, usd_Brl, brl_Eur, eur_Gbp);
    }


    public double converteBrlAud(){
        return converteBrlUsd() * super.usd_Aud;
    }

    public double converteBrlUsd(){
        return 1 / this.usd_Brl;
    }

    public double converteBrlEur(){
        return this.brl_Eur;
    }

    public double converteBrlGbp(){
        return converteBrlEur() * super.eur_Gbp;

    }
}