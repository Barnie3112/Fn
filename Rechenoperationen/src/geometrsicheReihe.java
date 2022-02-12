import java.io.IOException;
import java.sql.SQLOutput;

public class geometrsicheReihe {
    public static void main(String[] args) throws IOException {
        System.out.println("Geben Sie eine Ganzazhl ein");
        int n = IO.readInteger();
        double summe = 0;
        for (int i = 1; i <= n; i++){
            double x = 1/ Math.pow(2,i);
            summe = summe+x;
        }
        System.out.println("Die Summe bis zur Zahl "+n+" beträgt "+summe);
    }

}