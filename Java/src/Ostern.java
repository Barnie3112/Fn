import java.io.IOException;

public class Ostern {
    public static void main(String[] args) throws IOException {
        System.out.println("Gib eine Jahreszahl ein!");
        int Jahreszahl = IO.readInteger();
        int a = Jahreszahl % 19;
        int b = Jahreszahl % 4;
        int c = Jahreszahl % 7;
        int m = 0;
        int n = 0;
        if (Jahreszahl >= 1583 && Jahreszahl <= 1699) {
            m = 23;
            n = 2;
        } else if (Jahreszahl >= 1700 && Jahreszahl <= 1799) {
            m = 23;
            n = 3;
        } else if (Jahreszahl >= 1800 && Jahreszahl <= 1899) {
            m = 23;
        } else if (Jahreszahl >= 1900 && Jahreszahl <= 2099) {
            m = 24;
            n = 5;
        } else if (Jahreszahl >= 2100 && Jahreszahl <= 2199) {
            m = 24;
            n = 5;
        } else
            m = 25;

        int d = (19 * a + m) % 30;
        int e = (2 * b + 4 * c + 6 * d + n) % 7;
        int März = 22 + d + e;
        int April = d + e - 9;
        if (März <= 31) {
            System.out.println("Ostetrn ist am " + März + "ten März");
            System.out.println();
        } else
            System.out.println("Ostern ist am " + April + "ten April");

    }
}