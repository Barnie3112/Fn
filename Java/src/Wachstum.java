import java.io.IOException;

public class Wachstum {
    public static void main(String[] args) throws IOException {
        String text;
        do {
            System.out.println("Bitte die aktuelle Zellmange eingeben:");
            int Zellmenge = IO.readInteger();
            System.out.println("Bitte den Wachstumsfaktor eingeben:");
            double Wachstumsfaktor = IO.readDouble();
            System.out.println("Bitte die Laufzeit der Hochrechnung in Tagen eingeben:");
            int Laufzeit = IO.readInteger();
            int i = 0;
            double summe = 0;
            System.out.println("Tag      Zellmenge");
            for (i = 0; i <= Laufzeit; i++) {
                summe = Math.pow(Wachstumsfaktor, i) * Zellmenge;
                System.out.println(i + "        " + summe);

            }
            System.out.println("Wollen Sie einen weiteren Wachstumsprozess berechnen? [J]");
            text = IO.readString();

        } while (text.equalsIgnoreCase("j"));
    }
}

