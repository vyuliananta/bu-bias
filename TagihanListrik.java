import java.util.Scanner;

public class TagihanListrik {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double biayaPemakaian, pemakaian, tarif, biayaTambahan, totalTagihan;

        System.out.println("Input besar pemakaian :");
        pemakaian = input.nextDouble();

        if (pemakaian >=0 && pemakaian <=50);{
            tarif = 100;
        }if (pemakaian >=51 && pemakaian <=150){
            tarif = 150;
        }else if (pemakaian >=151 && pemakaian <=250){
            tarif = 250;
        }else{
            tarif = 300;
        }

        biayaPemakaian = pemakaian * tarif;
        biayaTambahan = 0.2 * biayaPemakaian;

        totalTagihan = biayaPemakaian + biayaTambahan;

        System.out.println("Pemakaian: " + pemakaian + "kWh");
        System.out.println("Total Tagihan: " + totalTagihan);
        


    }
}
