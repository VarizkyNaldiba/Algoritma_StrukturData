public class Graph28 {
    int vertex;
    DoubleLinkList28 list[];

    public Graph28(int v) {
        vertex = v;
        list = new DoubleLinkList28[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkList28();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
        // Jikalau "Undirected Graph"
        // list[tujuan].addFirst(tujuan, jarak);
    }

    public void degree(int asal) throws Exception {
        int totalIn = 0, totalOut = 0;
        // inDegree
        for (int i = 0; i < list[asal].size(); i++) {
            totalIn++;
        }
        // outDegree
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    totalOut++;
                }
            }
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + " : " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + " : " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + " : " + (totalIn + totalOut));
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        list[asal].remove(tujuan);
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println(" Graf berhasil dikosongkan ");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan : ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.println((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m)" ) ;
                }
                System.out.println(" ");
            }

        }
        System.out.println(" ");
    }


}
