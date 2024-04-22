import java.util.Scanner;

public class UTS {
    String nama;
    int nim;

    UTS(String n, int m) {
        nama = n;
        nim = m;
    }

    static class UTSsorting {

        void printArray(int[] data) {
            for (int i = 0; i < data.length; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
// Sorting Method
        void bubbleSort(int[] data) {
            int n = data.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (data[j] > data[j + 1]) {
                        int temp = data[j];
                        data[j] = data[j + 1];
                        data[j + 1] = temp;
                    }
                }
            }
        }
// Searching Methode
        int binarySearch(int[] data, int x) {
            int left = 0, right = data.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (data[mid] == x)
                    return mid;

                if (data[mid] < x)
                    left = mid + 1;
                else
                    right = mid - 1;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nama: Varizky Naldiba Rimra");
        System.out.println("NIM : 2341720243");
        int[] data = {46, 26, 8, 45, 7, 10, 21, 47, 8, 23, 49, 45, 38, 11, 43, 0, 12};
        System.out.println("=========================================");

        System.out.println("Array sebelum diurutkan:");
        UTSsorting sorting = new UTSsorting();
        sorting.printArray(data);
        System.out.println("=========================================");

        sorting.bubbleSort(data);

        System.out.println("\nArray setelah diurutkan dengan Bubble Sort:");
        sorting.printArray(data);
        System.out.println("=========================================");

        System.out.print("\nMasukkan nilai yang ingin dicari: ");
        int searchKey = scanner.nextInt();
        scanner.close();

        int result = sorting.binarySearch(data, searchKey);
        if (result != -1)
            System.out.println("\nElemen " + searchKey + " ditemukan di index " + result);
        else
            System.out.println("\nElemen " + searchKey + " tidak ditemukan dalam array.");
        System.out.println("=========================================");
        
    }
}
