import java.util.Scanner;

public class Restoran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalBiaya = 0.0;
        boolean selesai = false;

        System.out.println("Selamat Datang di Foodpedia ^^");
        System.out.println("Silahkan pilih menu di bawah ini!");

        while (!selesai) {
            System.out.println("Menu Restoran:");
            System.out.println("1. Bakso - Rp. 20,000");
            System.out.println("2. Mie Ayam - Rp. 15,000");
            System.out.println("3. Es Jeruk - Rp. 5,000");
            System.out.println("4. Es - Rp. 4,000");
            System.out.println("5. Selesai");

            System.out.print("Pilih Menu: (Ketik 5 jika Selesai) ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    totalBiaya += 20000;
                    break;
                case 2:
                    totalBiaya += 15000;
                    break;
                case 3:
                    totalBiaya += 5000;
                    break;
                case 4:
                    totalBiaya += 4000;
                    break;
                case 5:
                    selesai = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        System.out.print("Total biaya: Rp. " + totalBiaya);
        System.out.print("\nMasukkan jumlah uang yang diberikan: Rp. ");
        double uangDiberikan = input.nextDouble();

        if (uangDiberikan == totalBiaya) {
            System.out.println("Uang Anda pas.");
        } else if (uangDiberikan < totalBiaya) {
            System.out.println("Maaf, uang Anda kurang.");
        } else {
            double kembalian = uangDiberikan - totalBiaya;
            System.out.println("Kembalian Anda: Rp. " + kembalian);
        }

        input.close();



    }
}
