import java.util.Scanner;

public class DapurValen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalBayar = 0;

        String namaKasir;
        System.out.println("Nama Kasir: ");
        namaKasir = input.nextLine();

        System.out.println("Selamat datang di Foodpedia ^^ ");

        System.out.println("Menu Makanan Berat:");
        System.out.println("1. Nasi Goreng Special - Rp. 25,000");
        System.out.println("2. Ayam Bakar Madu- Rp. 30,000");
        System.out.println("3. Mie Goreng Nyemek- Rp. 20,000");
        System.out.println("4. Soto Madura- Rp. 17,000");
        System.out.println("Menu Camilan:");
        System.out.println("5. Potato Wedges- Rp. 18,000");
        System.out.println("6. Tahu Cabe Garam- Rp. 12,000:");
        System.out.println("7. Cireng- Rp. 7,000");
        System.out.println("Menu Minuman:");
        System.out.println("8. Teh Manis - Rp. 5,000");
        System.out.println("9. Jus Jeruk - Rp. 10,000");
        while (true) {
            System.out.print("Masukkan nomor menu yang diinginkan (0 untuk selesai): ");
            int pilihan = input.nextInt();

            if (pilihan == 0) {
                break;
            } else if (pilihan >= 1 && pilihan <= 9) {
                System.out.print("Masukkan jumlah yang dipesan: ");
                int jumlah = input.nextInt();
                double harga = 0;

                switch (pilihan) {
                    case 1:
                        harga = 25000;
                        break;
                    case 2:
                        harga = 30000;
                        break;
                    case 3:
                        harga = 20000;
                        break;
                    case 4:
                        harga = 5000;
                        break;
                    case 5:
                        harga = 18000;
                        break;
                    case 6:
                        harga = 12000;
                        break;
                    case 7:
                        harga = 7000;
                        break;
                    case 8:
                        harga = 5000;
                        break;
                    case 9:
                        harga = 10000;
                        break;
                }

                double subtotal = harga * jumlah;
                totalBayar += subtotal;
                System.out.println("Subtotal: Rp. " + subtotal);
            } else {
                System.out.println("Pilihan menu tidak valid.");
            }
        }

        System.out.println("Total Pembayaran: Rp. " + totalBayar);
        System.out.println("Terima kasih telah makan di Restoran XYZ!");
    }
}
