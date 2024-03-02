import java.util.Scanner;

class Mahasiswa {
    public String nama;
    public int sc;
    public String kelamin;
    public double ipk;
}

public class LatihanMahasiswa1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa[] mhs = new Mahasiswa[3];
        for (int i = 0; i < mhs.length; i++) {
            mhs[i] = new Mahasiswa();
            System.out.println("Masukkan Data Mahasiswa ke - " + (i + 1));
            System.out.print("Masukkan Nama : ");
            mhs[i].nama = sc.nextLine();
            System.out.print("Masukkan sc : ");
            mhs[i].sc = sc.nextInt();
            sc.nextLine(); // Membersihkan newline dari buffer
            System.out.print("Masukkan Jenis Kelamin : ");
            mhs[i].kelamin = sc.nextLine();
            System.out.print("Masukkan IPK : ");
            mhs[i].ipk = sc.nextDouble();
        }

        for (int i = 0; i < mhs.length; i++) {
            System.out.println("Data Mahasiswa ke - " + (i + 1));
            System.out.println("Nama : " + mhs[i].nama + "\nsc : " + mhs[i].sc +
                    "\nJenis Kelamin : " + mhs[i].kelamin
                    + "\nNilai IPK : " + mhs[i].ipk);
        }

        sc.close();
    }
}
