import java.io.IOException;

public class help {
    public static void main(String[] args) throws IOException {


    System.out.println("wie viele unterschiedliche Artikel haben sie im Lager");
    int a = IO.readInteger();
        System.out.println("Erfassen sie die genaue artikelbezeichnung");
    String[] liste = IO.readStringArray(a);

        for (int i = 0; i < liste.length; i++) {
        System.out.println(liste[i]);
    }}}