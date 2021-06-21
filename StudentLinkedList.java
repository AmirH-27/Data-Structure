import java.util.Scanner;
public class Task4 {
    class Node {
        int id;
        String name;
        double cgpa;
        Node left, right;

        public Node(int id, String name, double cgpa) {
            this.id=id;
            this.name=name;
            this.cgpa=cgpa;
            left = right = null;
        }
    }
    Node root;
    Task4() {
        root = null;
    }
    void insert(int id, String name, double cgpa) {
        root = insertRec(root, id, name, cgpa);
    }
    Node insertRec(Node root, int id, String name, double cgpa) {
        if (root == null) {
            root = new Node(id, name, cgpa);
            return root;
        }
        if (id < root.id)
            root.left = insertRec(root.left, id, name, cgpa);
        else if (id > root.id)
            root.right = insertRec(root.right, id, name, cgpa);
        return root;
    }
    void inorder()  {
        inorderRec(root);
    }
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println("Student's Id : "+root.id);
            System.out.println("Student's Name : "+root.name);
            System.out.println("Student's CGPA : "+root.cgpa);
            inorderRec(root.right);
            System.out.println("---------------------------------");
        }
    }
    static int findMax(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }

        int res = node.id;
        int lres = findMax(node.left);
        int rres = findMax(node.right);

        if (lres > res) {
            res = lres;
        }
        if (rres > res) {
            res = rres;
        }
        return res;
    }
    static int findMin(Node node) {
        if (node == null) {
            return Integer.MAX_VALUE;
        }

        int res = node.id;
        int lres = findMin(node.left);
        int rres = findMin(node.right);

        if (lres < res) {
            res = lres;
        }
        if (rres < res) {
            res = rres;
        }
        return res;
    }
    public static void main(String[] args) {
        Task4 tree = new Task4();
        Scanner input = new Scanner(System.in);
        int size;
        System.out.print("Enter the number of Students : ");
        size=input.nextInt();
        for(int i=0;i<size;i++){
            tree.insert(input.nextInt(), input.next(), input.nextDouble());
        }
        tree.inorder();
        System.out.println("Maximum "+findMax(tree.root));
        System.out.println("Minimum "+findMin(tree.root));
    }
}



