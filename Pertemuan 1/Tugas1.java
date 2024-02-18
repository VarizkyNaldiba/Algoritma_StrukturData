import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        // Array KODE berisi kode plat mobil
        char[] KODE = {'a', 'b', 'd', 'e', 'f', 'g', 'h', 'l', 'n', 't'};

        // Array KOTA berisi nama kota yang berpasangan dengan kode plat mobil
        char[][] KOTA = {
            {'B', 'a', 'n', 't', 'e', 'n', '\0', '\0', '\0', '\0', '\0', '\0'},
            {'J', 'a', 'k', 'a', 'r', 't', 'a', '\0', '\0', '\0', '\0', '\0'},
            {'B', 'a', 'n', 'd', 'u', 'n', 'g', '\0', '\0', '\0', '\0', '\0'},
            {'C', 'i', 'r', 'e', 'b', 'o', 'n', '\0', '\0', '\0', '\0', '\0'},
            {'B', 'o', 'g', 'o', 'r', '\0', '\0', '\0', '\0', '\0', '\0', '\0'},
            {'P', 'e', 'k', 'a', 'l', 'o', 'n', 'g', 'a', 'n', '\0', '\0'},
            {'S', 'e', 'm', 'a', 'r', 'a', 'n', 'g', '\0', '\0', '\0', '\0'},
            {'S', 'u', 'r', 'a', 'b', 'a', 'y', 'a', '\0', '\0', '\0', '\0'},
            {'M', 'a', 'l', 'a', 'n', 'g', '\0', '\0', '\0', '\0', '\0', '\0'},
            {'T', 'e', 'g', 'a', 'l', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
        };

        // Meminta input kode plat nomor dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char input = scanner.next().charAt(0);

        String kota = cariKota(input, KODE, KOTA);

        if (kota != null) {
            System.out.println("Nama kota untuk kode plat nomor '" + input + "' adalah: " + kota);
        } else {
            System.out.println("Kode plat nomor tidak ditemukan.");
        }
    }

    // Fungsi untuk mencari nama kota berdasarkan kode plat nomor
    public static String cariKota(char kode, char[] KODE, char[][] KOTA) {
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kode) {
                char[] namaKota = new char[KOTA[i].length];
                for (int j = 0; j < KOTA[i].length; j++) {
                    namaKota[j] = KOTA[i][j];
                }
                return new String(namaKota);
            }
        }
        return null;
    }
}
