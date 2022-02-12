import java.io.IOException;

public class KreiszahlPI {
    public static void main(String[] args) throws IOException {

        System.out.println("Gib eine Ganzzahl ein!");
        int n = IO.readInteger();
        double summe = 0;
        for (int i = 0; i <= n; i++) {
            double x = Math.pow(-1, i) / (2 * i + 1);
            summe = summe + x;
        }
        double ergebnis = summe * 4;
        System.out.println(ergebnis);
        System.out.println(Math.PI);

    }
}
