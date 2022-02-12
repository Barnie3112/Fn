import java.io.IOException;

public class Temperaturmessungen2 {
    public static void main(String[] args) throws IOException {
        double[] zahlen = new double[7];
        for (int i = 0; i < zahlen.length; i++) {
            System.out.println("Geben Sie eine Temperatur für den Tag " + (i + 1) + " ein!");
            zahlen[i] = IO.readDouble();
        }
        double max = 0;
        for (double temperaturmax : zahlen) {

            if (max < temperaturmax) {
                max = temperaturmax;
            }

            double min = 0;
            for (double temperaturmin : zahlen) {

                if (min > temperaturmin) {
                    max = temperaturmin;
                }
                double differenz = 0;
                double z1 = 0;
                double z2 = 0;
                for(double tdifferenz : zahlen){


                }

            }
            double superzahl = zahlen[1] + zahlen[2];
            System.out.println("Mittelwert: " + (zahlen[0] + zahlen[1] + zahlen[2] + zahlen[3] + zahlen[4] + zahlen[5] + zahlen[6]) / 7);
            System.out.println("Maximale Temperatur: " + max);
            System.out.println("Minimale Temperatur: " + min);
            System.out.println("Spannweite: "+(max-min));


        }

    }
}

