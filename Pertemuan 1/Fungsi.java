public class Fungsi {
    
    // Fungsi untuk menampilkan pendapatan setiap cabang jika semua bunga habis terjual
    public static int[] hitungPendapatan(int[][] stockBunga, int[] hargaBunga) {
        int[] pendapatanCabang = new int[stockBunga.length];
        
        for (int i = 0; i < stockBunga.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                totalPendapatan += stockBunga[i][j] * hargaBunga[j];
            }
            pendapatanCabang[i] = totalPendapatan;
        }
        return pendapatanCabang;
    }
    
    // Fungsi untuk menampilkan jumlah Stock setiap jenis bunga pada cabang RoyalGarden 4
    public static int[] hitungStockRoyalGarden4(int[][] stockBunga, int[][] penguranganStock) {
        int[] stockRoyalGarden4 = stockBunga[3];
        for (int i = 0; i < stockRoyalGarden4.length; i++) {
            stockRoyalGarden4[i] -= penguranganStock[0][i];
        }
        return stockRoyalGarden4;
    }

    // Main
    public static void main(String[] args) {
        // Data stock bunga dan harga bunga
        int[][] stockBunga = {
            {10, 5, 15, 7}, // RoyalGarden 1
            {6, 11, 9, 12}, // RoyalGarden 2
            {2, 10, 10, 5}, // RoyalGarden 3
            {5, 7, 12, 9}   // RoyalGarden 4
        };
        
        int[] hargaBunga = {75000, 50000, 60000, 10000}; // Harga Aglonema, Keladi, Alocasia, dan Mawar
        
        // Hitung pendapatan setiap cabang jika semua bunga habis terjual
        int[] pendapatanCabang = hitungPendapatan(stockBunga, hargaBunga);
        
        // Tampilkan hasil pendapatan setiap cabang
        for (int i = 0; i < pendapatanCabang.length; i++) {
            System.out.println("Pendapatan RoyalGarden " + (i + 1) + ": Rp " + pendapatanCabang[i]);
        }
        
        // Pengurangan stock untuk cabang RoyalGarden 4
        int[][] penguranganStock = {
            {1, 2, 0, 5}
        };
        
        // Hitung stock setiap jenis bunga pada cabang RoyalGarden 4 setelah pengurangan
        int[] stockRoyalGarden4 = hitungStockRoyalGarden4(stockBunga, penguranganStock);
        
        // Tampilkan hasil stock setiap jenis bunga pada cabang RoyalGarden 4
        System.out.println("\nJumlah Stock setiap jenis bunga pada cabang RoyalGarden 4:");
        System.out.println("Aglonema: " + stockRoyalGarden4[0]);
        System.out.println("Keladi: " + stockRoyalGarden4[1]);
        System.out.println("Alocasia: " + stockRoyalGarden4[2]);
        System.out.println("Mawar: " + stockRoyalGarden4[3]);
    }
}
