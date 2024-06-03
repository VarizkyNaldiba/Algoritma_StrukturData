/**
 * Node28
 */
public class Node28 {

    int data, jarak;
    Node28 prev, next;

    Node28(Node28 prev, int data, int jarak, Node28 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.jarak = jarak;
    }
}