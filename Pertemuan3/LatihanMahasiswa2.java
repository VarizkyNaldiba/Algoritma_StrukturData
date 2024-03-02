import java.util.Scanner;

class Mahasiswa {
    public String nama;
    public int NIM;
    public String kelamin;
    public double ipk;
}

public class LatihanMahasiswa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa[] mhs = new Mahasiswa[3];
        for (int i = 0; i < mhs.length; i++) {
            mhs[i] = new Mahasiswa();
            System.out.println("Masukkan Data Mahasiswa ke - " + (i + 1));
            System.out.print("Masukkan Nama : ");
            mhs[i].nama = sc.nextLine();
            System.out.print("Masukkan NIM: ");
            mhs[i].NIM = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan Jenis Kelamin : ");
            mhs[i].kelamin = sc.nextLine();
            System.out.print("Masukkan IPK : ");
            mhs[i].ipk = sc.nextDouble();
        }

        double totalIpk = 0;
        for (int i = 0; i < mhs.length; i++) {
            totalIpk += mhs[i].ipk;
        }
        double rataIpk = totalIpk / mhs.length;
        System.out.println("Rata-rata IPK: " + rataIpk);

        double maxIpk = mhs[0].ipk;
        int indexMax = 0;
        for (int i = 1; i < mhs.length; i++) {
            if (mhs[i].ipk > maxIpk) {
                maxIpk = mhs[i].ipk;
                indexMax = i;
            }
        }

        System.out.println("Data Mahasiswa dengan IPK Terbesar:");
        System.out.println("Nama: " + mhs[indexMax].nama);
        System.out.println("sc: " + mhs[indexMax].NIM);
        System.out.println("Jenis Kelamin: " + mhs[indexMax].kelamin);
        System.out.println("Nilai IPK: " + mhs[indexMax].ipk);

        sc.close();
    }
}
