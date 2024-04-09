package TestSearching.P7;

import java.util.Scanner;

public class Buku {
    int kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stock;    



public Buku(int k, String j, int t, String p, int s) {
    kodeBuku = k;
    judulBuku = j;
    tahunTerbit = t;
    pengarang = p;
    stock = s;

}

void tampilDataBuku()  {
    System.out.println("===============");
    System.out.println("Kode Buku = " + kodeBuku);
    System.out.println("judul Buku =  " + judulBuku );
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
            System.out.println(" Data Sudah Penuh");
        }
    }
    void tampil() {
        for (Buku m : listBK) {
            m.tampilDataBuku();
            System.out.println("---------------------");
            }
        }
    int FindSeqSearch (int cari) {
        int posisi = -1 ; 
        for (int j = 0; j < listBK.length; j++) {
            if (listBK[j].kodeBuku == cari) {
                posisi = j;
                break;
            }
        }
        return posisi; 
        }
    
    void tampilPosisi(int cari, int pos) {
        if(pos!= -1) {
            System.out.println(" Data : " + cari + " ditemukan pada indeks " + pos);

        } else { 
            System.out.println(" Data " + cari + " Tidak Ditemukan ");
        }
    }

    void tampilData (int x, int pos){
        if (pos != -1) {
            System.out.println("Kode Buku \t : " + x );
            System.out.println("Judul \t\t : " + listBK[pos].judulBuku);
            System.out.println("Tahun Terbit\t : " + listBK[pos].tahunTerbit);
            System.out.println("Pengarang \t\t : " + listBK[pos].pengarang);
            System.out.println("Stock  \t : " + listBK[pos].stock);
        } else {
            System.out.println(" Data " + x + " Tidak Ditemukan");
        }        
    }
}

 class main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku28 data = new PencarianBuku28();
        int jumBuku = 5;

        System.out.println("------------------------------");
        System.out.println(" Masukkan data Buku Secara urut dari kodeBuku Terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("=================");
            System.out.print(" Kode Buku \t :");
            int kodeBuku = s.nextInt();
            System.out.print("Judul Buku \t : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t : ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t : ");
            String pengarang =  s1.nextLine();
            System.out.print(" Stock \t \t : ");
            int stock = s.nextInt();

            Buku m = new Buku(kodeBuku, judulBuku, tahunTerbit, pengarang, stock );
            data.tambah(m);

        }
        System.out.println("=========================");
        System.out.println(" Data Keseluruhan Mahasiswa : ");

        System.out.println("-----------------------");
        System.out.println("Data Keseluruhan Buku : ");
        data.tampil();

        System.out.println("__________________________");
        System.out.println("__________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Kode buku yang dicari : ");
        System.out.println("Kode Buku : ");
        int cari =  s.nextInt();
        System.out.println("Menggunakan Sequential Search");
        int posisi  = data.FindSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
    }
}


