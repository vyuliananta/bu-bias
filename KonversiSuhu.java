import java.util.Scanner;

public class KonversiSuhu {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("dikonversikan ke?  ");
        char c = (input.nextLine()).charAt(0);
        char z = Character.toUpperCase(c); // Changing Value to UpperCase for uniformity.

        double C, F, R, K;
        switch (z) { // Checking Vowel Character using Switch Case

            case 'R':
            System.out.println("Masukkan suhu dalam celcius: ");
            C = input.nextDouble();
            R = 4.0 / 5.0 *C;
            System.out.println("Nilai reamur =" +R+ "R");

            case 'F':
            System.out.println("Masukkan suhu dalam celcius: ");
            C = input.nextDouble();
            F = 9.0 / 5.0 *C + 32;
            System.out.println("Nilai farenheit =" +F+ "F");

            case 'K':
            System.out.println("Masukkan suhu dalam celcius: ");
            C = input.nextDouble();
            K = C + 273;
            System.out.println("Nilai kelvin =" +K+ "K");


            break; 

            


        }
    }
}
