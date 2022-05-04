import java.io.IOException;

public class Tonsignal {
    public static void main(String[] args) throws IOException {
        System.out.println("Normale tonsignale");
        int[] ton = IO.readIntegerArray(12);
        int[] tong = new int[12];
tong[0]=(ton[0]+ton[1])/2;
tong[11]=(ton[10]+ton[11])/2;
        for (int i = 1; i < ton.length -1; i++) {
             tong[i]=(ton[i-1]+ton[i+1]+ton[i])/3;

        }
        System.out.println("Ursprungsignal");
        for (int i=0; i< ton.length;i++){
            System.out.print(ton[i]+" ");
        }
        System.out.println();
        System.out.println("Geglättetes Signal");
        for (int i=0; i< tong.length;i++){
            System.out.print(tong[i]+" ");
        }
    }
}
