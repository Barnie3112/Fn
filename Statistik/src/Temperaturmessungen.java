import java.io.IOException;

public class Temperaturmessungen {
    public static void main(String[] args) throws IOException {
        System.out.println("Gib eine Temperatur ein!");
        double t1 = IO.readDouble();
        System.out.println("Gib eine Temperatur ein!");
        double t2 = IO.readDouble();
        System.out.println("Gib eine Temperatur ein!");
        double t3 = IO.readDouble();
        System.out.println("Gib eine Temperatur ein!");
        double t4 = IO.readDouble();
        System.out.println("Gib eine Temperatur ein!");
        double t5 = IO.readDouble();
        System.out.println("Gib eine Temperatur ein!");
        double t6 = IO.readDouble();
        System.out.println("Gib eine Temperatur ein!");
        double t7 = IO.readDouble();
        double Summe = (t1 + t2 + t3 + t4 + t5 + t6 + t7);
        System.out.println("Der Mittelwert beträgt" + Summe / 7.0);
        double max = t1;
        if (max < t2) {
            max = t2;
        }
        if (max <= t3) {
            max = t3;
        }
        if (max <= t4) {
            max = t4;
        }
        if (max <= t5) {
            max = t5;
        }
        if (max <= t6) {
            max = t6;
        }
        if (max <= t7) {
            max = t7;
        }
        System.out.println("Die Höchsttempertatur beträgt" + max);
    }
}
