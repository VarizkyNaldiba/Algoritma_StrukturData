package Quiz2;

public class pembalap {
    public static Pembalap[] pembalap = {
            new Pembalap("Lewis Hamilton", 10, 1),
            new Pembalap("George Russell", 8, 2),
            new Pembalap("Charles Leclerc", 7, 3),
            new Pembalap("Carlos Sainz Jr", 6, 4),
            new Pembalap("Max Verstappen", 5, 5),
            new Pembalap("Sergio Perez", 4, 6),
            new Pembalap("Lando Norris", 3, 7),
            new Pembalap("Oscar Piastri", 2, 8),
            new Pembalap("Pierre Gasly", 1, 9),
            new Pembalap("Esteban Ocon", 0, 10),
    };

    public static class Pembalap {
        public String nama;
        public int menang;
        public int position;

        public Pembalap(String nama, int menang, int position) {
            this.nama = nama;
            this.menang = menang;
            this.position = position;
        }
    }


}
