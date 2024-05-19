package Tugas2;
public class Node {
    int id;
    String judul;
    float rating;
    Node prev, next;

    Node(Node prev, int id, String judul, float rating, Node next) {
        this.prev = prev;
        this.judul = judul;
        this.rating = rating;
        this.id = id; 
        this.next = next;
    }


    
}