import java.io.IOException;
import java.text.DecimalFormat;

public class Sparvertrag {
    public static void main(String[] args) throws IOException {
        String text;
        DecimalFormat df = new DecimalFormat("#,##0.00€");
        do {
            System.out.println("Bitte Startkapital eingeben:");
            double Startkapital = IO.readDouble();
            System.out.println("Bitte Zinssatz eingeben:");
            double Zinssatz = IO.readDouble();
            System.out.println("Bitte die Laufzeit der Hochrechnung in Jahren eingeben:");
            int Laufzeit = IO.readInteger();
            int i = 0;
            double Zins;
            double Jahresendbetrag;
            System.out.println("Jahr:\t" + "Anfangskapital:\t\t" + "Zinsbetrag:\t\t" + "Jahresendbetrag:\t\t");
            for (i = 0; i <= Laufzeit; i++) {
                Zins = Startkapital / 100 * Zinssatz;
                Jahresendbetrag = Startkapital + Zins;
                Zins = Runden.runden(Zins);
                Jahresendbetrag = Runden.runden(Jahresendbetrag);
                Startkapital =Runden.runden(Startkapital);
                System.out.println(i + "\t\t" + df.format(Startkapital) + "\t\t\t" + df.format(Zins) + "\t\t\t" + df.format(Jahresendbetrag));
                Startkapital = Jahresendbetrag;
            }
            System.out.println("Wollen Sie einen weiteren Sparvertrag berechnen? [J]");
            text = IO.readString();

        } while (text.equalsIgnoreCase("j"));
    }
}
