package datastructure;

public class StackX {


private int maxSize;// size of the stack 
private char[] stackArray;
private int top; //top of the stack


public StackX(int s){

    maxSize =s; //set the array size
    stackArray = new char[maxSize]; //create teh array
    top =-1; // no item yet
}

//put the item on top of the stack
public void push(char ch){
    top = top+1;
    stackArray[top]=ch; // increment the top snd insert item
}


//take item from top of stack
public char pop(){

    //access item and decrement the top
return stackArray[top--];
}


public char peek(){

    return stackArray[top];
}

public boolean isEmpty(){

    return top==-1;
}

public boolean isFull(){

    return top == maxSize-1;

}



public static void main(String[] args){

    StackX stackX = new StackX(10);
    stackX.push('h');
    stackX.push('e');
    stackX.push('l');
    stackX.push('l');
    stackX.push('o');

    System.out.println("Starting the printing process : ");
while(!stackX.isEmpty()){
    System.out.println(stackX.pop());;
}
}    
}
