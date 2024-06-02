import org.w3c.dom.Node;

public class BinaryTree28 {
    Node28 root;

    public BinaryTree28() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int Data) {
        if (isEmpty()) {//tree is empty
            root = new Node28(Data);
        }else {
            Node28 current = root;
            while (true) {
                if (Data < current.Data) {
                    if (current.left != null) {
                        current = current.left;
                    }else{
                        current.left = new Node28(Data);
                        break;
                    }
                }else if (Data > current.Data) {
                    if (current.right != null) {
                        current = current.right;
                    }else{
                        current.right = new Node28(Data);
                        break;
                    }
                }else{//Data is already exist
                    break;
                }
            }
        }
    }
    boolean find(int Data) {
        boolean result = false;
        Node28 current = root;
        while (current != null) {
            if (current.Data == Data) {
                result = true;
                break;
            } else if (current.Data < Data) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node28 node) {
        if (node != null) {
            System.out.print(" " + node.Data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node28 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.Data);

        }
    }

    void traverseInOrder(Node28 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.Data);
            traverseInOrder(node.right);
        }
    }

    Node28 getSuccessor(Node28 del) {
        Node28 successor = del.right;
        Node28 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int Data){
        if (isEmpty()) {
            System.out.println("Tree is empty !");
            return;
        }

        Node28 parent = root;
        Node28 current = root;
        boolean isLeftchild = false;
        while (current != null) {
            if (current.Data == Data) {
             break;   
            }else if(Data<current.Data){
                parent = current;
                current = current.left;
                isLeftchild = true;
            }else if(Data > current.Data){
                parent = current;
                current = current.right;
                isLeftchild = false;
            }
        }
        if (current==null) {
            System.out.println("Couldn't find Data!");
            return;
        }else{
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                }else{
                    if (isLeftchild) {
                        parent.left = null;
                    }else{
                        parent.right = null;
                    }
                }
                
            }else if(current.left == null)
                if (current==root) {
                
            }
        }

    }

    
    void addRekur(int Data){
        if (isEmpty()) {
            root = new Node28(Data);
        }else {
            addRecursive(root, Data);
        }
    }
    
    private void addRecursive(Node28 node, int Data){
        if (Data < node.Data) {
            if (node.left == null) {
                node.left = new Node28(Data);
            }else{
                addRecursive(node.left, Data);
            }
        }else if (Data > node.Data) {
            if (node.right == null) {
                node.right = new Node28(Data);
            }else{
                addRecursive(node.right, Data);
            }
        }
    }

    int findMinim() {
        if (isEmpty()) {
            System.out.println("Tree is empty");
        }
        Node28 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.Data;
    }

    int findMaxim() {
        if (isEmpty()) {
            System.out.println("Tree is empty");
        }
        Node28 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.Data;
    }

    void tampilDataLeaf(Node28 node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.print(" " + node.Data);
            }
            tampilDataLeaf(node.left);
            tampilDataLeaf(node.right);
        }
    }

    int hitungJmlLeaf(Node28 node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return hitungJmlLeaf(node.left) + hitungJmlLeaf(node.right);
    }

    
}

