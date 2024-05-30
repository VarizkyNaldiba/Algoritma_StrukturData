public class BTArrayMain28 {
    public static void main(String[] args) {
        BTArray28 bta = new BTArray28();
        int[] data = { 6, 4, 8, 3, 5, 7, 9, 0, 0, 0 };
        int idxlast = 6;
        bta.populateData(data, idxlast);
        System.out.println("\nInOrder Traversal : ");
        bta.traverseInOrder(0);
        System.out.println("\n");
    }
}
