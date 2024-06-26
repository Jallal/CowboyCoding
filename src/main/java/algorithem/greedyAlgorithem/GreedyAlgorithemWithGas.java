package algorithem.greedyAlgorithem;

import java.util.Map;
import java.util.HashMap;


public class GreedyAlgorithemWithGas {

    public int canCompleteCircuit(int[] gas, int[] cost) {

      
        int sumCost =0;
        int sumGas =0;
        for(int co : cost){
            sumCost = sumCost + co;
        }

        for(int go : gas){
            sumGas = sumGas + go;
        }

        // check if it's possible to complete the journey 
        if(sumCost >= sumGas){
            return -1;
        }
        
        int currentGas = 0;
        int startingIndex =0;

        for(int i=0; i< gas.length; i++){

            currentGas += gas[i] - cost[i];
            if(currentGas < 0){
                currentGas =0;
                startingIndex = i+1;

            }



        }


        return startingIndex;
}
    
}
