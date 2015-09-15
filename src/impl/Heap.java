package impl;

import base.Data;
import base.Node;

/**
 * Created by yunmi on 2015-09-13.
 */
public class Heap {
    private Node[] node;
    private int MAXSIZE = 50;
    private int pointer = 0;

    public Heap() {
        node = new Node[MAXSIZE];
        pointer = 1;

    }

    public Node getNode(int i){
        return node[i];
    }
    public boolean isEmpty() {
        return pointer == 0;
    }

    public boolean isFull() {
        return MAXSIZE == pointer;
    }

    public void insert(Node node) {

        if (isFull()) {
            System.out.println("Heap is full");
            return;
        }

        int i = pointer++;

        while (i != 1 && node.getData().compareTo(this.node[i / 2].getData()) > 0) {
            this.node[i] = this.node[i / 2];
            i = i / 2;
        }

        this.node[i] = node;

    }

    public Node delete() {
        Node item = node[1];

        node[1] = node[--pointer];

        int i = 2;
        int largest;
        while (i <= pointer) {

            if (i < pointer && node[i].getData().compareTo(node[i + 1].getData()) < 0)
                largest = i + 1;
            else largest = i;

            if (node[largest / 2].getData().compareTo(node[largest].getData()) > 0)
                break;

            Node tmp;
            tmp = node[largest / 2];
            node[largest / 2] = node[largest];
            node[largest] = tmp;

            i = largest*2;
        }

        return  item;
    }

}


//    public static void main(String args[]){
//        Heap H = new Heap();
//        Node n ;
//        H.insert(new Node(new Data(5)));
//        H.insert(new Node(new Data(3)));
//        H.insert(new Node(new Data(7)));
//        H.insert(new Node(new Data(6)));
//        H.insert(new Node(new Data(2)));
//        H.insert(new Node(new Data(9)));
//        H.insert(new Node(new Data(8)));
//
//        for(int i=1; i<8; i++){
//            n = H.getNode(i);
//            System.out.print(n.getData().id + " ");
//        }
//        System.out.println();
//
//        H.delete();
//
//        for(int i=1; i<7; i++){
//            n = H.getNode(i);
//            System.out.print(n.getData().id + " ");
//        }
//        System.out.println();
//
//        H.delete();
//
//        for(int i=1; i<6; i++){
//            n = H.getNode(i);
//            System.out.print(n.getData().id + " ");
//        }
//        System.out.println();
//    }