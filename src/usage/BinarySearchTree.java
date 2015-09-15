package usage;

import base.*;
import impl.BST;
import java.util.Scanner;

/**
 * Created by yunmi on 2015-09-14.
 */

public class BinarySearchTree
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        /* Creating object of BST */
        BST bst = new BST();
        System.out.println("Binary Search Tree Test\n");
        char ch;
        /*  Perform tree operations  */
        do
        {
            System.out.println("\nBinary Search Tree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. delete");
            System.out.println("3. search");
            System.out.println("4. count nodes");
            System.out.println("5. check empty");

            int choice = scan.nextInt();
            switch (choice)
            {
                case 1 :
                    System.out.println("Enter integer element to insert");
                    for(int i=0; i<8; i++) {
                        bst.insert(new Data(scan.nextInt()));
                    }break;

                case 2 :
                    System.out.println("Enter integer element to delete");
                    bst.delete(new Data(scan.nextInt()));
                    break;
                case 3 :
                    System.out.println("Enter integer element to search");
                    System.out.println("Search result : " + bst.search(new Data(scan.nextInt())));
                    break;
                case 4 :
                    System.out.println("Empty status = " + bst.isEmpty());
                    break;
                default :
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            /*  Display tree  */
            System.out.print("\nPost order : ");
            bst.postorder();
            System.out.print("\nPre order : ");
            bst.preorder();
            System.out.print("\nIn order : ");
            bst.inorder();

            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y'|| ch == 'y');
    }
//
//interface ICompare<T> {
//
//    int compareTo(T t);
//}
//
//class Data implements ICompare<Data>{
//
//    public int id;
//    public String name;
//    public String associtaion;
//
//    Data(int id){this.id = id;}
//
//    public int compareTo(Data data) {
//        if (this == data || this.id == data.id)
//            return 0;
//
//        return this.id > data.id ? 1 : -1;
//    }
//}
//class Node<T extends Data>
//{
//    Node left, right;
//    T data;
//
//    /* Constructor */
//    public Node()
//    {
//        left = null;
//        right = null;
//        data = null;
//    }
//    /* Constructor */
//    public Node(T n)
//    {
//        left = null;
//        right = null;
//        data = n;
//    }
//    /* Function to set left node */
//    public void setLeft(Node n)
//    {
//        left = n;
//    }
//
//    public void setRight(Node n)
//    {
//        right = n;
//    }
//
//    public Node getLeft()
//    {
//        return left;
//    }
//
//    public Node getRight()
//    {
//        return right;
//    }
//
//    public void setData(T t)
//    {
//        data = t;
//    }
//
//    public T getData()
//    {
//        return data;
//    }
//}

/* Class BST */
//class BST<T extends Data>
//{
//    private Node root;
//
//    /* Constructor */
//    public BST()
//    {
//        root = null;
//    }
//
//    public boolean isEmpty()
//    {
//        return root == null;
//    }
//
//
//    public void insert(T data)
//    {
//        root = insert(root, data);
//    }
//    private Node insert(Node node, T data)
//    {
//        if (node == null)
//            node = new Node(data);
//        else
//        {
//            if (data.compareTo(node.getData()) <0 )
//                node.left = insert(node.left, data);
//            else
//                node.right = insert(node.right, data);
//        }
//        return node;
//    }
//
//
//
//    /* Functions to delete data */
//    public void delete(T data) {
//        if (isEmpty())
//            System.out.println("Tree Empty");
//
//        Node p = root;
//        Node p2 = null;
//
//        //search
//        while (p != null && p.getData().compareTo(data) != 0) {
//            p2 = p;
//            if (data.compareTo(p.getData()) < 0)
//                p = p.getLeft();
//            else p = p.getRight();
//        }
//
//        if (p == null) {
//            System.out.println(data + " is not present");
//            return;
//        }
//
//        // no child
//        if (p.getLeft() == null && p.getRight() == null) {
//            if (p2 != null) {
//                if (p2.getLeft() == p)
//                    p2.setLeft(null);
//                else p2.setRight(null);
//            } else root = null;
//        }
//        //one child
//        else if (p.getLeft() == null || p.getRight() == null) {
//            Node c;
//            if (p.getLeft() == null)
//                c = p.getRight();
//            else c = p.getLeft();
//            if (p2 != null) {
//                if (p2.getLeft() == p)
//                    p2.setLeft(c);
//                else p2.setRight(c);
//            } else root = c;
//        }
//        //two children
//        else if (p.getLeft() != null && p.getRight() != null) {
//
//            //find child
//            Node q2 = p;
//            Node q = p.getRight();
//
//            while (q.getLeft() != null) {
//                q2 = q;
//                q = q.getLeft();
//            }
//
////            if(q2.getLeft() == q)
//                q2.setLeft(q.getRight());
////            else q2.setRight(q.getLeft());
//
//
//            p.setData(q.getData());
//
//        }
//    }
//    /* Functions to count number of nodes */
//
//    /* Functions to search for an element */
//    public boolean search(T val)
//    {
//        return search(root, val);
//    }
//    private boolean search(Node root, T data)
//    {
//        boolean found = false;
//        Node pp;
//        Node p = root;
//        while ((p != null) && !found) {
//            pp = p;
//
//            if (data.compareTo(p.getData()) < 0)
//                p = pp.getLeft();
//            else if (data.compareTo(p.getData()) > 0)
//                p = pp.getRight();
//            else {
//                found = true;
//                break;
//            }
//        }
//        return found;
//    }
//    public void inorder()
//    {
//        inorder(root);
//    }
//    private void inorder(Node r)
//    {
//        if (r != null)
//        {
//            inorder(r.getLeft());
//            System.out.print(r.getData().id +" ");
//            inorder(r.getRight());
//        }
//    }
//
//    public void preorder()
//    {
//        preorder(root);
//    }
//    private void preorder(Node r)
//    {
//        if (r != null)
//        {
//            System.out.print(r.getData().id +" ");
//            preorder(r.getLeft());
//            preorder(r.getRight());
//        }
//    }
//
//    public void postorder()
//    {
//        postorder(root);
//    }
//    private void postorder(Node r)
//    {
//        if (r != null)
//        {
//            postorder(r.getLeft());
//            postorder(r.getRight());
//            System.out.print(r.getData().id +" ");
//        }
//    }
//}

/* Class BinarySearchTree */

}