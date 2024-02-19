public class Buku28 {
    
        String judul, pengarang;
        int halaman, stok, harga;

        Buku28() {
            
        }
        void tampilInformasi() {
        
        System.out.println("Judul :" + judul);
        System.out.println("Pengarang :" + pengarang);
        System.out.println("Jumlah Halaman : " + halaman);
        System.out.println("Sisa Stok: " + stok);
        System.out.println("Harga :" + harga);
    }

    void terjual (int jml) {
        do {
            if (stok > 0 ) {
                stok -= jml;
            } continue;

        } while (jml > 0);
    }

    void restock (int jml) {
        stok -= jml;
        
    }
    void gantiHarga (int hrg) {
        harga = hrg;
    }

    public Buku28(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
        
    }

}
