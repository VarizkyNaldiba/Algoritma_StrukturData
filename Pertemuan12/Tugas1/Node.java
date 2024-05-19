package Tugas1;
public class Node {
    int nomor;
    String nama;
    Node prev, next;

    Node(int nomor, Node prev, Node next, String nama) {
        this.nomor = nomor; 
        this.prev = prev;
        this.next = next;
        this.nama = nama;
        
    }


    
}