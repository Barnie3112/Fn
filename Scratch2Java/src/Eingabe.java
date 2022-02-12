import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eingabe {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Wie heißt Du? ");
        String name = bufferedReader.readLine();
        System.out.println("Hallo " + name);

        System.out.println("Wie alt bist Du ? ");
        int alter = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Schon " + alter);

        System.out.println("Wie groß bist Du ? ");
        double groeße = Double.parseDouble(bufferedReader.readLine());
        System.out.println(groeße + " Das ist aber groß");

        System.out.println("Woher kommst Du ?");
        String ort = bufferedReader.readLine();
        System.out.println("Oh wie spannend aus " + ort);



    }
}
