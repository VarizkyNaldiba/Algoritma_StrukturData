package Quiz2;

public class Klasemen {
    public static void main(String[] args) {
        Pembalap[] drivers = Pembalap.pembalap;
        Method data = new Method();
        
        System.out.println("Klasemen pada setiap sirkuit:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("\n sirkuit ke-" + i + ":" );
            data.updateStandings(i, drivers);
            System.out.println();
        }
        System.out.println("\nPuncak klasemen:");
        data.printStandings();
    }
    
    public static class Pembalap {
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



