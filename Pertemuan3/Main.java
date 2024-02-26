import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kerucut = new Scanner(System.in);
        Scanner Bola = new Scanner(System.in);
        Scanner LimasS4 = new Scanner(System.in);

        // Kerucut
        System.out.println("Masukkan jumlah Kerucut : ");
        int jumlahKerucut = kerucut.nextInt();
        for (int i = 0; i < jumlahKerucut; i++) {

            System.out.println("Masukkan jari-jari Kerucut " + (i + 1) + " : ");
            double jariJariKerucut = kerucut.nextDouble();

            System.out.println("Masukkan sisi miring Kerucut " + (i + 1) + " : ");
            double sisiMiringKerucut = kerucut.nextDouble();

            double luasPermukaanKerucut = Math.PI * jariJariKerucut * (jariJariKerucut + sisiMiringKerucut);
            double volumeKerucut = (1/3) * Math.PI * jariJariKerucut * jariJariKerucut * sisiMiringKerucut;

            System.out.println("Luas permukaan Kerucut " + (i + 1) + " : " + luasPermukaanKerucut);
            System.out.println("Volume Kerucut " + (i + 1) + " : " + volumeKerucut);
        }

        // Limas Segi Empat
        System.out.println("Masukkan jumlah Limas Segi Empat : ");
        int jumlahLimas = LimasS4.nextInt();
        for (int i = 0; i < jumlahLimas; i++) {

            System.out.println("Masukkan panjang sisi alas Limas " + (i + 1) + " : ");
            double sisiAlasLimas = LimasS4.nextDouble();

            System.out.println("Masukkan tinggi Limas " + (i + 1) + " : ");
            double tinggiLimas = LimasS4.nextDouble();

            double luasPermukaanLimas = sisiAlasLimas * sisiAlasLimas + 4 * (sisiAlasLimas * tinggiLimas / 2);
            double volumeLimas = (1/3) * sisiAlasLimas * sisiAlasLimas * tinggiLimas;

            System.out.println("Luas permukaan Limas " + (i + 1) + " : " + luasPermukaanLimas);
            System.out.println("Volume Limas " + (i + 1) + " : " + volumeLimas);
        }

        // Bola
        System.out.println("Masukkan jumlah Bola : ");
        int jumlahBola = Bola.nextInt();
        for (int i = 0; i < jumlahBola; i++) {

            System.out.println("Masukkan jari-jari Bola " + (i + 1) + " : ");
            double jariJariBola = Bola.nextDouble();

            double luasPermukaanBola = 4 * Math.PI * jariJariBola * jariJariBola;
            double volumeBola = (4/3) * Math.PI * jariJariBola * jariJariBola * jariJariBola;

            System.out.println("Luas permukaan Bola " + (i + 1) + " : " + luasPermukaanBola);
            System.out.println("Volume Bola " + (i + 1) + " : " + volumeBola);
        }
    }
}
