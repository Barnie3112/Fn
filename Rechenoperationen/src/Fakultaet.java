import java.io.IOException;

public class Fakultaet {
    public static void main(String[] args) throws IOException {
        System.out.println("Gib eine Ganzzahl ein!");
        int n = IO.readInteger();
        int fakultaet = 1;
        for (int i = 1; i <= n; i++){
            fakultaet = fakultaet * i;
            System.out.println("Die Fakultät der Zahl "+i+" beträgt "+fakultaet);
        }

    }
}

