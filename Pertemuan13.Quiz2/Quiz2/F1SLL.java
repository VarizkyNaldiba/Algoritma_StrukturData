public class F1SLL {

    Node head;

    public void addPembalap(Pembalap pembalap) {
        Node newNode = new Node(pembalap);
        if (head == null) {
            head = newNode; 
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void printPembalap() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data.nomor + "\t" + current.data.nama + "\t" + "\t" + current.data.poin);
            current = current.next;
        }
    }

    public void sortPoin() {
        Node current = head;
        Node nextNode;
        Pembalap temp;
        while (current != null) {
            nextNode = current.next;
            while (nextNode != null) {
                if (current.data.poin < nextNode.data.poin) {
                    temp = current.data;
                    current.data = nextNode.data;
                    nextNode.data = temp;
                }
                nextNode = nextNode.next;
            }
            current = current.next;
        }
    }
    
}

