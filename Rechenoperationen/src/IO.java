import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String readString() throws IOException {
        String text = br.readLine();
        return text;
    }

    public static int readInteger() throws IOException {
        while (true) {
            try {
                String eingabe = IO.readString();
                int zahl = Integer.parseInt(eingabe);
                return zahl;
            } catch (NumberFormatException d) {
                System.out.println("Keine Ganzzahl! Bitte erneut erfassen");
            }

        }
    }

    public static double readDouble() throws IOException {
        while (true) {
            try {
                String eingabe = IO.readString();
                double dzahl = Double.parseDouble(eingabe);
                return dzahl;
            } catch (NumberFormatException e) {
                System.out.println("Keine Kommazahl! Bitte erneut erfassen");
            }

        }
    }

    public static boolean readBoolean() throws IOException {
        while (true) {
            String eingabe = IO.readString();
            if (eingabe != null) {
                if (eingabe.equalsIgnoreCase("j")) {
                    return true;
                } else if (eingabe.equalsIgnoreCase("ja")) {
                    return true;
                } else if (eingabe.equalsIgnoreCase("nein")) {
                    return false;
                } else if (eingabe.equalsIgnoreCase("n")) {
                    return false;
                }
                System.out.println("Faslche Eingabe");

            }
        }
    }

}
