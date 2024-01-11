import java.util.Scanner;

public class KalkulatorBalok {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double panjang, lebar, tinggi;

        System.out.println("Masukkan panjang balok:");
        panjang = input.nextDouble();
        System.out.println("Masukkan lebar balok:");
        lebar = input.nextDouble();
        System.out.println("Masukkan tinggi balok:");
        tinggi = input.nextDouble();


        double volume = panjang * lebar * tinggi;
        System.out.println("Volume balok : " + volume + "cm3");
        
    }
    
}
