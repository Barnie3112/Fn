import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Summebisn {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Summe bis zu welcher Zahl ?");
        int bis = Integer.parseInt(bufferedReader.readLine());
        int Summe = 0;

        for (int i = 1; i <= bis; i++) {
            Summe = Summe + i;
        }
        System.out.println(Summe);
    }
}
