import java.util.Scanner;

class Kerucut {
    public int jariJari;
    public int sisiMiring;

    public Kerucut(int jariJari, int sisiMiring) {
        this.jariJari = jariJari;
        this.sisiMiring = sisiMiring;
    }

    public double luasPermukaan() {
        return Math.PI * jariJari * (jariJari + Math.sqrt(Math.pow(sisiMiring, 2) + Math.pow(jariJari, 2)));
    }

    public double volume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(jariJari, 2) * sisiMiring;
    }
}

class Limas {
    public int sisiAlas;
    public int tinggi;

    public Limas(int sisiAlas, int tinggi) {
        this.sisiAlas = sisiAlas;
        this.tinggi = tinggi;
    }

    public double luasPermukaan() {
        return Math.pow(sisiAlas, 2) + 4 * (sisiAlas * tinggi) / 2;
    }

    public double volume() {
        return (1.0 / 3.0) * Math.pow(sisiAlas, 2) * tinggi;
    }
}

class Bola {
    public int jariJari;

    public Bola(int jariJari) {
        this.jariJari = jariJari;
    }

    public double luasPermukaan() {
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }

    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    }
}

public class LatihanBangunRuang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Kerucut 

        System.out.print("Masukkan jumlah kerucut: ");
        int jml = sc.nextInt();
        Kerucut[] kArray = new Kerucut[jml];

        for (int i=0; i<jml; i++){
            System.out.println("Kerucut ke-"+(i+1));
            System.out.print("Masukkan jari-jari: ");
            int jariJari = sc.nextInt();
            System.out.print("Masukkan sisi miring: ");
            int sisiMiring = sc.nextInt();
            kArray[i] = new Kerucut(jariJari, sisiMiring);
        }

        for (int i=0; i<jml; i++){
            System.out.println("\nKerucut ke-"+(i+1));
            System.out.print("Luas Permukaan: " + kArray[i].luasPermukaan());
            System.out.print("\nVolume: "+ kArray[i].volume());
        }

        //Limas

        System.out.println(" ");
        System.out.print("\nMasukkan jumlah limas: ");
        jml = sc.nextInt();
        Limas[] lArray = new Limas[jml];

        for (int i=0; i<jml; i++){
            System.out.println("Limas ke-"+(i+1));
            System.out.print("Masukkan sisi alas: ");
            int sisiAlas = sc.nextInt();
            System.out.print("Masukkan tinggi: ");
            int tinggi = sc.nextInt();
            lArray[i] = new Limas(sisiAlas, tinggi);
        }
    
        for (int i=0; i<jml; i++){
            System.out.println("\nLimas ke-"+(i+1));
            System.out.print("Luas Permukaan: "+ lArray[i].luasPermukaan());
            System.out.print("\nVolume: "+ lArray[i].volume());
        }

        //Bola

        System.out.println(" ");
        System.out.print("\nMasukkan jumlah bola: ");
        jml = sc.nextInt();
        Bola[] bArray = new Bola[jml];

        for (int i=0; i<jml; i++){
            System.out.println("Bola ke-"+(i+1));
            System.out.print("Masukkan jari-jari: ");
            int jariJari = sc.nextInt();
            bArray[i] = new Bola(jariJari);
        }

        for (int i=0; i<jml; i++){
            System.out.println("\nBola ke-"+(i+1));
            System.out.print("Luas Permukaan: "+ bArray[i].luasPermukaan());
            System.out.print("\nVolume: "+ bArray[i].volume());
        }

    }
}
