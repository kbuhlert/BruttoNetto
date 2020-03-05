public class BruttoNetto {
    public static void main (String[] args){
        int nettopreis = 200;
        float steuersatz = 0.08f;
        double bruttoPreis;
        bruttoPreis = nettopreis + nettopreis * steuersatz;
        System.out.println("Ergebnis: " + bruttoPreis + "€");
        double steuerMax = 0.1;
        boolean steuerMaxTest;
        steuerMaxTest = steuersatz < steuerMax;
        System.out.println("Der Steuersatz übertrifft das Max: " + steuerMaxTest);

        if (steuerMaxTest = false){
            System.out.println("Achtung, der maximale Steuersatz ist überschritten");
        } else {
            System.out.println("Der gewählte Steuersatz ist korrekt");}

        int z1 = 1;
        int z2 = 2;
        int z3 = 3;
        int z4 = 4;
        if (z1 == 2) {
            System.out.println("Wert 1 = 2");
        } else if (z2 == 2){
            System.out.println("Wert 2 = 2");}
        else if (z3 == 2){
            System.out.println("Wert 3 = 2");}
        else {
            System.out.println("Werte 1 bis 3 sind nicht 2");}

    }
}
