import java.util.Scanner;

public class LuasPP {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Mendeklarasikan variabel untuk menyimpan input dan hasil perhitungan
        int panjang, lebar;
        float luas;

        // Meminta pengguna untuk memasukkan nilai panjang
        System.out.print("Masukkan panjang: ");
        panjang = input.nextInt();

        // Meminta pengguna untuk memasukkan nilai tinggi
        System.out.print("Masukkan lebar: ");
        lebar = input.nextInt();

        // Menghitung luas
        luas = panjang * lebar;

        // Menampilkan hasil luas
        System.out.println("keliling Persegi Panjang adalah " + luas + " cm.");

        // Menutup objek Scanner
        input.close();
    }
}