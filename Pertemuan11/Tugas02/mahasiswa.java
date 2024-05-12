package Tugas02;

public class mahasiswa {
    node head, tail;
    
    boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    void print () {
        if (!isEmpty()) {
            int i = 1;
            node tmp = head;
            System.out.print("Isi Linked List : ");
            while (tmp != null) {
                System.out.print(tmp.nama + " ");
                tmp = tmp.next;
                i++;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(int nim, String nama) {
        node ndInput = new node(nama, nim, null );
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }
    
    void addLast(int nim, String nama) {
        node ndInput = new node(nama, nim, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input, String nama) {
        node ndInput = new node(nama, input, null);
        node temp = head;
        do {
            if (temp.nim == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next != null) {
                    tail = ndInput;
                    break;
                }
            }
            temp = temp.next;
        } while (temp == null);
    }

    void insertAt(int index, String nama, int nim) {
        if (index < 0) {
            System.out.println("Index tidak valid!");
            return;
        }
        if (index == 0) {
            addFirst(nim, nama);
            return;
        }
        node ndInput = new node(nama, nim, null);
        node tmp = head;
        for (int i = 0; i < index - 1 && tmp != null; i++) {
            tmp = tmp.next;
        }
        if (tmp == null) {
            System.out.println("Index melebihi ukuran linked list!");
        } else {
            ndInput.next = tmp.next;
            tmp.next = ndInput;
            if (ndInput.next == null) {
                tail = ndInput;
            }
        }
    }

    int indexOf(int key) {
        node tmp = head;
        int index = 0;
        while (tmp != null && tmp.nim != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            return 1;
        } else {
            return index;
        }
    }
    
    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong," + " tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            node temp = head;
            while (temp.next == null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    

    void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else {
            if (head.nim == key) {
                removeFirst();
            } else {
                node temp = head;
                while (temp.next != null) {
                    if (temp.next.nim == key) {
                        temp.next = temp.next.next;
                        if (temp.next == null) {
                            tail = temp;
                        }
                        break;
                    }
                    temp = temp.next;
                }
            }
        }
    }

    void removeAt (int index) {
        if (index == 0) {
            removeFirst();
        } else {
            node temp = head;
            for (int i = 0; i <= index; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }

    int getDataNim(int index) {
        node temp = head;

        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.nim;
    }

    String getDataNama(int index) {
        node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.nama;
    }
}