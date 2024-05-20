package Quiz2;

public class Node {
    String nama;
    int menang, lap, poin, position;
    Node next;

    public Node(String nama, int menang, int position, int lap, int poin, Node next) {
        this.nama = nama;
        this.menang = menang;
        this.position = position;
        this.lap = lap;
        this.poin = poin;
        this.next = next;
    }
}

