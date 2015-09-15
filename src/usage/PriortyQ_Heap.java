package usage;

import base.Data;
import base.Node;
import impl.Heap;

/**
 * Created by yunmi on 2015-09-15.
 */
public class PriortyQ_Heap {
    public static void main(String args[]){
        Heap H = new Heap();
        Node n ;
        H.insert(new Node(new Data(5)));
        H.insert(new Node(new Data(3)));
        H.insert(new Node(new Data(7)));
        H.insert(new Node(new Data(6)));
        H.insert(new Node(new Data(2)));
        H.insert(new Node(new Data(9)));
        H.insert(new Node(new Data(8)));

        for(int i=1; i<8; i++){
            n = H.getNode(i);
            System.out.print(n.getData().id + " ");
        }
        System.out.println();

        H.delete();

        for(int i=1; i<7; i++){
            n = H.getNode(i);
            System.out.print(n.getData().id + " ");
        }
        System.out.println();

        H.delete();

        for(int i=1; i<6; i++){
            n = H.getNode(i);
            System.out.print(n.getData().id + " ");
        }
        System.out.println();
    }
}
