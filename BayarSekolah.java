import java.util.Scanner;
public class BayarSekolah {
    
    public static void main(String[] args) {

        String jalurMasuk,namaMhs;
        int pendapatan, DSP, SPP, bulan, totalBayar;

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Nama Mahasiswa: ");
        namaMhs = input.nextLine();

        System.out.println("Masukkan besar pendapatan orang tua:");
        pendapatan = input.nextInt();

        System.out.println("Berapa bulan yang akan dibayar? ");
        bulan = input.nextInt();

        input.nextLine();

        System.out.println("Pilihan jalur masuk:");
        System.out.println(" 1.SBMPTN\n 2. SNMPTN\n 3.Mandiri");
        System.out.println("Masukkan pilihan anda (1/2/3): ");
        jalurMasuk = input.nextLine();

        switch (jalurMasuk) {
            case "1":
                if (pendapatan < 2000000){
                    DSP = 5000000;
                    SPP = 500000;
                } else if (pendapatan >= 2000000 && pendapatan <= 10000000){
                    DSP = 15000000;
                    SPP = 1000000;
        
                } else {
                    DSP = 30000000;
                    SPP = 2000000;
                }
                SPP = bulan*SPP;
                System.out.println("Besar SPP: Rp" + SPP);
                System.out.println("Besar DSP: Rp" + DSP);
                totalBayar = DSP + SPP;
                System.out.println("Total Bayar: RP" + totalBayar);
                break;

                case "2":
                if (pendapatan >= 2000000 && pendapatan
                 <= 10000000){
                    DSP = 7000000;
                    SPP = 500000;
                } else if (pendapatan >= 2000000 && pendapatan <= 10000000){
                    DSP = 17000000;
                    SPP = 1000000;
        
                } else {
                    DSP = 35000000;
                    SPP = 2000000;
                }
                SPP = bulan*SPP;
                System.out.println("Besar SPP: Rp" + SPP);
                System.out.println("Besar DSP: Rp" + DSP);
                totalBayar = DSP + SPP;
                System.out.println("Total Bayar: RP" + totalBayar);
                break;

                case "3":
                if (pendapatan >= 2000000 && pendapatan
                 <= 10000000){
                    DSP = 10000000;
                    SPP = 1000000;
                } else if (pendapatan >= 2000000 && pendapatan <= 10000000){
                    DSP = 25000000;
                    SPP = 2000000;
        
                } else {
                    DSP = 50000000;
                    SPP = 3000000;
                }
                SPP = bulan*SPP;
                System.out.println("Besar SPP: Rp" + SPP);
                System.out.println("Besar DSP: Rp" + DSP);
                totalBayar = DSP + SPP;
                System.out.println("Total Bayar: RP" + totalBayar);
                break;


                
        }




    }
}
