package Tugas2;

public class Film {
    Node head;
    int size;

    public Film() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int id, String judul, float rating) {
        Node newNode = new Node( null, id, judul, rating, head);
        if (isEmpty()) {
            head = newNode;
        } else {
            head.prev = newNode;
        }
        head = newNode;
        size++;
    }

    public void addLast(int id, String judul, float rating) {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        Node newNode = new Node(current, id, judul, rating, null);
        current.next = newNode;
        size++;
    }

    public void add(int index, int id, String judul, float rating) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai index diluar batas");
        }
        if (index == 0) {
            addFirst(id, judul, rating);
        } else if (index == size) {
            addLast(id, judul, rating);
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            Node newNode = new Node(current, id, judul, rating, current.next);
            current.next.prev = newNode;
            current.next = newNode;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println("ID: " + tmp.id );
                System.out.println("\tJudul film    : " + tmp.judul);
                System.out.println("\tRating film   : " + tmp.rating);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Data kosong!");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Data masih kosong, tidak dapat mengahpus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Data masih kosong, tidak dapat dihapus!");
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks diluar batas");
        }
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            current.next.prev = current;
            size--;
        }
    }

    public String getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong!");
        }
        return head.judul;
    }

    public String getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong!");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.judul;
    }

    public String get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Linked List kosong!");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.judul;
    }

    public void findFilm(int id) {
        if (!isEmpty()) {
            Node tmp = head;
            int index = 0;
            while (tmp != null) {
                if (tmp.id == id) {
                    System.out.println("Ditemukan pada Node ke-" + index);
                    System.out.println("ID: " + tmp.id);
                    System.out.println("\tJudul film    : " + tmp.judul);
                    System.out.println("\tRating film   : " + tmp.rating);
                    return;
                }
                tmp = tmp.next;
                index++;
            }
            System.out.println("Film dengan ID " + id + " tidak ditemukan.");
        } else {
            System.out.println("Data kosong!");
        }
    }

    public void sortFilmByRating() {
        if (size > 1) {
            boolean berubah;

            do {
                Node current = head;
                Node previous = null;
                berubah = false;

                while (current != null) {
                    Node next = current.next;
                    if (next != null && current.rating > next.rating) {
                        berubah = true;
                        current.next = next.next;
                        next.next = current;
                        if (previous != null) {
                            previous.next = next;
                        } else {
                            head = next;
                        }
                        previous = next;
                    } else {
                        previous = current;
                    }
                    current = current.next;
                }
            } while (berubah);
        }
    }
}
