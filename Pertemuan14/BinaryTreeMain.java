/**
 * BinaryTreeMain
 */
public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree28 bt = new BinaryTree28();
        bt.addRekur(6);
        bt.addRekur(4);
        bt.addRekur(8);
        bt.addRekur(3);
        bt.addRekur(5);
        bt.addRekur(7);
        bt.addRekur(9);
        bt.addRekur(10);
        bt.addRekur(15);

        System.out.println("Add Rekursif");
        System.out.print("\nIn-Order Traversal      : ");
        bt.traverseInOrder(bt.root);
        System.out.println("\nNilai terkecil          : " + bt.findMinim());
        System.out.println("\nNilai terbesar          : " + bt.findMaxim());
        System.out.print("\nNilai nodes pada Leaf   :");
        bt.tampilDataLeaf(bt.root);
        System.out.println("\nJumlah nodes pada Leaf  : " + bt.hitungJmlLeaf(bt.root));

        System.out.println();
        System.out.print("Pre-Order Traversal   : ");
        bt.traversePreOrder(bt.root);
        System.out.println();
        System.out.print("In-Order Traversal    : ");
        bt.traverseInOrder(bt.root);
        System.out.println();
        System.out.print("Post-Order Traversal  : ");
        bt.traversePostOrder(bt.root);
        System.out.println();
        System.out.println("Find Node             : " + bt.find(6));
        System.out.println("Delete Node 8 ");
        bt.delete(8);
        System.out.println();
        System.out.print("Pre-Order Traversal   : ");
        bt.traversePreOrder(bt.root);
        System.out.println();
    }
}