import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EingabeBedingung {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Wie heißt Du? ");
        String name = bufferedReader.readLine();
        System.out.println("Hallo " + name);

        System.out.println("Wie alt bist Du ? ");
        int alter = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Schon " + alter);

        System.out.println("Wie groß bist Du ? ");
        double groesse = Double.parseDouble(bufferedReader.readLine());
        if (groesse > 1.80) {
            System.out.println(groesse + " Das ist aber groß");
        } else {
            System.out.println(groesse + " Das ist aber klein ");
        }

        System.out.println("Woher kommst Du ?");
        String ort = bufferedReader.readLine();
        System.out.println("Oh wie spannend aus " + ort);

        System.out.println("Wie viel wiegst du ?");
        double gewicht = Double.parseDouble(bufferedReader.readLine());
        if (gewicht < 75) {
            System.out.println("Du bist aber leicht ");
        } else {
            System.out.println("Du bist aber schwer ");
        }




    }
}
