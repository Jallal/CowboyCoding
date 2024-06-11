package datastructure.binaryTree;

public class Tree {

public Node root; //the only data field in the tree


//find node with the given key
public Node find(int key){

    //start at the root
    Node current = root;

        while(current.id != key){ //while no match
            if(key < current.data){ //go left
                current = current.leftChild;
            } else{
                current = current.rightChild;
            } 

            if(current == null){ //if no child
                return null; // didn't find it
            }
        }
        //found it
    return current;

}

//add a node to the tree
public void insert(int id, double data){

    //make a new node and insert teh data
    Node newNode = new Node(id,data);

    // no node in the root
    if(root == null){
        root = newNode;
    } else{ //root already occupied 

        Node current = root; //start at the root
        Node parent; 
        while(true){ // exist internally?
            parent = current;
            if(id < current.data){ // go left
                current = current.leftChild;
                if(current ==null){ //if end of the line insert left
                    parent.leftChild = newNode;
                    return;    
                }
            } else{ //go right

                current = current.rightChild;
                if(current ==null){ // if end of the line then insert right
                    parent.rightChild = newNode;
                    return;
                }
            }
        }
    }
}



    //delete a node witha given key
    public boolean delete(int key) {  // delete node with given key
    // (assumes non-empty list)                      
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;

        while(current.id != key){ // search for node
            parent = current;
            if(key < current.data){ // go left?
                isLeftChild = true;
                current = current.leftChild;
                }else { // or go right?
                isLeftChild = false;
                current = current.rightChild;
                }
            if(current == null) {            // end of the line,
                return false;                // didn't find it
            }
            }  // end while

        // if no children, simply delete it
        if(current.leftChild==null && current.rightChild==null){
            if(current == root){             // if root,
                root = null; 
            }else if(isLeftChild){  // tree is empty        
                parent.leftChild = null;     // disconnect
            }else { // from parent                           
                parent.rightChild = null;
            }
        }else if(current.rightChild==null){
            if(current == root){
                root = current.leftChild;
            }else if(isLeftChild)  {         // left child of parent
                parent.leftChild = current.leftChild;
            } else {                          // right child of parent
                parent.rightChild = current.leftChild;
            }
        // if no left child, replace with right subtree
        }else if(current.leftChild==null){
            if(current == root){
                root = current.rightChild;
            }else if(isLeftChild) {          // left child of parent
                parent.leftChild = current.rightChild;
            } else {                          // right child of parent
                parent.rightChild = current.rightChild;
            }
        }else { // two children, so replace with inorder successor
            // get successor of node to delete (current)
            Node successor = getSuccessor(current);
            // connect parent of current to successor instead
            if(current == root){
                root = successor;
            }else if(isLeftChild){
                parent.leftChild = successor;
            }else{
                parent.rightChild = successor;
            }
            // connect successor to current's left child
            successor.leftChild = current.leftChild;
        }  
        // end else two children
        // (successor cannot have a left child)
    return true;
    } 



   // returns node with next-highest value after delNode
// goes to right child, then right child's left descendants

private Node getSuccessor(Node delNode){
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.rightChild;   // go to right child
        
        while(current != null) {  // until no more left children,
        successorParent = successor;
        successor = current;
        current = current.leftChild;      // go to left child
        }
                                            // if successor not
        if(successor != delNode.rightChild){ // right child, make connections
        successorParent.leftChild = successor.rightChild;
        successor.rightChild = delNode.rightChild;
        }
    return successor;
}
   













// return the node with minimum value
public Node minimum(){ 

    Node current = null;
    Node last = null;
    current = root; // start at the root

    while(current != null){ // util the bottom
        last = current; //remember the node
        current = current.leftChild; //go to the left
    }

    return last;
}





public static void main(String[] args){

    Tree tree = new Tree(); //make the tree

    // insert 3 nodes
    tree.insert(50, 1.5);
    tree.insert(25, 1.7);   
    tree.insert(75, 1.9);

    Node found = tree.find(25); //find a node with key 25
    if(found != null){
        System.out.println(" Found the node with key 25");
    }else{
        System.out.println(" Coudn't find node with key 25");
    }


}
}
