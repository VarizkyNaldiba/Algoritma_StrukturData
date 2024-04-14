import java.util.Scanner;

public class Buku {
    String kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stock;

    public Buku(String k, String j, int t, String p, int s) {
        kodeBuku = k;
        judulBuku = j;
        tahunTerbit = t;
        pengarang = p;
        stock = s;
    }

    void tampilDataBuku() {
        System.out.println("===============");
        System.out.println("Kode Buku = " + kodeBuku);
        System.out.println("Judul Buku = " + judulBuku);
        System.out.println("Tahun = " + tahunTerbit);
        System.out.println("Pengarang = " + pengarang);
        System.out.println("Stock = " + stock);
    }
}

class PencarianBuku28 {
    Buku listBK[] = new Buku[5];
    int idx;

    void tambah(Buku m) {
        if (idx < listBK.length) {
            listBK[idx] = m;
            idx++;
        } else {
            System.out.println("Data Sudah Penuh");
        }
    }

    void tampil() {
        for (Buku m : listBK) {
            if (m != null) {
                m.tampilDataBuku();
                System.out.println("---------------------");
            }
        }
    }

    int FindSeqSearchKode(String cari) {
        int posisi = -1;
        for (int j = 0; j < listBK.length; j++) {
            if (listBK[j] != null && listBK[j].kodeBuku.equals(cari)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    int FindSeqSearchJudul(String cari) {
        int count = 0;
        for (int j = 0; j < idx; j++) {
            if (listBK[j] != null && listBK[j].judulBuku.equals(cari)) {
                count++;
            }
        }
        return count;
    }

    int FindBinarySearchKode(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = left + (right - left) / 2;
            if (cari.equals(listBK[mid].kodeBuku)) {
                return mid;
            } else if (cari.compareTo(listBK[mid].kodeBuku) < 0) {
                return FindBinarySearchKode(cari, left, mid - 1);
            } else {
                return FindBinarySearchKode(cari, mid + 1, right);
            }
        }
        return -1;
    }

    int FindBinarySearchJudul(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = left + (right - left) / 2;
            if (cari.equals(listBK[mid].judulBuku)) {
                return mid;
            } else if (cari.compareTo(listBK[mid].judulBuku) < 0) {
                return FindBinarySearchJudul(cari, left, mid - 1);
            } else {
                return FindBinarySearchJudul(cari, mid + 1, right);
            }
        }
        return -1;
    }

    void insertionSortJudul() {
        for (int i = 1; i < idx; i++) {
            Buku key = listBK[i];
            int j = i - 1;
            while (j >= 0 && listBK[j].judulBuku.compareTo(key.judulBuku) > 0) {
                listBK[j + 1] = listBK[j];
                j = j - 1;
            }
            listBK[j + 1] = key;
        }
    }
}

class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        PencarianBuku28 data = new PencarianBuku28();
        int jumBuku = 5;

        System.out.println("------------------------------");
        System.out.println("Masukkan data Buku Secara urut dari kodeBuku Terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("=================");
            System.out.print("Kode Buku \t :");
            String kodeBuku = s.nextLine();
            System.out.print("Judul Buku \t : ");
            String judulBuku = s.nextLine();
            System.out.print("Tahun Terbit \t : ");
            int tahunTerbit = s.nextInt();
            s.nextLine(); // membersihkan karakter newline
            System.out.print("Pengarang \t : ");
            String pengarang = s.nextLine();
            System.out.print("Stock \t \t : ");
            int stock = s.nextInt();
            s.nextLine(); // membersihkan karakter newline

            Buku m = new Buku(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }

        System.out.println("=========================");
        System.out.println("Data Keseluruhan Buku : ");
        data.tampil();

        System.out.println("__________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Judul buku yang dicari : ");
        System.out.print("Judul Buku : ");
        String cariJudul = s.nextLine();
        System.out.println("=============================");
        System.out.println("Menggunakan Sequential Search");
        int jumlahJudulSeq = data.FindSeqSearchJudul(cariJudul);
        if (jumlahJudulSeq > 1) {
            System.out.println("Peringatan: Lebih dari satu buku dengan judul yang sama ditemukan!");
        } else if (jumlahJudulSeq == 1) {
            int posisiJudul = data.FindSeqSearchKode(cariJudul);
            if (posisiJudul >= 0) {
                System.out.println("Buku ditemukan di posisi: " + posisiJudul);
                data.listBK[posisiJudul].tampilDataBuku();
            } else {
                System.out.println("Buku tidak ditemukan.");
            }
        } else {
            System.out.println("Buku tidak ditemukan.");
        }

        System.out.println("==================================");
        System.out.println("Menggunakan Binary Search");
        data.insertionSortJudul();
        int posisiJudulBin = data.FindBinarySearchJudul(cariJudul, 0, jumBuku - 1);
        if (posisiJudulBin >= 0) {
            System.out.println("Buku ditemukan di posisi: " + posisiJudulBin);
            data.listBK[posisiJudulBin].tampilDataBuku();
        } else {
            System.out.println("Buku tidak ditemukan.");
        }
    }
}
