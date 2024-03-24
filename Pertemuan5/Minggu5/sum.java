package Minggu5;

import java.util.Scanner;

public class sum {
    int jumlahPerusahaan;
    int jumlahBulan;
    double[][] keuntunganPerusahaan;

    sum(int jumlahPerusahaan, int jumlahBulan) {
        this.jumlahPerusahaan = jumlahPerusahaan;
        this.jumlahBulan = jumlahBulan;
        this.keuntunganPerusahaan = new double[jumlahPerusahaan][jumlahBulan];
    }

    double totalBF(double[][] arr) {
        double total = 0;
        for (int i = 0; i < jumlahPerusahaan; i++) {
            for (int j = 0; j < jumlahBulan; j++) {
                total += arr[i][j];
            }
        }
        return total;
    }

    double totalDC(double[][] arr, int l, int r) {
        if (l == r) {
            double total = 0;
            for (int i = 0; i < jumlahPerusahaan; i++) {
                total += arr[i][l];
            }
            return total;
        } else if (l < r) {
            int mid = (l + r) / 2;
            double lsum = totalDC(arr, l, mid);
            double rsum = totalDC(arr, mid + 1, r);
            return lsum + rsum;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.print("Masukkan Jumlah Perusahaan : ");
        int jumlahPerusahaan = sc.nextInt();

        System.out.println("=================================================");
        System.out.println("Program Menghitung Keuntungan Total (satuan juta, misal 5.9)");
        System.out.print("Masukkan Jumlah Bulan : ");
        int jumlahBulan = sc.nextInt();

        sum sm = new sum(jumlahPerusahaan, jumlahBulan); // Menggunakan sum sebagai nama kelas

        System.out.println("=================================================");
        for (int i = 0; i < jumlahPerusahaan; i++) {
            for (int j = 0; j < jumlahBulan; j++) {
                System.out.print("Masukkan keuntungan perusahaan ke-" + (i + 1) + " bulan ke-" + (j + 1) + " = ");
                sm.keuntunganPerusahaan[i][j] = sc.nextDouble();
            }
        }

        System.out.println("===================================================");
        System.out.println("Algoritma Brute Force ");
        System.out.println("Total Keuntungan semua perusahaan selama " + jumlahBulan + " bulan adalah = " + sm.totalBF(sm.keuntunganPerusahaan));
        System.out.println("===================================================");
        System.out.println("Algoritma Divide Conquer ");
        System.out.println("Total keuntungan semua perusahaan selama " + jumlahBulan + " bulan adalah = " + sm.totalDC(sm.keuntunganPerusahaan, 0, jumlahBulan - 1));

        sc.close();
    }
}
