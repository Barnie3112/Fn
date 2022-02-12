import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaschenrechnerEingabe {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("wie groß ist x?");
        double x = Double.parseDouble(bufferedReader.readLine());
        System.out.println("wie groß ist y");
        double y = Double.parseDouble(bufferedReader.readLine());
        double plus = x + y;
        double minus = x - y;
        double mal = x * y;
        double geteielt = x / y;
        System.out.println("Welche Rechenart soll angewand werden?");
        String Rechenart = bufferedReader.readLine();
        if (Rechenart.equals("plus")) {
            System.out.println("die summe ist " + plus);
        } else if (Rechenart.equals("minus")) {
            System.out.println("die differenz ist " + minus);
        } else if (Rechenart.equals("mal")) {
            System.out.println("das produkt ist " + mal);
        } else if (Rechenart.equals("geteielt")) {
            System.out.println("der quotient beträgt " + geteielt);
        } else {
            System.out.println("Die Rechenart ist nicht bekannt.");
        }


    }
}

