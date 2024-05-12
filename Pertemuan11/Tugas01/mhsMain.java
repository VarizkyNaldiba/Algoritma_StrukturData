package Tugas01;

public class mhsMain {
    public static void main(String[] args) {
        mahasiswa linkedList = new mahasiswa();
        linkedList.addLast("Doni", 114);
        linkedList.print();
        linkedList.insertAt(0, "Yusuf", 113);
        linkedList.print();
        linkedList.addFirst("Anton", 111);
        linkedList.print();
        linkedList.insertAfter(111, "Prita", 112);
        linkedList.print();
        linkedList.addLast("Sari", 115);
        linkedList.print();
    }
}
