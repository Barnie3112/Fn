import java.io.IOException;

public class Wurzel {
    public static void main(String[] args) throws IOException {

        System.out.println("Geben Sie eine Startzahl ein! ");
        double start = IO.readDouble();
        System.out.println("Geben Sie eine Schlusszahl ein!");
        double schluss = IO.readDouble();
        do {
            double ergebniss = Math.sqrt(start);
            System.out.println(start+"="+ergebniss);
            start++;
        } while (start <= schluss);
    }
}
