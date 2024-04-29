/**
 * Gudang28
 */
public class Gudang28 {
    Barang28[] tumpukkan;
    int size;
    int top;

    public Gudang28 (int kapasitas) {
        size = kapasitas;
        tumpukkan = new Barang28[size];
        top = -1; 

    }

    public boolean cekKosong () {
        if  (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh () {
        if (top == size - 1) {
            return true;              
        } else {
            return false;
        }
    }

    public void tambahBarang (Barang28 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukkan[top] = brg;
            System.out.println("Barang" + brg.nama + "Berhasil ditambahkan ke Gudang ");            
        } else {
            System.out.println("Gagal ! Tumpukkan Barang di Gudang sudah penuh ");
        }
    }

    public Barang28 ambilBarang() {
        if (!cekKosong()) {
            Barang28 delete = tumpukkan[top];
            top--;
            System.out.println("Barang" + delete.nama + " diambil dari Gudang ");
            return delete;
        } else {
            System.out.println("Tumpukkan barang kosong ");
            return null; 
        }
    }   
    
    public Barang28 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang28 barangTeratas = tumpukkan[top];
            System.out.println("Barang Teratas : " + barangTeratas.nama);
            return barangTeratas;
        } else { 
            System.out.println(" Tumpukkan barang kosong ");
            return null;
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukkan barang di Gudang : ");
            for (int i = 0; i < top; i++) {
                System.out.printf("Kode %d : %s (kategori %s)\n", tumpukkan[i].kode, tumpukkan[i].nama, tumpukkan[i].kategori);
            }
        } else {
            System.out.println("Tumpukkan barang kosong");
        }
    }
}