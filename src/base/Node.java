package base;

/**
 * Created by yunmi on 2015-09-05.
 */

public class Node<T extends Data> {
    //Node 형으로 Data만 올수 있게 제한을 둠

    public Node left, right;
    public T data;

    //Constructor
    public Node() {
        this.left = null;
        this.right = null;
        this.data = null;
    }

    public Node(T data) {
        this.left = null;
        this.right = null;
        this.data = data;
    }

    //set,get left,right,t(data)
    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getLeft() {
        return this.left;
    }

    public Node getRight() {
        return this.left;
    }

    public T getData() {
        return this.data;
    }


}
