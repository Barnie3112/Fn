import java.io.IOException;

public class Quadratsummen {
    public static void main(String[] args) throws IOException {
        System.out.println("Gib eine Ganzazhle ein");
        int n = IO.readInteger();
        int summe = 0;
        for ( int i=1;i*i<=n;i++){
            summe = summe + i*i;
        }
        System.out.println("Die Quadratsumme bis zur Zahl "+n+" lautet "+summe);
    }
}

