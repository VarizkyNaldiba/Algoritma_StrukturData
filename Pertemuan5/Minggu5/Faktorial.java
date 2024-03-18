package Minggu5;

import java.util.Scanner;

public class Faktorial {
  public int nilai;

  Faktorial(int nilai) {
    this.nilai = nilai;
  }

  static int FaktorialBF(int n) {
    int fakto = 1;
    for (int i = 1; i <= n; i++) {
      fakto *= i;
    }
    return fakto;
  }
  

  static int FaktorialDC(int n) {
    if (n == 1) {
      return 1;
    } else {
      int fakto = n * FaktorialDC(n - 1);
      return fakto;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("-----------------");
    System.out.println("Masukkan Jumlah Elemen : ");
    int iJml = sc.nextInt();

    Faktorial[] fk = new Faktorial[iJml];
    for (int i = 0; i < iJml; i++) {
      System.out.println("Masukkan nilai data ke-" + (i + 1) + " : ");
      int iNilai = sc.nextInt();
        fk[i] = new Faktorial(iNilai);
    }

    System.out.println("Hasil - Brute Force");
    for (int i = 0; i < iJml; i++) {
      System.out.println("Hasil Perhitungan menggunakan Brute Force adalah " + fk[i].FaktorialBF(fk[i].nilai));
    }

    System.out.println("Hasil - DIVIDE AND CONQUER");
    for (int i = 0; i < iJml; i++) {
      System.out.println("Hasil Perhitungan menggunakan Divide and Conquer adalah " + fk[i].FaktorialDC(fk[i].nilai));
    }
  }
}
