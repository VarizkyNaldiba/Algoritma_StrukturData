public class Buku28 {

    String judul, pengarang;
    int halaman, stok, harga, jml;

    void tampilInformasi() {
        System.out.println("Judul :" + judul);
        System.out.println("Pengarang :" + pengarang);
        System.out.println("Jumlah Halaman : " + halaman);
        System.out.println("Sisa Stok: " + stok);
        System.out.println("Harga :" + harga);
    }

    void terjual(int jml) {
        this.jml = jml;
        do {
            if (stok > 0) {
                stok -= jml;
            }
            System.out.println("Stok habis");
        } while (jml > 0);
    }

    void restock(int jml) {
        stok -= jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    public Buku28() {

    }

    public Buku28(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void hitungHargaTotal() {
        int total = harga * jml;
        System.out.println("Harga Total: " + total);
    }

    double hitungDiskon(double total) {
        double diskon = 0;

        if (total > 150000) {
            diskon = total * 0.12;
        } else if (total >= 75000 && total <= 150000) {
            diskon = total * 0.05;
        } else {
            System.out.println("Anda tidak mendapatkan diskon.");
        }

        return diskon;
    }

    void hitungHargaBayar() {
        int total = harga * jml;
        double diskon = hitungDiskon(total);
        double hargaBayar = total - diskon;
        System.out.println("Harga Bayar Setelah Diskon: " + hargaBayar);
    }
}
