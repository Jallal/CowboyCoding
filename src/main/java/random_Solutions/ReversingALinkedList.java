
package random_Solutions;
import java.util.*;

public class ReversingALinkedList {



public List<Integer> reverseList(List<Integer> data){

    List<Integer> newData = new ArrayList<Integer>();

    Integer listSize = data.size()-1;

    for(int i=0; i<listSize ; i++){    
        newData.add(i, data.get(listSize-i));
    }



return newData;
}

public static void main(String[] args){

    List<Integer> data = new ArrayList<Integer>();
    data.add(0);
    data.add(1);
    data.add(2);
    data.add(3);
    data.add(4);
    data.add(5);
    data.add(6);
    data.add(7);
    data.add(8);
    data.add(9);
    data.add(10);

System.out.println(" Printing before reversing : ");
for(Integer element : data){
    System.out.print(element);
}
System.out.println(" ");
System.out.println(" Printing After reversing : ");

ReversingALinkedList reversingALinkedList = new ReversingALinkedList();
List<Integer> dataReversed = reversingALinkedList.reverseList(data);

for(Integer value : dataReversed){
    System.out.print(value);
}
}
}
