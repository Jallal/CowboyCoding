/**
 * 
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 * 
 * 
 */


package leetCode.stack;

import java.util.Stack;

public class ValidParentheses_20{

    public boolean isValid(String s) {
        Stack<Character> mystack = new Stack();
        if(s.length()%2!=0){

            return false;
        }

        for(char element :  s.toCharArray()){
            if(element=='('|| element=='{' || element=='['){
                mystack.push(element);  
            }else if(element==')'){
                if(!mystack.isEmpty()  && mystack.peek()=='('){
                    mystack.pop();
                }else{
                    return false;
                }
            }else if(element=='}'){
                if(!mystack.isEmpty()  && mystack.peek()=='{'){
                    mystack.pop();
                }else{
                    return false;
                }
                
            }else if(element==']'){
                if( !mystack.isEmpty()  && mystack.peek()=='['){
                    mystack.pop();
                }else{
                    return false;
                }
            }
        }
        return mystack.isEmpty();
    }

}