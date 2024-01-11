import java.util.Scanner;

public class KalkulatorKubus {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double panjang, lebar, tinggi;

        System.out.println("Masukkan panjang");
        panjang = input.nextDouble();
        System.out.println("Masukkan lebar");
        lebar = input.nextDouble();
        System.out.println("Masukkan tinggi");
        tinggi = input.nextDouble();

        double volume = panjang * lebar * tinggi;
        System.out.println("Volume balok = " + volume + "cm3");
    }

    
}
