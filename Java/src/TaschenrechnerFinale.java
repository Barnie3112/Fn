import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TaschenrechnerFinale {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String text;
        do {
            System.out.println("folgende Rechenoperatoren stehen zur verfügung");
            System.out.println("(+) für Addition");
            System.out.println("(-) für Subtraktion");
            System.out.println("(*) für Multiplikation");
            System.out.println("(/) für Division");
            System.out.println("(p) für Potenzierung");
            System.out.println("(w) für Wurzel");
            System.out.println("Welchen Operator willst du wählen?");
            String auswahl = bufferedReader.readLine();
            System.out.println("Wie groß ist x?");
            double x = Double.parseDouble(bufferedReader.readLine());
            System.out.println("Wie groß ist y");
            double y = Double.parseDouble(bufferedReader.readLine());

            if (auswahl.equalsIgnoreCase("+")) {
                double summe = x + y;
                System.out.println("Die Summe ist " + summe);
            } else if (auswahl.equalsIgnoreCase("-")) {
                double differenz = x - y;
                System.out.println("Die Differenz ist " + differenz);
            } else if (auswahl.equalsIgnoreCase("*")) {
                double produkt = x * y;
                System.out.println("Das Produkt ist " + produkt);
            } else if (auswahl.equalsIgnoreCase("/")) {
                double quotient = x / y;
                System.out.println("Der Quotient beträgt " + quotient);
            } else if (auswahl.equalsIgnoreCase("p")) {
                double potenzierung = Math.pow(x, y);
                System.out.println("Die Potenzierung beträgt  " + potenzierung);
            } else if (auswahl.equalsIgnoreCase("w")) {
                double wurzel = Math.sqrt(x + y);
                System.out.println("Die Wurzel ist " + wurzel);
            } else System.out.println("Die eingegebene Rechenoperation kenn ich nicht");

            System.out.println("Soll das Programm wiederholt werden? [J]");

            text = bufferedReader.readLine();

        } while (text.equalsIgnoreCase("j"));

    }

}

