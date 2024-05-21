package datastructure;

import java.util.HashMap;
import java.util.Map;

public class Queue {


private int maxSize;
private long[] queArray;
private int front;
private int rear;
private int nItems;

public Queue(){

}

public Queue(int s){

    maxSize =s;
    queArray = new long[maxSize];
    front=0;
    rear=-1;
    nItems = 0;
}

//put the first item in the queue 
public void insert(long j){

    queArray[++rear] = j;
    nItems++;
}


// public long remove(){
    
// }


    public int majorityElement(int[] nums) {
        Integer maxValue = -1;
         Integer maxKey =-1;
        Map<Integer, Integer> majorityMap = new HashMap<Integer, Integer>();

        for(Integer element : nums){
            majorityMap.compute(element, (k,v)-> (v==null)?1 : v+1);
        }

       

        for(Map.Entry<Integer, Integer> maj : majorityMap.entrySet()){

            if(maxValue < maj.getValue()){

                maxKey = maj.getKey();
                maxValue = maj.getValue();
            }
        }
        return maxKey;
    }


    public static void main(String[] args){
        Queue q = new Queue();

        int[] arr = {-1,1,1,1,2,1};
        System.out.println(q.majorityElement(arr));

    }







    
}
