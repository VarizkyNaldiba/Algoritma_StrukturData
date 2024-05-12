package Tugas01;
public class mahasiswa {
    
    node head, tail;
    
    boolean isEmpty() {
        return head == null;
    }
    
    void print() {
        if (!isEmpty()) {
            node tmp = head;
            System.out.print("Isi Linked List : ");
            while (tmp != null) {
                System.out.print(tmp.nama + " ");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list Kosong");
        }
    }
    
    void addFirst(String nama, int nim) {
        node ndInput = new node(nama, nim, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }
    
    void addLast(String nama, int nim) {
        node ndInput = new node(nama, nim, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    
    void insertAfter(int key, String nama, int nim) {
        node ndInput = new node(nama, nim, null);
        node tmp = head;
        while (tmp != null) {
            if (tmp.nim == key) {
                ndInput.next = tmp.next;
                tmp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            tmp = tmp.next;
        }
    }
    
    void insertAt(int index, String nama, int nim) {
        if (index < 0) {
            System.out.println("Index tidak valid!");
            return;
        }
        if (index == 0) {
            addFirst(nama, nim);
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
    
}

