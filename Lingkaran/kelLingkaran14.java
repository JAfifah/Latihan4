import java.util.Scanner;

public class kelLingkaran14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Mendeklarasikan variabel untuk menyimpan input dan hasil perhitungan
        int jari;
        float keliling;

        // Meminta pengguna untuk memasukkan nilai panjang
        System.out.print("Masukkan Jari-Jari: ");
        jari = input.nextInt();

        // Menghitung keliling
        keliling = 2 * 3.14f * jari;

        // Menampilkan hasil keliling
        System.out.println("keliling Lingkaran adalah " + keliling + " cm.");

        // Menutup objek Scanner
        input.close();
    }
}