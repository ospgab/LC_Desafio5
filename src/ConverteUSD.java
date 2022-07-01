public class ConverteUSD extends Conversao{

    public ConverteUSD(double usd_Aud, double usd_Brl, double brl_Eur, double eur_Gbp) {
        super(usd_Aud, usd_Brl, brl_Eur, eur_Gbp);
    }

    public double converteUsdAud(){
        return super.usd_Aud;
    }

    public double converteUsdBrl(){
        return super.usd_Brl;
    }

    public double converteUsdEur(){
        return converteUsdBrl() * super.brl_Eur;
    }

    public double converteUsdGbp(){
        return converteUsdEur() * super.eur_Gbp;
    }
}