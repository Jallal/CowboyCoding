package list;
import java.util.Map;

import stringManipulation.Strings;

public class Main {

    

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Solution solution = new Solution();
    
        //form the first linklist
        ListNode listNode1_1 = new ListNode();
        listNode1_1.setValue(2);
        ListNode listNode1_2 = new ListNode();
        listNode1_2.setValue(4);
        ListNode listNode1_3 = new ListNode();
        listNode1_3.setValue(3);
        listNode1_1.setListNode(listNode1_2);
        listNode1_2.setListNode(listNode1_3);
    
    
    
        //form the 2nd linklist
        ListNode listNode2_1 = new ListNode();
        listNode2_1.setValue(5);
        ListNode listNode2_2 = new ListNode();
        listNode2_2.setValue(6);
        ListNode listNode2_3 = new ListNode();
        listNode2_3.setValue(4);
        listNode2_1.setListNode(listNode1_2);
        listNode2_2.setListNode(listNode1_3);
        
    
        solution.addTwoNumbers(listNode1_1,listNode2_1);
    
    
        //Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
        //Output: 7 -> 0 -> 8
        //Explanation: 342 + 465 = 807.

        String str ="I'm done with this stuoid job and uOTA negative information and sad words";
        Map<Character, Integer> countDuplicateCharactersV1 = Strings.countDuplicateCharactersV1(str);

        for(Map.Entry<Character, Integer>  element : countDuplicateCharactersV1.entrySet()){

            System.out.println(" Key : "+element.getKey()+" and Value : "+element.getValue());
        }

    }
}
