public class BTArray28 {
    int[] data;
    int idxlast;
    public BTArray28() {
        data = new int[10];
    }
    void populateData(int data[], int idxlast) {
        this.data = data;
        this.idxlast = idxlast;
    }
    void traverseInOrder(int idxstart) {
        if (idxstart <= idxlast) {
            traverseInOrder(2*idxstart+1);
            System.out.print(data[idxstart]+" ");
            traverseInOrder(2*idxstart+2);
        }
    }
}
