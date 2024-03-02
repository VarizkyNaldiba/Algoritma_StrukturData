import java.util.Scanner;

class Mahasiswa {
public String nama;
public int nim;
public String kelamin;
public double ipk;
}

public class LatihanMahasiswa1 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Scanner nim = new Scanner(System.in);
Scanner ipouble = new Scanner(System.in);

Mahasiswa[] mhs = new Mahasiswa[3];
for (int i = 0; i < mhs.length; i++) {
mhs[i] = new Mahasiswa();
System.out.println("Masukkan Data Mahasiswa ke - " + (i + 1));
System.out.print("Masukkan Nama : ");
mhs[i].nama = sc.nextLine();
System.out.print("Masukkan NIM : ");
mhs[i].nim = nim.nextInt();
System.out.print("Masukkan Jenis Kelamin : ");
mhs[i].kelamin = sc.nextLine();
System.out.print("Masukkan IPK : ");
mhs[i].ipk = ipouble.nextDouble();
}

for (int i = 0; i < mhs.length; i++) {
System.out.println("Data Mahasiswa ke - " + (i + 1));
System.out.println("Nama : " + mhs[i].nama + "\nNIM : " + mhs[i].nim +
"\nJenis Kelamin : " + mhs[i].kelamin
+ "\nNilai IPK : " + mhs[i].ipk);
}
sc.close();
nim.close();
ipouble.close();
}
}