import java.io.IOException;

public class Dsds {
    public static void main(String[] args) throws IOException {
        System.out.println("wie viele Kandidaten sind noch im rennen?");
        int a= IO.readInteger();
        System.out.println("verfassen sie die prozentuale Veteilung des Votings");
        int[] liste = IO.readIntegerArray(a);

        for (int i = 0;i< liste.length;i++){
            System.out.println("Kanidat "+(i+1)+": " + liste[i]);
        }
        System.out.println("Ergebnis");
    for (int i=0;i< liste.length;i++){
        System.out.println("Kanidat"+(i+1)+": ");
        for (int k =0;k<liste[i];k++){
            System.out.print("*");
        }
        System.out.println(" "+liste[i]+ ".0%");
        System.out.println();

    }

    }
}
