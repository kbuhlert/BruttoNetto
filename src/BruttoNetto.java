public class BruttoNetto {
    public static void main (String[] args){
        int nettopreis = 200;
        float steuersatz = 0.08f;
        double bruttoPreis;
        bruttoPreis = nettopreis + nettopreis * steuersatz;
        System.out.println("Ergebnis: " + bruttoPreis + "€");
        double steuerMax = 0.1;
        boolean steuerMaxTest;
        steuerMaxTest = steuersatz > steuerMax;
        System.out.println("Der Steuersatz übertrifft das Max: " + steuerMaxTest);

        if (steuerMaxTest = true){
            System.out.println("Achtung, der maximale Steuersatz ist überschritten");
        } else {
            System.out.println("Der gewählte Steuersatz ist korrekt");}
    }
}
