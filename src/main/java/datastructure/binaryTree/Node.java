package datastructure.binaryTree;

public class Node {

    public int id; // node's key
    public double data;// node's data
    public Node leftChild; // this node's left child 
    public Node rightChild; // this node right child

    public Node(int id, double data){

        this.id=id;
        this.data=data;
    }


    public void display(){
        System.out.print("{ ");
        System.out.print( this.id);
        System.out.print( ", ");
        System.out.print(this.data);
        System.out.print(" }");
    }
}
