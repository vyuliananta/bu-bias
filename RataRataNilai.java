import java.util.Scanner;

public class RataRataNilai {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String Agama, Pkn, bIndo, bInggris, Mtk; 
        
        System.out.println("Masukkan nilai Agama: ");
        Agama = input.nextLine();

        System.out.println("Masukkan nilai Pkn: ");
        Pkn = input.nextLine();

        System.out.println("Masukkan nilai Bahasa Indonesia: ");
        bIndo = input.nextLine();

        System.out.println("Masukkan nilai Bahasa Inggris: ");
        bInggris = input.nextLine();

        System.out.println("Masukkan nilai Matematika: ");
        Mtk = input.nextLine();
    }
}
