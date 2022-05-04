import java.io.IOException;

public class ZweidimensionalesArray {
    public static void main(String[] args) throws IOException {
        System.out.println("wie viele Zeilen willst du?");
        int zeilen= IO.readInteger();
        System.out.println("wie viele spalten willst du?");
int spalten=IO.readInteger();
        int [][] zweiD= new int[zeilen][spalten];

        //Eingabe der Zahlen
for (int i=0; i< zweiD.length;i=i+1){
  for (int j=0;j< zweiD[i].length;j=j+1){
      System.out.println("gib eine Zahl für ["+i+"]"+"["+j+"]");
      zweiD[i][j]= IO.readInteger();
      }
  //Ausgabe der Zeilen
}for (int i=0; i< zweiD.length;i=i+1){
            for (int j=0;j< zweiD[i].length;j=j+1){
                System.out.println(zweiD[i][j]);
            }
        }
int anzahl= IO.readInteger();
int anzahl1 = IO.readInteger();
double [][]doubleD= new double[anzahl][anzahl1];
    }
}
