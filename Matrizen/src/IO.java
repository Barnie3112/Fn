import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {
    public static String readString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String eingabe = br.readLine();
        return eingabe;
    }

    public static int readInteger() throws IOException {
        while (true) {
            try {
                System.out.println("Ganzzahl angeben:");
                String eingabe = IO.readString();
                int zahl = Integer.parseInt(eingabe);
                return zahl;
            } catch (NumberFormatException e) {
                System.out.print("Keine Ganzzahl! Bitte erneut versuchen: ");
            }
        }
    }

    public static double readDouble() throws IOException, NumberFormatException {
        while (true) {
            try {
                System.out.println("");
                String eingabe2 = IO.readString();
                double Zahl2 = Double.parseDouble(eingabe2);
                return Zahl2;
            } catch (NumberFormatException e) {
                System.out.println("Keine Dezahl! Bitte erneut versuchen:");
            }
        }
    }

    public static boolean readBoolean() throws IOException {
        while (true) {
            String eingabe3 = readString();
            if (eingabe3 != null) {
                if (eingabe3.equalsIgnoreCase("j")) {
                    return true;
                } else if (eingabe3.equalsIgnoreCase("ja")) {
                    return true;
                } else if (eingabe3.equalsIgnoreCase("n")) {
                    return false;
                } else if (eingabe3.equalsIgnoreCase("nein")) {
                    return false;
                }
                System.out.println("Falsche eingabe");
            }
        }
    }

    public static String[] readStringArray(int anzahl) throws IOException {
        String[] liste = new String[anzahl];
        for (int i = 0; i < liste.length; i++) {
            System.out.print("Wert " + (i + 1) + ": ");
            liste[i] = readString();
        }
        return liste;
    }

    public static int[] readIntegerArray(int anzahl) throws IOException {
        int[] liste = new int[anzahl];
        for (int i = 0; i < liste.length; i++) {
            System.out.print("Wert " + (i + 1) + ": ");
            liste[i] = readInteger();
        }
        return liste;
    }

    public static double[] readDoubleArray(int anzahl) throws IOException {
        double[] liste = new double[anzahl];
        for (int i = 0; i < liste.length; i++) {
            System.out.print("Wert " + (i + 1) + ": ");
            liste[i] = readDouble();
        }
        return liste;
    }

    public static void writeStringArray(String[] liste) {
        for (int i = 0; i < liste.length; i++) {
            System.out.println("Wert: " + (i + 1) + ": " + liste[i]);
        }
    }

    public static void writeIntegerArray(int[] liste) {
        for (int i = 0; i < liste.length; i++) {
            System.out.println("Wert: " + (i + 1) + ": " + liste[i]);
        }
    }

    public static void writeDoubleArray(double[] liste) {
        for (int i = 0; i < liste.length; i++) {
            System.out.println("Wert: " + (i + 1) + ": " + liste[i]);
        }
    }

public static int [][] readIntegerZweiDArray(int anzahl , int anzahl2) throws IOException {
    int [][] zweiD= new int[anzahl][anzahl2];
    for (int i=0; i< zweiD.length;i=i+1){
        for (int j=0;j< zweiD[i].length;j=j+1){
            zweiD[i][j]= readInteger();
        }
}return zweiD;
}}



