import java.io.IOException;

public class LK3_Jannis {
    public static void main(String[] args) throws IOException {
        String text = new String();
        do {
            System.out.println("wie viele werte wollen sie Eingeben");

            int a = IO.readInteger();
            double[] liste = IO.readDoubleArray(a);
            for (int i = 0; i < liste.length; i++) {
                System.out.println("Wert" + i + " :" + liste[i]);
            } double max = liste[0];
            double varianz = 0;
            for (double maximalerwert : liste) {

                if (max < maximalerwert) {
                    max = maximalerwert;
                }
                varianz = liste[0];

                for (int i = 1; i <= liste.length; i++) {

                }
                double min = liste[0];
                for (double minimalwert : liste) {

                    if (min > minimalwert) {
                        min = minimalwert;
                    }
                }
                double s = Math.sqrt(varianz);
                double summe = 0;
                for (int i = 0; i < liste.length; i++) {
                    summe = summe + liste[i];
                }
                summe = summe / liste.length;
                System.out.println(min);
                System.out.println(max);
                System.out.println(summe);
                System.out.println(varianz);
                System.out.println(s);
            }

        } while (text.equalsIgnoreCase("j"));

    }
}

