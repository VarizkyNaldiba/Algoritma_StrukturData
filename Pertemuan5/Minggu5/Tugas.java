package Minggu5;

import java.util.Scanner;

class Tugas {
    String merk;
    String tipe;
    int tahun;
    int percepatan_tertinggi;
    int tenaga_maksimum;
    
    public Tugas(String merk, String tipe, int tahun, int percepatan_tertinggi, int tenaga_maksimum) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.percepatan_tertinggi = percepatan_tertinggi;
        this.tenaga_maksimum = tenaga_maksimum;
    }
}

class Showroom {
    public static int cariPercepatanTertinggi(Tugas[] mobil, int rendah, int tinggi) {
        if (rendah == tinggi) {
            return mobil[rendah].percepatan_tertinggi;
        }
        
        int tengah = (rendah + tinggi) / 2;
        int kiriMax = cariPercepatanTertinggi(mobil, rendah, tengah);
        int kananMax = cariPercepatanTertinggi(mobil, tengah + 1, tinggi);
        
        if (kiriMax > kananMax) {
            return kiriMax;
        } else {
            return kananMax;
        }
    }

    public static int cariPercepatanTerendah(Tugas[] mobil, int rendah, int tinggi) {
        if (rendah == tinggi) {
            return mobil[rendah].percepatan_tertinggi;
        }
        
        int tengah = (rendah + tinggi) / 2;
        int kiriMin = cariPercepatanTerendah(mobil, rendah, tengah);
        int kananMin = cariPercepatanTerendah(mobil, tengah + 1, tinggi);
        
        if (kiriMin < kananMin) {
            return kiriMin;
        } else {
            return kananMin;
        }
    }

    public static double hitungRataRataTenaga(Tugas[] mobil) {
        int total = 0;
        for (Tugas m : mobil) {
            total += m.tenaga_maksimum;
        }
        return (double) total / mobil.length;
    }
    
    public static void main(String[] args) {
        Tugas[] mobilList = {
            new Tugas("BMW", "M2 Coupe", 2016, 6816, 728),
            new Tugas("Ford", "Fiesta ST", 2014, 3921, 575),
            new Tugas("Nissan", "370Z", 2009, 4360, 657),
            new Tugas("Subaru", "BRZ", 2014, 4058, 609),
            new Tugas("Subaru", "Impreza WRX STI", 2013, 6255, 703),
            new Tugas("Toyota", "AE86 Trueno", 1986, 3700, 553),
            new Tugas("Toyota", "86/GT86", 2014, 4180, 609),
            new Tugas("Volkswagen", "Golf GTI", 2014, 4180, 631)
        };
        
        int percepatanTertinggi = cariPercepatanTertinggi(mobilList, 0, mobilList.length - 1);
        int percepatanTerendah = cariPercepatanTerendah(mobilList, 0, mobilList.length - 1);
        double rataRataTenaga = hitungRataRataTenaga(mobilList);
        
        System.out.println("Percepatan tertinggi: " + percepatanTertinggi);
        System.out.println("Percepatan terendah: " + percepatanTerendah);
        System.out.println("Rata-rata tenaga: " + rataRataTenaga);
    }
}
