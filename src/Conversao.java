public class Conversao {
    protected final double usd_Aud;
    protected final double usd_Brl;
    protected final double brl_Eur;
    protected final double eur_Gbp;

    public Conversao(double usd_Aud, double usd_Brl, double brl_Eur, double eur_Gbp) {
        this.usd_Aud = usd_Aud;
        this.usd_Brl = usd_Brl;
        this.brl_Eur = brl_Eur;
        this.eur_Gbp = eur_Gbp;
    }


    public void converte(String entrada){
        switch (entrada){
            // USD
            case "USD - AUD":
                System.out.printf("USD - AUD: %.2f \n", new ConverteUSD(this.usd_Aud, this.usd_Brl, this.brl_Eur, this.eur_Gbp).converteUsdAud());
                break;
            case "USD - BRL":
                System.out.printf("USD - BRL: %.2f \n", new ConverteUSD(this.usd_Aud, this.usd_Brl, this.brl_Eur, this.eur_Gbp).converteUsdBrl());
                break;
            case "USD - EUR":
                System.out.printf("USD - EUR: %.2f \n", new ConverteUSD(this.usd_Aud, this.usd_Brl, this.brl_Eur, this.eur_Gbp).converteUsdEur());
                break;
            case "USD - GPB":
                System.out.printf("USD - GPB: %.2f \n", new ConverteUSD(this.usd_Aud, this.usd_Brl, this.brl_Eur, this.eur_Gbp).converteUsdGbp());
                break;
            // BRL
            case "BRL - EUR":
                System.out.printf("BRL - EUR: %.2f \n", new ConverteBRL(this.usd_Aud, this.usd_Brl, this.brl_Eur, this.eur_Gbp).converteBrlEur());
                break;
            case "BRL - USD":
                System.out.printf("BRL - USD: %.2f \n", new ConverteBRL(this.usd_Aud, this.usd_Brl, this.brl_Eur, this.eur_Gbp).converteBrlUsd());
                break;
            case "BRL - AUD":
                System.out.printf("BRL - AUD: %.2f \n", new ConverteBRL(this.usd_Aud, this.usd_Brl, this.brl_Eur, this.eur_Gbp).converteBrlAud());
                break;
            case "BRL - GBP":
                System.out.printf("BRL - GBP: %.2f \n", new ConverteBRL(this.usd_Aud, this.usd_Brl, this.brl_Eur, this.eur_Gbp).converteBrlGbp());
                break;
            // AUD
            case "AUD - BRL":
                System.out.printf("AUD - BRL: %.2f \n", new ConverteAUD(this.usd_Aud, this.usd_Brl, this.brl_Eur, this.eur_Gbp).converteAudBrl());
                break;
            case "AUD - EUR":
                System.out.printf("AUD - EUR: %.2f \n", new ConverteAUD(this.usd_Aud, this.usd_Brl, this.brl_Eur, this.eur_Gbp).converteAudEur());
                break;
            case "AUD - USD":
                System.out.printf("AUD - USD: %.2f \n", new ConverteAUD(this.usd_Aud, this.usd_Brl, this.brl_Eur, this.eur_Gbp).converteAudUsd());
                break;
            case "AUD - GPB":
                System.out.printf("AUD - GPB: %.2f \n", new ConverteAUD(this.usd_Aud, this.usd_Brl, this.brl_Eur, this.eur_Gbp).converteAudGbp());
                break;
            // EUR
            case "EUR - GPB":
                System.out.printf("EUR - GPB: %.2f \n", new ConverteEUR(this.usd_Aud, this.usd_Brl, this.brl_Eur, this.eur_Gbp).converteEurGbp());
                break;
            case "EUR - USD":
                System.out.printf("EUR - USD: %.2f \n", new ConverteEUR(this.usd_Aud, this.usd_Brl, this.brl_Eur, this.eur_Gbp).converteEurUsd());
                break;
            case "EUR - BRL":
                System.out.printf("EUR - BRL: %.2f \n", new ConverteEUR(this.usd_Aud, this.usd_Brl, this.brl_Eur, this.eur_Gbp).converteEurBrl());
                break;
            case "EUR - AUD":
                System.out.printf("EUR - AUD: %.2f \n", new ConverteEUR(this.usd_Aud, this.usd_Brl, this.brl_Eur, this.eur_Gbp).converteEurAud());
                break;
            // GBP
            case "GBP - AUD":
                System.out.printf("GBP - AUD: %.2f \n", new ConverteGBP(this.usd_Aud, this.usd_Brl, this.brl_Eur, this.eur_Gbp).converteGbpAud());
                break;
            case "GBP - BRL":
                System.out.printf("GBP - BRL: %.2f \n", new ConverteGBP(this.usd_Aud, this.usd_Brl, this.brl_Eur, this.eur_Gbp).converteGbpBrl());
                break;
            case "GBP - USD":
                System.out.printf("GBP - USD: %.2f \n", new ConverteGBP(this.usd_Aud, this.usd_Brl, this.brl_Eur, this.eur_Gbp).converteGbpUsd());
                break;
            case "GBP - EUR":
                System.out.printf("GBP - EUR: %.2f \n", new ConverteGBP(this.usd_Aud, this.usd_Brl, this.brl_Eur, this.eur_Gbp).converteGbpEur());
                break;
            default:
                System.out.println("Entrada inválida");
                break;
        }

    }
}