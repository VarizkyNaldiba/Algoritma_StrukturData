package Tugas2;

import java.util.Scanner;

public class FilmMain {
    public static void main(String[] args) throws Exception {
        Film data = new Film();
        Scanner sc = new Scanner(System.in);
        int id, idxKe;
        String judul;
        float rating;
        int pilih;

        do {
            System.out.println(".");
            System.out.println("-------------------------------------------");
            System.out.println("|          DATA FILM LAYAR LEBAR          |");
            System.out.println("-------------------------------------------");
            System.out.println("1. Tambah data [awal]");
            System.out.println("2. Tambah data [akhir]");
            System.out.println("3. Tambah data [index tertentu]");
            System.out.println("4. Hapus data [awal]");
            System.out.println("5. Hapus data [akhir]");
            System.out.println("6. Hapus data [index tertentu]");
            System.out.println("7. Cetak data");
            System.out.println("8. Cari film (berdasarkan ID)");
            System.out.println("9. Urutkan film (berdasarkan rating -desc)");
            System.out.println("10. Keluar");
            System.out.println("-------------------------------------------");
            System.out.print("Masukkan pilihan: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("-------------------------------------------");
                    System.out.println(" Menambahkan data di AWAL");
                    System.out.println("-------------------------------------------");
                    System.out.print("ID Film       : ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Judul Film    : ");
                    judul = sc.nextLine();
                    System.out.print("Rating Film   : ");
                    rating = sc.nextFloat();
                    sc.nextLine();
                    data.addFirst(id, judul, rating);
                    break;
                case 2:
                    System.out.println("-------------------------------------------");
                    System.out.println(" Menambahkan data di AKHIR");
                    System.out.println("-------------------------------------------");
                    System.out.print("ID Film       : ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Judul Film    : ");
                    judul = sc.nextLine();
                    System.out.print("Rating Film   : ");
                    rating = sc.nextFloat();
                    sc.nextLine();
                    data.addLast(id, judul, rating);
                    break;
                case 3:
                    System.out.println("-------------------------------------------");
                    System.out.println(" Menambahkan data di INDEX TERTENTU");
                    System.out.println("-------------------------------------------");
                    System.out.print("Tambah di index ke-: ");
                    idxKe = sc.nextInt();
                    sc.nextLine();
                    System.out.print("ID Film       : ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Judul Film    : ");
                    judul = sc.nextLine();
                    System.out.print("Rating Film   : ");
                    rating = sc.nextFloat();
                    sc.nextLine();
                    data.add(idxKe, id, judul, rating);
                    break;
                case 4:
                    System.out.println("-------------------------------------------");
                    System.out.println(" Menghapus data di AWAL");
                    System.out.println("-------------------------------------------");
                    System.out.println("[INFO:] Film _" + data.getFirst() + "_ telah dihapus.");
                    data.removeFirst();
                    break;
                case 5:
                    System.out.println("-------------------------------------------");
                    System.out.println(" Menghapus data di AKHIR");
                    System.out.println("-------------------------------------------");
                    System.out.println("[INFO:] Film _" + data.getLast() + "_ telah dihapus.");
                    data.removeLast();
                    break;
                case 6:
                    System.out.println("-------------------------------------------");
                    System.out.println(" Menghapus data di INDEX TERTENTU");
                    System.out.println("-------------------------------------------");
                    System.out.print("Pilih index film yang ingin dihapus: ");
                    idxKe = sc.nextInt();
                    sc.nextLine();
                    System.out.println("[INFO:] Film _" + data.get(idxKe) + "_ telah dihapus.");
                    data.remove(idxKe);
                    break;
                case 7:
                    System.out.println("-------------------------------------------");
                    System.out.println(" Cetak Data");
                    System.out.println("-------------------------------------------");
                    data.print();
                    break;
                case 8:
                    System.out.println("-------------------------------------------");
                    System.out.println(" Cari Film berdasarkan ID");
                    System.out.println("-------------------------------------------");
                    System.out.print("Masukkan ID Film yang ingin dicari: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    data.findFilm(id);
                    break;
                case 9:
                    System.out.println("-------------------------------------------");
                    System.out.println(" Urutkan Data Film (descending)");
                    System.out.println("-------------------------------------------");
                    data.sortFilmByRating();
                    break;
            }
        } while (pilih >= 1 && pilih <= 9);

    }
}
