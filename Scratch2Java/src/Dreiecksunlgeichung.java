import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dreiecksunlgeichung {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Wie groß ist dei Seite a ? ");
        double a = Double.parseDouble(bufferedReader.readLine());

        System.out.println("Wie groß ist die Seite b ? ");
        double b = Double.parseDouble(bufferedReader.readLine());

        System.out.println("Wie groß ist die Seite c ? ");
        double c = Double.parseDouble(bufferedReader.readLine());

        if (a + c >= b & a + b >= c & c + b >= a) {
            System.out.println("Das Dreieck kann gezeichnet werden ");
            double u = (a + b + c);
            double s = (u / 2);
            double A = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("Der Flächeninhalt des Dreiecks beträgt " + A);
            System.out.println("Der Umfang des Dreiecks beträgt" + u);
        } else {
            System.out.println("Das Dreieck kann nicht gezeichnet werden");
        }

    }
}

