package Pertemuan3;
import java.util.Scanner;

public class ArrayObject {
    public static void main(String[] args) {
        PersegiPanjang[] ppArray = new PersegiPanjang[3];
        Scanner sc = new Scanner(System.in);

        for (int i = ; i < 3; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Masukkan Panjang : " );
            ppArray[i].panjang = sc.nextInt();
            System.out.println("Masukkan Lebar : ");
            ppArray[i].lebar = sc.nextInt();
            
        }

        System.out.println("Persegi Panjang ke - 1, panjang : " + ppArray[0].panjang + ", lebar : " + ppArray[0].lebar);
        System.out.println("Persegi Panjang ke - 2, panjang : " + ppArray[1].panjang + ", lebar : " + ppArray[1].lebar);
        System.out.println("Persegi Panjang ke - 3, panjang : " + ppArray[2].panjang + ", lebar : " + ppArray[2].lebar);
    }
}


