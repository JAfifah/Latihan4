import java.util.Scanner;

public class luasSegi3SikuSiku {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Mendeklarasikan variabel untuk menyimpan input dan hasil perhitungan
        int alas, tinggi;
        float luas;

        // Meminta pengguna untuk memasukkan nilai alas
        System.out.print("Masukkan Alas: ");
        alas = input.nextInt();

        // Meminta pengguna untuk memasukkan nilai tinggi
        System.out.print("Masukkan Tinggi: ");
        tinggi = input.nextInt();

        // Menghitung luas
        luas = 0.5f * alas * tinggi;

        // Menampilkan hasil luas
        System.out.println("Luas Segitiga Siku-Siku adalah " + luas + " cm.");

        // Menutup objek Scanner
        input.close();
    }
}