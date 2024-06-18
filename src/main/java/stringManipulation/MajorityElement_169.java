
package stringManipulation;
public class MajorityElement{

    public int majorityElement(int[] nums) {

        Map<Integer, Integer>  myMap = new HashMap<Integer, Integer>();
        for(int element : nums){
            myMap.compute(element, (k,v)-> (v==null)?1:v+1);
        }

        int count=0; 
        int key =0;
        for(Map.Entry<Integer, Integer> elment : myMap.entrySet()){
            if(elment.getValue() > count ){
                count = elment.getValue();
                key = elment.getKey();
            }
        }

        return key;
    }

}