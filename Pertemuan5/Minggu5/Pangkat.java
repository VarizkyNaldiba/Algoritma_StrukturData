package Minggu5;

import java.util.Scanner;

public class Pangkat {
    public int nilai, pangkat;
    
    
    public static int PangkatBF(int a, int n ) {
        int hasil = 0;
        for (int i=0; i<n; i++) {
            hasil *= a;
        }
            return hasil;
    }

    public static int PangkatDC (int a, int n) {
        if (n==1) {
            return 1;
        } else {
            if (n%2==1) {
                return (PangkatDC(a,n/2) * PangkatDC(a, n/2) * a);
            } else {
                return (PangkatDC(a, n/2)* PangkatDC(a, n/2));
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
        int nilai = sc.nextInt();
        System.out.println("Masukkan nilai Pangkat : ");
        int pangkat = sc.nextInt();

        }
    }
}
