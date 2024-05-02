import java.util.Scanner;

/**
 * Utama28
 */
public class Utama28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kapasitas Gudang: ");
        int kapasitas = scanner.nextInt();
        scanner.nextLine();
        
        Gudang28 gudang = new Gudang28(kapasitas);

        boolean exit = false; 

        // Menu
        while (!exit) { 
            System.out.println("\nMenu");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang ");
            System.out.println("3. Tampilkan tumpukan barang ");
            System.out.println("4. Lihat Barang Teratas");
            System.out.println("5. Lihat Barang Terbawah");
            System.out.println("6. Cari Barang");
            System.out.println("7. Keluar");
            System.out.print("Pilih Operasi : ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode Barang : ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama Barang : ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nama Kategori : ");
                    String kategori = scanner.nextLine();
                    Barang28 barangBaru = new Barang28(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                case 6:
                    System.out.print("Cari berdasarkan [1. Kode] atau [2. Nama]? ");
                    int searchBy = scanner.nextInt();
                    scanner.nextLine(); 
                    if (searchBy == 1) {
                        System.out.print("Masukkan kode: ");
                        int byKode = scanner.nextInt();
                        gudang.cariBarangByKode(byKode);
                    } 
                    if (searchBy == 2) {
                        System.out.print("Masukkan nama: ");
                        String byNama = scanner.nextLine();
                        gudang.cariBarangByNama(byNama);
                    } else {
                        continue;
                    }
                    break; 
                case 7:
                    exit = true; 
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid, Coba Lagi");
            }
        }

        scanner.close(); 
    }
}
