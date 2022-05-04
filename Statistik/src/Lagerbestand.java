import java.io.IOException;
import java.text.DecimalFormat;

public class Lagerbestand {
    public static void main(String[] args) throws IOException {
        DecimalFormat dt = new DecimalFormat("###0.00");
        System.out.println("wie viele unterschiedliche Artikel haben sie im Lager");
        int a = IO.readInteger();
        System.out.println("Erfassen sie die genaue artikelbezeichnung");
        String[] liste = IO.readStringArray(a);

        for (int i = 0; i < liste.length; i++) {
            System.out.println("Artikelbezeichnung " + (i + 1) + ": " + liste[i]);
        }
        System.out.println("Geben sie den Preis der Waren ein");
        int[] liste2 = IO.readIntegerArray(a);
        for (int j = 0; j < liste.length; j++) {
            System.out.println("Preis " + (j + 1) + ": " + "'"+liste[j] +"' "+ dt.format(liste2[j]));
        }
        System.out.println("Menge der Artikel");
        int[] liste3 = IO.readIntegerArray(a);
        for (int k = 0; k < liste.length; k++) {
            System.out.println("menge" + (k + 1) + ": " +"'"+ liste[k]+"' " + dt.format(liste3[k]));
        }
        double summe = 0;
        int menge = 0;
        for (int k = 0; k < liste.length; k++) {

            menge = menge + liste2[k];

        }


        for (int k = 0; k < liste.length; k++) {

            summe = summe + (liste2[k] * liste3[k]);

        }
        System.out.println("menge beträgt " + dt.format(menge) +"die summe beträgt: " + dt.format(summe)+"€");


    }
}
