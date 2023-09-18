import java.util.Scanner;

public class KelilingPP14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Mendeklarasikan variabel untuk menyimpan input dan hasil perhitungan
        int panjang, lebar;
        float keliling;

        // Meminta pengguna untuk memasukkan nilai panjang
        System.out.print("Masukkan panjang: ");
        panjang = input.nextInt();

        // Meminta pengguna untuk memasukkan nilai tinggi
        System.out.print("Masukkan lebar: ");
        lebar = input.nextInt();

        // Menghitung keliling
        keliling = 2 * (panjang + lebar);

        // Menampilkan hasil keliling
        System.out.println("keliling Persegi Panjang adalah " + keliling + " cm.");

        // Menutup objek Scanner
        input.close();
    }
}