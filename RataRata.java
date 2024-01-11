import java.util.Scanner;

public class RataRata {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        double ratarata, total = 0, nilai;

        for (int x = 1; x <=5; x++){
            System.out.println("Masukkan nilai mapel: ");
            nilai = input.nextDouble();

            total = total + nilai;
        }

        ratarata = total/ 5;

        System.out.println("Rata-rata nilai: " + ratarata);
    }
}

