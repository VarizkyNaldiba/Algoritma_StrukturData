import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] matakuliah = { "Pancasila", "KTI", "CTPS", "Math", "Eng", "DasPro", "PrkDasPro", "K3" };
        int[] sks = new int[matakuliah.length];
        int[] nilai = new int[matakuliah.length];

        System.out.println("====");
        System.out.println("IP Calculate Program ");
        System.out.println("====");

        for (int i = 0; i < matakuliah.length; i++) {

            
            System.out.print("Masukkan Nilai " + matakuliah[i] + " : ");
            nilai[i] = sc.nextInt();

            if (nilai[i] < 0 || nilai[i] > 100) {
                System.out.println("Nilai tidak VALID");
            }

        }

        int jumlahMatKul = matakuliah.length;

        String[] nilaiHuruf = new String[matakuliah.length];
        double[] bobotNilai = new double[matakuliah.length];

        for (int i = 0; i < jumlahMatKul; i++) {
            if (nilai[i] > 80) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.0;
            } else if (nilai[i] > 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilai[i] > 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3;
            } else if (nilai[i] >= 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilai[i] >= 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2;
            } else if (nilai[i] >= 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0;
            }
        }

        int jumSKS = 0;
        double jumNilaiMatkul = 0;

        System.out.println("Masukkan SKS per MATKUL");
        for (int i = 0; i < sks.length; i++) {
            System.out.print("Masukkan SKS " + matakuliah[i] + " : ");
            sks[i] = sc.nextInt();

            jumNilaiMatkul += bobotNilai[i] * sks[i];
            jumSKS += sks[i];
        }

        double Ip = jumNilaiMatkul / jumSKS;

        System.out.printf("| %-20s| %-10s\t| %-15s| %-20s |%n", "MATA KULIAH", " NILAI ", "NILAI HURUF",
                "BOBOT NILAI");

        for (int i = 0; i < nilai.length; i++) {
            System.out.printf("| %-20s| %-10d\t| %-15s| %-20.2f |%n", matakuliah[i], nilai[i], nilaiHuruf[i],
                    bobotNilai[i]);
        }

        System.out.printf("IP : %.2f%n  ", Ip);
    }
}
