package Minggu5;

import java.util.Scanner;

public class Pangkat {
    public int nilai, pangkat;

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
            png[i] = new Pangkat();
            System.out.println("Masukkan nilai yang hendak di pangkatkan : ");
            png[i].nilai = sc.nextInt();          
            System.out.println("Masukkan nilai Pangkat : ");
            png[i].pangkat = sc.nextInt(); 
        }

        System.out.println("HASIL PANGKAT- BRUTE FORCE");
        for (int i = 0; i < Elemen; i++) {
            int hasilBF = Pangkat.PangkatBF(png[i].nilai, png[i].pangkat);
            System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + hasilBF);
        }

        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER");
        for (int i = 0; i < Elemen; i++) {
            int hasilDC = Pangkat.PangkatDC(png[i].nilai, png[i].pangkat);
            System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + hasilDC);
        }
        sc.close();

    }
}
