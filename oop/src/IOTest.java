import java.io.IOException;

import static java.nio.file.Files.readString;

public class IOTest {
    public static void main(String[] args) throws IOException {
        do {
            System.out.println("Geben Sie einen Text ein: ");
            String text = IO.readString();
            System.out.println("Der text lautet:");
            System.out.println(text);
            System.out.println("Gib eine Ganzzahl ein!");
            int eingabe = IO.readInteger();
            System.out.println("Die Zahl lautet:");
            System.out.println(eingabe);
            System.out.println("Gib eine Kommazahl ein!");
            double dzahl = IO.readDouble();
            System.out.println("Die Zahl lautet:");
            System.out.println(dzahl);

            System.out.println("Wollen Sie das Programm wiederholen?");
        }while (IO.readBoolean());

    }
}


