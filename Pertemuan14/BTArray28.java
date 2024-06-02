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
    
    void add(int nilai) {
        if (idxlast < data.length - 1) {
            idxlast++;
            data[idxlast] = nilai;
        } else {
            System.out.println("Tree sudah penuh!");
        }
    }

    void traverseInOrder(int idxstart) {
        if (idxstart <= idxlast) {
            traverseInOrder(2*idxstart+1);
            System.out.print(data[idxstart]+" ");
            traverseInOrder(2*idxstart+2);
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxlast) {
            System.out.print(data[idxStart] + " ");
            traversePreOrder(2* idxStart+1);
            traversePreOrder(2*idxStart+2);
        }
    }

    void traversePostOrder(int idxStart) {
        if (idxStart <= idxlast) {
            traversePostOrder(2*idxStart+1);
            traversePostOrder(2*idxStart+2);
            System.out.print(data[idxStart] + " ");
        }
    }
}
