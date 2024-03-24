package Minggu5;

import java.util.Scanner;

public class Pangkat {
    public int nilai, pangkat;

    // Constructor
    public Pangkat(int nilai, int pangkat) {
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    public static int PangkatBF(int a, int n) {
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil *= a;
        }
        return hasil;
    }

    public static int PangkatDC(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            int hasilPangkatSetengah = PangkatDC(a, n / 2);
            if (n % 2 == 1) {
                return hasilPangkatSetengah * hasilPangkatSetengah * a;
            } else {
                return hasilPangkatSetengah * hasilPangkatSetengah;
            }
        }
    }

    // Main Pangkat
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================");
        System.out.println("Masukkan Jumlah Elemen yang di hitung : ");
        int Elemen = sc.nextInt();

        Pangkat[] png = new Pangkat[Elemen];
        for (int i = 0; i < Elemen; i++) {
            System.out.println("Masukkan nilai yang hendak di pangkatkan : ");
            int nilai = sc.nextInt();
            System.out.println("Masukkan nilai Pangkat : ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat(nilai, pangkat);
        }

        System.out.println("Pilih metode perhitungan pangkat:");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        System.out.println("Masukkan pilihan Anda (1/2): ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("HASIL PANGKAT- BRUTE FORCE");
                for (int i = 0; i < Elemen; i++) {
                    int hasilBF = Pangkat.PangkatBF(png[i].nilai, png[i].pangkat);
                    System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + hasilBF);
                }
                break;
            case 2:
                System.out.println("HASIL PANGKAT DIVIDE AND CONQUER");
                for (int i = 0; i < Elemen; i++) {
                    int hasilDC = Pangkat.PangkatDC(png[i].nilai, png[i].pangkat);
                    System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + hasilDC);
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        sc.close();
    }
}
