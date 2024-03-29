package Jobsheet6.Latihan;

import java.util.Scanner;

public class HotelMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HotelService list = new HotelService();

        Hotel Ht1 = new Hotel("Hotel A", "Aceh", 500000, (byte) 5);
        Hotel Ht2 = new Hotel("Hotel B", "Surabaya", 400000, (byte) 1);
        Hotel Ht3 = new Hotel("Hotel D", "Bogor", 300000, (byte) 4);
        Hotel Ht4 = new Hotel("Hotel V", "Jakarta", 200000, (byte) 2);
        Hotel Ht5 = new Hotel("Hotel R", "Medan", 100000, (byte) 3);

        list.tambah(Ht1);
        list.tambah(Ht2);
        list.tambah(Ht3);
        list.tambah(Ht4);
        list.tambah(Ht5);

        System.out.println(" PILIHAN ");
        list.tampil();
        System.out.println("1. Data Hotel Setelah Sorting (Harga)");
        System.out.println("2. Data Hotel Setelah Sorting (Bintang)");
        System.out.println();
        System.out.print("Masukkan pilihan: ");
        int opsi = sc.nextInt();

        switch (opsi) {
            case 1:
                list.selectionSort();
                System.out.println("Data Hotel Setelah Sorting (Harga):");
                list.tampil();
                break;

            case 2:
                list.bubbleSort();
                System.out.println("Data Hotel Setelah Sorting (Bintang):");
                list.tampil();
                break;

            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        sc.close();
    }
}
