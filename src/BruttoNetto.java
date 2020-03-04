public class BruttoNetto {
    public static void main (String[] args){
        int nettopreis = 200;
        float steuersatz = 0.08f;
        double bruttoPreis;
        bruttoPreis = nettopreis + nettopreis * steuersatz;
        System.out.println("Ergebnis: " + bruttoPreis + "€");
        float steuerMax = 0.1f;
        boolean steuerMaxTest;
        steuerMaxTest = steuersatz < steuerMax;
        System.out.println("Der Steuersatz übertrifft nicht das Max: " + steuerMaxTest);
    }
}
