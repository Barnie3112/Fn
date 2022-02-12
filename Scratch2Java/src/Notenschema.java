import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Notenschema {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Wie viel Prozent hast du ?");
        double prozent = Double.parseDouble(bufferedReader.readLine());
        if (prozent > 84) {
            System.out.println("Du hast eine 1 ");
        } else if (prozent > 73) {
            System.out.println("Du hast eine 2 ");
        } else if (prozent > 58) {
            System.out.println("Du hast eine 3 ");
        } else if (prozent > 44) {
            System.out.println("Du hast eine 4 ");
        } else if (prozent > 26) {
            System.out.println("Du hast eine 5 ");
        } else if (prozent < 27) {
            System.out.println("Du hast eine 6 ");
        }


    }
}