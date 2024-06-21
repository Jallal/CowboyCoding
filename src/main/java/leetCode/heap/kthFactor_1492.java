package leetCode.heap;
import java.sql.Array;
import java.util.Arrays;
import java.util.PriorityQueue;

public class kthFactor_1492{

    public int kthFactor(int n, int k) {

        PriorityQueue<Integer> myQueue = new PriorityQueue<Integer>((Integer c1, Integer c2) -> Integer.compare(c2,c1));
        int d=n;
        while(d>0){
            if(n%d==0){
                myQueue.add(d);
                if(myQueue.size()>k){
                    myQueue.remove();
                }
            }
            d--;
        }

        return myQueue.size()==k?myQueue.poll():-1;
    }

}