import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai tugas: ");
        double tugas = input.nextDouble();
        System.out.print("Masukkan nilai kuis: ");
        double kuis = input.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        double uts = input.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        double uas = input.nextDouble();

        if (!BarierNilai(tugas) || !BarierNilai(kuis) || !BarierNilai(uts) || !BarierNilai(uas)) {
            System.out.println("Nilai tidak valid");
            System.exit(0);
        }

        double nilaiAkhir = hitungNilaiAkhir(tugas, kuis, uts, uas);

        String grade = konversiNilai(nilaiAkhir);

        String keterangan = "";

        if (grade.equals("A") || grade.equals("B+") || grade.equals("B") || grade.equals("C+") || grade.equals("C")) {
            keterangan = "LULUS";
        } else {
            keterangan = "TIDAK LULUS";
        }

        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Grade: " + grade);
        System.out.println("Keterangan: " + keterangan);
    }

    public static double hitungNilaiAkhir(double tugas, double kuis, double uts, double uas) {

        return 0.2 * tugas + 0.2 * kuis + 0.3 * uts + 0.4 * uas;
    }

    public static boolean BarierNilai(double nilai) {
        return nilai >= 0 && nilai <= 100;
    }

    public static String konversiNilai(double nilai) {
        
        if ((nilai >= 80) && (nilai <= 100)) {
            return "A";
        } else if ((nilai >= 73) && (nilai < 80)) {
            return "B+";
        } else if ((nilai >= 65) && (nilai < 73)) {
            return "B";
        } else if ((nilai >= 60) && (nilai < 65)) {
            return "C+";
        } else if ((nilai >= 50) && (nilai < 60)) {
            return "C";
        } else if ((nilai >= 39) && (nilai < 50)) {
            return "D";
        } else {
            return "E";
        }
    }
}
