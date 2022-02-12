import java.io.IOException;

public class Schaltjahre {
    public static void main(String[] args) throws IOException {
        String text;
        do {
            System.out.println("Gib ein Anfangsjahr ein!");
            int a = IO.readInteger();
            System.out.println("Gib ein Ende ein!");
            int e = IO.readInteger();
            int i = 0;
            for (i = a; i <= e; i++) {
                if (i % 4 == 0)
                    if (i % 100 != 0 || i % 400 == 0)
                        System.out.println(i);

            }
            System.out.println("Wollen Sie weitere Schaltjahre berechnen? [J]");
            text = IO.readString();

        } while (text.equalsIgnoreCase("j"));

    }
}
