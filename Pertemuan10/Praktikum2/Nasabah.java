package Praktikum2;

public class Nasabah {
    String norek, nama, alamat;
    int umur;
    double saldo;

    public Nasabah(String norek, String nama, String alamat, int umur, double saldo) {
        this.norek = norek;
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.saldo = saldo;
    }

}

class Queue {
    Nasabah[] data;
    int front, rear, size, max;

    public Queue(int n) {
        max = n;
        data = new Nasabah[max];
        size = 0;
        front = rear = -1;
    }

    public void enqueue(Nasabah dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            data[rear] = dt;
            size++;
        }
    }

    public Nasabah dequeue() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
            return null;
        } else {
            Nasabah dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                front = (front + 1) % max;
            }
            return dt;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println(" Elemen terdepan : " + data[front]);
        } else {
            System.out.println(" Queue masih kosong ");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            do {
                System.out.println(data[i] + " ");
                i = (i + 1) % max;
            } while (i != rear);
            System.out.println("jumlah elemen = " + size);
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Elemen terbelakang: " + data[rear].norek + " " + data[rear].nama +
                    " " + data[rear].alamat + " " + data[rear].umur + " " + data[rear].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }

    }
}
