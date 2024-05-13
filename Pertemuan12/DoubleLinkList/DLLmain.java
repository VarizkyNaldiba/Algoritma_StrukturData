package DoubleLinkList;

public class DLLmain {
    public static void main(String[] args) throws Exception {
        DoubleLL dll = new DoubleLL();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=================");
        dll.addFirst(3);
        dll.print();
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();

        System.out.println("size : " + dll.size());
        System.out.println("==================");
        dll.add(40,1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("===================");
        dll.clear();
        dll.print();
        System.out.println("Size : " + dll.size());
    }
}
