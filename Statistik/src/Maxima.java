import java.io.IOException;

public class Maxima {
    public static void main(String[] args) throws IOException {
        double[] liste = IO.readDoubleArray(4);
        IO.writeDoubleArray(liste);
        double max;
        double max2;
        if (liste[0]>liste[1]) {
            max = liste[0];
            max2 = liste[1];
        }else {
            max=liste[1];
            max2=liste[0];
        }
        for (int i = 2; i<liste.length;i++){
            if (liste[i] >max){
                max2=max;
                max= liste[i];
            }
            else if (liste[i]>max2){
                max2=liste[i];
            }
        }
        System.out.println("Der Größte wer ist"+max);





        System.out.println("der zweit größte wert"+max2);
}}
