import java.io.IOException;

public class summen {
    public static void main(String[] args) throws IOException {
        System.out.println("wie viele zahlen sind zuerfassen?");

        int anzahl = IO.readInteger();
        int liste[] = IO.readIntegerArray(anzahl);
        int summeq = 0;
        int summeu = 0;
        int mengeq = 0;
        int mengeu = 0;
        for (int s : liste) {
            if (s % 2 == 0) {
                summeq = summeq + s;
                mengeq = mengeq + 1;
            }
            if (s % 2 != 0) {
                summeu = summeu + s;
                mengeu = mengeu + 1;
            }
            System.out.println("Grade zahlen ");
            System.out.println("Anzahl=" + mengeq);
            System.out.println("summe" + summeq);
            System.out.println("Ungrade Zahlen");
            System.out.println("Anzahl" + mengeu);
            System.out.println("summe" + summeu);
        }
    }}