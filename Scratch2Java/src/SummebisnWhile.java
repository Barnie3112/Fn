import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SummebisnWhile {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Summe bis zu welcher Zahl ?");
        int bis = Integer.parseInt(bufferedReader.readLine());
        int Summe = 0;
        int i = 0;
        while (i <= bis) {
            Summe = Summe + i;
            i++;
        }
        System.out.println(Summe);
    }
}

