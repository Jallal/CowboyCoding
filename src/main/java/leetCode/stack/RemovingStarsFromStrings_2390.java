package leetCode.stack;

import java.util.Stack;

public class RemovingStarsFromStrings_2390 {

    public String removeStars(String s) {

        Stack<Character> stackX = new Stack<Character>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='*'){
                stackX.pop();

            } else{
                stackX.push(Character.valueOf(s.charAt(i)));
            }
        }

       Iterator<Character> iter = stackX.iterator();
       while(iter.hasNext()){
        sb.append(iter.next());
       }

       return sb.toString();
    }



}