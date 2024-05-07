import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.print("Masukkan pilihan : ");
        System.out.println("=====================");
        System.out.println("Masukkan kapasitas queue : ");
        int n = sc.nextInt();
        
        Queue q = new Queue(n);
        
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
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
                        break;
                    }
                case 3:
                    q.print();
                    break;
                case 4:
                    q.peek();
                    break;
                case 5:
                    q.clear();
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        } while (pilih != 6);
    }
}


