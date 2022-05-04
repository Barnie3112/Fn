import java.io.IOException;

public class SuchenInArray {
    public static void main(String[] args) throws IOException {
        double[] liste = IO.readDoubleArray(5);
        System.out.println("Nach welcher Zahl wollen Sie suchen: ");
        double zahl = IO.readDouble();
        for (double i : liste) {
            if (zahl == i) {
                System.out.println("Treffer");
            } else System.out.println("Niete");
        }
    }
}