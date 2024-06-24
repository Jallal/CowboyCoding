

package stringManipulation;

public class isSubSequence_392{

    public boolean isSubsequence(String s, String t) {
        List<Character>  matchSubStr = new ArrayList<>();

        if(t==null || s==null ){

            return false;
        }
        if(t.contains(s)){

            return true;
        }

        char[] sub_ch =  s.toCharArray();
        char[] ch =  t.toCharArray();
         int currElementIndex =0;
        for(char element :  sub_ch){
            for(int i=currElementIndex; i < ch.length;i++ ){
                if(ch[i]==element){
                currElementIndex = i+1;
                matchSubStr.add(element);
                break;
                } 
            }
        }
        return matchSubStr.size()==s.length(); 
    }


}