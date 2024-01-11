import java.util.Scanner;

public class UH1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String namaKasir;
        System.out.println("Masukkan Nama Kasir: ");
        namaKasir = input.nextLine();

        double totalHargaPesanan, pajak, diskon;
        System.out.println("Masukkan Harga: ");
        totalHargaPesanan = input.nextDouble();

        double tip;
        System.out.println("Masukkan Besar Tip: ");
          tip = input.nextDouble();

        System.out.println("Total Harga: " + totalHargaPesanan);

        pajak = 0.1 * totalHargaPesanan;
        System.out.println("Pajak: " + pajak);
        diskon = 0.05 * totalHargaPesanan;
        System.out.println("Diskon Spesial: " + diskon);
        tip = 10000 + totalHargaPesanan;
        System.out.println("Tip: " + tip);


        double totalBayar;
        totalBayar = totalHargaPesanan + pajak + tip - diskon;
        System.out.println("Total bayar: " + totalBayar );
        
        
        
        System.out.println("Kasir: " + namaKasir);

    }
}
