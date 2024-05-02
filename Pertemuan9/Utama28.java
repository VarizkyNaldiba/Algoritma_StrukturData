import java.util.Scanner;

/**
 * Utama28
 */
public class Utama28 {
    public static void main(String[] args) {
        Gudang28 gudang = new Gudang28(7);
        Scanner scanner = new Scanner(System.in);

        // Menu
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang ");
            System.out.println("3. Tampilkan tumpukan barang ");
            System.out.println("4. Keluar");
            System.out.println("Pilih Operasi : ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println(" Masukkan kode Barang : ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Masukkan nama Barang : ");
                    String nama = scanner.nextLine();
                    System.out.println("Masukkan nama Kategori : ");
                    String kategori = scanner.nextLine();
                    Barang28 barangBaru = new Barang28(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    System.out.println(" Masukkan kode Barang : ");
                    kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Masukkan nama Barang : ");
                    nama = scanner.nextLine();
                    System.out.println("Masukkan nama Kategori : ");
                    kategori = scanner.nextLine();
                    barangBaru = new Barang28(kode, nama, kategori);
                    gudang.ambilBarang();
                case 3:
                System.out.println(" Masukkan kode Barang : ");
                kode = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Masukkan nama Barang : ");
                nama = scanner.nextLine();
                System.out.println("Masukkan nama Kategori : ");
                kategori = scanner.nextLine();
                barangBaru = new Barang28(kode, nama, kategori);
                gudang.tampilkanBarang();
                case 4:
                    break;
                default:
                System.out.println("Pilihan Tidak Valid, Try Again");
            }
        }
    }
}