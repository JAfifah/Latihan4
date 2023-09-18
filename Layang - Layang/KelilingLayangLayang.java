import java.util.Scanner;

public class KelilingLayangLayang {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Mendeklarasikan variabel untuk menyimpan input dan hasil perhitungan
        int SisiA, SisiB, SisiC, SisiD;
        float keliling;

        // Meminta pengguna untuk memasukkan nilai Sisi A
        System.out.print("Masukkan Sisi A: ");
        SisiA = input.nextInt();

        // Meminta pengguna untuk memasukkan nilai Sisi B
        System.out.print("Masukkan Sisi B: ");
        SisiB = input.nextInt();

        // Meminta pengguna untuk memasukkan nilai Sisi C
        System.out.print("Masukkan Sisi C: ");
        SisiC = input.nextInt();

        // Meminta pengguna untuk memasukkan nilai Sisi D
        System.out.print("Masukkan Sisi D: ");
        SisiD = input.nextInt();

        // Menghitung keliling
        keliling = SisiA + SisiB + SisiC + SisiD;

        // Menampilkan hasil keliling
        System.out.println("keliling Layang-layang adalah " + keliling + " cm.");

        // Menutup objek Scanner
        input.close();
    }
}