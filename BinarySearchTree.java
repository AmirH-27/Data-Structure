import java.util.Scanner;
public class BinarySearchTree {
    class Node {
        int id;
        String name;
        double cgpa;
        Node left, right;

        public Node(int id,String name,double cgpa) {
            this.id = id;
            this.name=name;
            this.cgpa=cgpa;
            left = right = null;
        }
    }

    Node root;

    BinarySearchTree() {
        root = null;

    }
    void insert(int id,String name,double cgpa) {
        root = insertRec(root,id,name,cgpa);
    }

    Node insertRec(Node root, int id,String name,double cgpa) {

        if (root == null) {
            root = new Node(id,name,cgpa);
            return root;
        }

        if (id < root.id) {
            root.left = insertRec(root.left, id, name, cgpa);
        }
        else if (id > root.id) {
            root.right = insertRec(root.right, id, name, cgpa);
        }
        return root;
    }
    void inorder()  {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println("Student's ID : "+root.id);
            System.out.println("Student's Name : "+root.name);
            System.out.println("Student's CGPA : "+root.cgpa);
            System.out.println("----------------------------------------");
            inorderRec(root.right);
        }
    }

    public Node search( int id)
    {
        Node temp=root;
        while (temp.id!=id) {
            if (id < temp.id) {
                temp = temp.left;
            }
            else {
                temp = temp.right;
            }
        }
        if (temp==null){
            return null;
        }
        return temp;
    }

    static int findMax(Node node)
    {
        if (node == null)
            return Integer.MIN_VALUE;

        int res = node.id;
        int lres = findMax(node.left);
        int rres = findMax(node.right);

        if (lres > res)
            res = lres;
        if (rres > res)
            res = rres;
        return res;
    }
    static int findMin(Node node) {
        if (node == null)
            return Integer.MAX_VALUE;

        int res = node.id;
        int lres = findMin(node.left);
        int rres = findMin(node.right);

        if (lres < res)
            res = lres;
        if (rres < res)
            res = rres;
        return res;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        int size;
        int id;
        String name;
        double cgpa;

        System.out.print("Enter the number of Students : ");
        size = input.nextInt();
        for(int i=0;i<size;i++){
            System.out.print("Enter Id for Student "+(i+1)+": ");
            id=input.nextInt();
            System.out.print("Enter Name for Student "+(i+1)+": ");
            name=input.next();
            System.out.print("Enter CGPA for Student "+(i+1)+": ");
            cgpa=input.nextDouble();

            bst.insert(id,name,cgpa);

        }

        System.out.println("----------------------------------------");
        bst.inorder();

        System.out.println("Enter the Student's ID to search : ");
        int searchID=input.nextInt();
        System.out.println("Student's ID : "+bst.search(searchID).id);
        System.out.println("Student's Name : "+bst.search(searchID).name);
        System.out.println("Student's CGPA : "+bst.search(searchID).cgpa);

    }


}
