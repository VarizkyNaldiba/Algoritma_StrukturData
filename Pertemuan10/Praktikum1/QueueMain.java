package Praktikum1;
import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan kapasitas queue : ");
        int n = sc.nextInt();
        
        Queue q = new Queue(n);
        
        do {
            menu(q);
        } while (true);
    }
    
    public static void menu(Queue q) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("6. Exit");
        System.out.println("Masukkan pilihan : ");
        System.out.println("=====================");
        
        int pilih = sc.nextInt();
        switch (pilih) {
            case 1:
                System.out.print("Masukkan data Baru : ");
                int dataMasuk = sc.nextInt();
                q.enqueue(dataMasuk);
                break;
            case 2:
                int dataKeluar = q.dequeue();
                if (dataKeluar != 0) {
                    System.out.println("Data yang dikeluarkan: " + dataKeluar);
                }
                break;
            case 3:
                q.print();
                break;
            case 4:
                q.peek();
                break;
            case 5:
                q.clear();
                break;
            case 6:
                System.exit(0);
            default:
                System.out.println("Pilihan tidak ada");
                break;
        }
    }
}