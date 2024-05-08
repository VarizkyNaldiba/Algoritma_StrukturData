package Praktikum2;
import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        
        System.out.println("Pilih Menu : ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. Cek Antrean paling belakang");
        System.out.println("0. Exit");
        System.out.println("------------------");
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Kapasitas Queue : ");
        int jumlah = sc.nextInt();
        Queue antri = new Queue(jumlah);
        
        int pilih = 0;
        do {
            System.out.println("Masukkan pilihan : ");
            pilih = sc.nextInt();
            
            switch (pilih) {
                case 1:
                    System.out.println("No Rekening : ");
                    String norek = sc.next();
                    System.out.println("Nama : ");
                    String nama = sc.next();
                    System.out.println("Alamat : ");
                    String alamat = sc.next();
                    System.out.println("Umur : ");
                    int umur = sc.nextInt();
                    System.out.println("Saldo : ");
                    double saldo = sc.nextDouble();
                    sc.nextLine();
                    Nasabah nb = new Nasabah(norek, nama, alamat, umur, saldo);
                    antri.enqueue(nb);
                    break;
                case 2:
                    Nasabah data = antri.dequeue();
                    if (data != null) {
                        System.out.println("Antrian yang keluar : " + data.norek + " " + data.nama + " " + data.alamat + " " + data.umur + " " + data.saldo);
                    }
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);

    }
}

