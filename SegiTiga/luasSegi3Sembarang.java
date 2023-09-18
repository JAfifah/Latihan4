import java.util.Scanner;

public class luasSegi3Sembarang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Memasukkan panjang sisi-sisi segitiga
        System.out.print("Masukkan panjang sisi a: ");
        double a = input.nextDouble();
        System.out.print("Masukkan panjang sisi b: ");
        double b = input.nextDouble();
        System.out.print("Masukkan panjang sisi c: ");
        double c = input.nextDouble();
        
        // Menghitung semi-perimeter (setengah dari keliling)
        double s = (a + b + c) / 2;
        
        // Menghitung luas segitiga menggunakan rumus Heron
        double luas = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        
        System.out.println("Luas segitiga = " + luas);
        
        input.close();
    }
}