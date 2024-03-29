package Jobsheet6.Latihan;

public class HotelService {
    Hotel listH[] = new Hotel[5];
    int idx;

    // Method Tambah
    void tambah(Hotel Ht) {
        if (idx < listH.length) {
            listH[idx] = Ht;
            idx++;
        } else {
            System.out.println("[Data sudah penuh]");
        }
    }

    // Method Tampil
    void tampil() {
        for (Hotel Ht : listH) {
            if (Ht != null) {
                Ht.tampil();
                System.out.println("-------------------------");
            }
        }
    }

    // Method Bubble Sort
    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listH[j].bintang > listH[j + 1].bintang) {
                    Hotel tmp = listH[j];
                    listH[j] = listH[j + 1];
                    listH[j + 1] = tmp;
                }
            }
        }
    }

    // Method Selection Sort
    void selectionSort() {
        for (int i = 0; i < idx - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (listH[j].harga < listH[minIdx].harga) {
                    minIdx = j;
                }
            }
            Hotel temp = listH[minIdx];
            listH[minIdx] = listH[i];
            listH[i] = temp;
        }
    }

    // Method Insertion Sort
    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Hotel temp = listH[i];
            int j = i - 1;
            while (j >= 0 && listH[j].bintang > temp.bintang) {
                listH[j + 1] = listH[j];
                j--;
            }
            listH[j + 1] = temp;
        }
    }
}
