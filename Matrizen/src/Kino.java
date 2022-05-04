import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kino {
    public static String[][] erzeugeSaal() throws IOException {
        System.out.println("wie viele Reihen willst du?");
        int reihen = IO.readInteger();
        System.out.println("wie viele Plätze willst du?");
        int plätze = IO.readInteger();
        String[][] saal = new String[reihen][plätze];
        for (int i = 0; i < saal.length; i++) {
            for (int j = 0; j < saal[i].length; j++) {
                saal[i][j] = "O";
            }
        }
        return saal;
    }

    public static void anzeigenSaal(String[][] saal) {
        for (int i = 0; i < saal.length; i = i + 1) {
            for (int j = 0; j < saal[i].length; j = j + 1) {
                System.out.print(saal[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void reservierenPlatz(String[][]saal) throws IOException {
        System.out.println("In welcher Reihe wollen sie sitzen?");
    int reihe = IO.readInteger();
        System.out.println("Auf welchen Platz in der "+reihe+" wollen sie sitzen");
        int platz =IO.readInteger();
       if ( saal[reihe-1][platz-1]== "X"){
           System.out.println("der Platz ist belegt");
       }else  {
           saal[reihe-1][platz-1]= "x";
       }
    }

    public static void stonierereservierung(String[][]saal) throws IOException {
        System.out.println("In welcher Reihe haben sie reserviert?");
        int reihe = IO.readInteger();
        System.out.println("welchen Platz haben sie in der "+reihe+" reserviert?");
        int platz =IO.readInteger();
        if ( saal[reihe-1][platz-1]== "O" ){
            System.out.println("Für diesen Platz liegt uns keine reservierung vor!");
        }else  {
            saal[reihe-1][platz-1]= "O";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        String text1;

        String[][] saal = erzeugeSaal();
        do {
            System.out.println("Reservieren =R");
            System.out.println("Stornieren =S");
            String text = bufferedReader.readLine();


            if (text.equalsIgnoreCase("R")) {

                anzeigenSaal(saal);
                reservierenPlatz(saal);
                anzeigenSaal(saal);
            }
            if (text.equalsIgnoreCase("S")) {
                anzeigenSaal(saal);
                stonierereservierung(saal);
                anzeigenSaal(saal);
            }


            System.out.println("Willst du noch eine reservierung oder stornierung durchführen");
            text1 = bufferedReader.readLine();
        } while (text1.equalsIgnoreCase("ja"));

    }
}
