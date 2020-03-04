public class BruttoNetto {
    public static void main (String[] args){
        int nettopreis = 200;
        float steuersatz = 0.05f;
        double bruttoPreis;
        bruttoPreis = nettopreis + nettopreis * steuersatz;
        System.out.println("Ergebnis: " + bruttoPreis + "€");
    }
}
