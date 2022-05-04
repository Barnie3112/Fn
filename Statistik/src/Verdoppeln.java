import java.io.IOException;

public class Verdoppeln {
    public static void main(String[] args) throws IOException {
        System.out.println("geben sie die ursprünglichen arrays ein");
        double[] liste = IO.readDoubleArray(3);
        System.out.println(liste[0]+liste[1]+liste[2]);
        double[] liste2 = new double[liste.length];
        for (int i=0;i<liste.length;i++ ){
            liste2[i]=liste[i]*2;


        }
        System.out.println("Verdoppelte werte");
        System.out.println(liste2[0] + " "+liste2[1] +" "+liste2[2]);
    }}

