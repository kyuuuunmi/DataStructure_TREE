package impl;

import base.Data;
import base.Node;

public class BST<T extends Data>
{
    private Node root;

    /* Constructor */
    public BST()
    {
        root = null;
    }

    public boolean isEmpty()
    {
        return root == null;
    }


    public void insert(T data)
    {
        root = insert(root, data);
    }
    private Node insert(Node node, T data)
    {
        if (node == null)
            node = new Node(data);
        else
        {
            if (data.compareTo(node.getData()) <0 )
                node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);
        }
        return node;
    }



    /* Functions to delete data */
    public void delete(T data) {
        if (isEmpty())
            System.out.println("Tree Empty");

        Node p = root;
        Node p2 = null;

        //search
        while (p != null && p.getData().compareTo(data) != 0) {
            p2 = p;
            if (data.compareTo(p.getData()) < 0)
                p = p.getLeft();
            else p = p.getRight();
        }

        if (p == null) {
            System.out.println(data + " is not present");
            return;
        }

        // no child
        if (p.getLeft() == null && p.getRight() == null) {
            if (p2 != null) {
                if (p2.getLeft() == p)
                    p2.setLeft(null);
                else p2.setRight(null);
            } else root = null;
        }
        //one child
        else if (p.getLeft() == null || p.getRight() == null) {
            Node c;
            if (p.getLeft() == null)
                c = p.getRight();
            else c = p.getLeft();
            if (p2 != null) {
                if (p2.getLeft() == p)
                    p2.setLeft(c);
                else p2.setRight(c);
            } else root = c;
        }
        //two children
        else if (p.getLeft() != null && p.getRight() != null) {

            //find child
            Node q2 = p;
            Node q = p.getRight();

            while (q.getLeft() != null) {
                q2 = q;
                q = q.getLeft();
            }

//            if(q2.getLeft() == q)
            q2.setLeft(q.getRight());
//            else q2.setRight(q.getLeft());


            p.setData(q.getData());

        }
    }
    /* Functions to count number of nodes */

    /* Functions to search for an element */
    public boolean search(T val)
    {
        return search(root, val);
    }
    private boolean search(Node root, T data)
    {
        boolean found = false;
        Node pp;
        Node p = root;
        while ((p != null) && !found) {
            pp = p;

            if (data.compareTo(p.getData()) < 0)
                p = pp.getLeft();
            else if (data.compareTo(p.getData()) > 0)
                p = pp.getRight();
            else {
                found = true;
                break;
            }
        }
        return found;
    }
    public void inorder()
    {
        inorder(root);
    }
    private void inorder(Node r)
    {
        if (r != null)
        {
            inorder(r.getLeft());
            System.out.print(r.getData().id +" ");
            inorder(r.getRight());
        }
    }

    public void preorder()
    {
        preorder(root);
    }
    private void preorder(Node r)
    {
        if (r != null)
        {
            System.out.print(r.getData().id +" ");
            preorder(r.getLeft());
            preorder(r.getRight());
        }
    }

    public void postorder()
    {
        postorder(root);
    }
    private void postorder(Node r)
    {
        if (r != null)
        {
            postorder(r.getLeft());
            postorder(r.getRight());
            System.out.print(r.getData().id +" ");
        }
    }
}