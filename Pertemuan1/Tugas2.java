import java.util.Scanner;

public class Tugas2
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Menghitung Kecepatan, Jarak, dan Waktu");
        System.out.println("=============================================");

        // Meminta pengguna untuk memilih rumus yang akan dihitung
        System.out.println("Pilih rumus yang akan dihitung:");
        System.out.println("1. Kecepatan");
        System.out.println("2. Jarak");
        System.out.println("3. Waktu");
        System.out.print("Masukkan pilihan (1/2/3): ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                hitungKecepatan();
                break;
            case 2:
                hitungJarak();
                break;
            case 3:
                hitungWaktu();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    // Fungsi untuk menghitung kecepatan
    public static void hitungKecepatan() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jarak (s) dalam satuan meter: ");
        double s = scanner.nextDouble();
        System.out.println("Masukkan waktu (t) dalam satuan detik: ");
        double t = scanner.nextDouble();

        double v = s / t;
        System.out.println("Kecepatan (v) = " + v + " m/s");
    }

    // Fungsi untuk menghitung jarak
    public static void hitungJarak() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan kecepatan (v) dalam satuan m/s: ");
        double v = scanner.nextDouble();
        System.out.println("Masukkan waktu (t) dalam satuan detik: ");
        double t = scanner.nextDouble();

        double s = v * t;
        System.out.println("Jarak (s) = " + s + " meter");
    }

    // Fungsi untuk menghitung waktu
    public static void hitungWaktu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jarak (s) dalam satuan meter: ");
        double s = scanner.nextDouble();
        System.out.println("Masukkan kecepatan (v) dalam satuan m/s: ");
        double v = scanner.nextDouble();

        double t = s / v;
        System.out.println("Waktu (t) = " + t + " detik");
    }
}
