package Tugas02;

public class mhsMain {
    public static void main(String[] args) {
        mahasiswa linkedList = new mahasiswa();
        linkedList.addLast(112, "Prita");
        linkedList.print();
        linkedList.insertAt(3, "Sari", 115);
        linkedList.print();
        linkedList.addFirst(111, "Anton");
        linkedList.print();
        linkedList.insertAfter(112, 114, "Doni");
        linkedList.print();
        linkedList.addLast(113, "Yusuf");
        linkedList.print();

        System.out.println(" ");
        System.out.println("Data pada index ke-1 :");
        System.out.println("Nama : " + linkedList.getDataNama(1) );
        System.out.println("NIM : " + linkedList.getDataNim(1));
        System.out.println("Data 3 berada pada index ke-" + linkedList.indexOf(112));
        System.out.println(" ");

        linkedList.print();
        linkedList.remove(115);
        linkedList.print();
        linkedList.removeAt(0);
        linkedList.print();
        linkedList.removeFirst();
        linkedList.print();
        linkedList.removeLast();
        linkedList.print();
    }
}


