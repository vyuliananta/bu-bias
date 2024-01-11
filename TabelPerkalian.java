import java.util.Scanner;

public class TabelPerkalian {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan bilangan kelipatan perkalian! ");
        int batas;
        int kelipatan = input.nextInt();
        System.out.println("Masukkan batas: ");
        batas = input.nextInt();



    for( int x = 1; x <=batas; x++)
    {
        System.out.println( kelipatan + " x " + x + "=" + (kelipatan*x));


    }
    }
}
