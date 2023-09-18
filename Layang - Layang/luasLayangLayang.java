import java.util.Scanner;

public class luasLayangLayang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Memasukkan panjang diagonal 1 dan diagonal 2
        System.out.print("Masukkan panjang diagonal 1: ");
        double diagonal1 = input.nextDouble();
        System.out.print("Masukkan panjang diagonal 2: ");
        double diagonal2 = input.nextDouble();
        
        // Menghitung luas layang-layang
        double luas = (diagonal1 * diagonal2) / 2;
        
        System.out.println("Luas layang-layang = " + luas);
        
        input.close();
    }
}