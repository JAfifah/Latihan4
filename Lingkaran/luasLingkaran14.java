import java.util.Scanner;

public class luasLingkaran14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Mendeklarasikan variabel untuk menyimpan input dan hasil perhitungan
        int jari;
        float luas;

        // Meminta pengguna untuk memasukkan nilai panjang
        System.out.print("Masukkan Jari-Jari: ");
        jari = input.nextInt();

        // Menghitung luas
        luas = 3.14f * (jari * jari);

        // Menampilkan hasil Luas
        System.out.println("Luas Lingkaran adalah " + luas + " cm.");

        // Menutup objek Scanner
        input.close();
    }
}