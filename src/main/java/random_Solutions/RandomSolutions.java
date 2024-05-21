package random_Solutions;

public class RandomSolutions {

    public int hIndex(int[] citations) {

        int length = citations.length;
        int[] buckets = new int[length+1];
       
       for(int c : citations){
        if(c >= length){
            buckets[length]++;
        }else{
            buckets[c]++;
        }
       }


       for(int j=0 ; j< buckets.length; j++){
        System.out.println("***** " +buckets[j]);

       }

       int count =0;

    for(int i = citations.length; i>0; i--){
            count+= buckets[i];
            if(count>=i){
                return i;

            }

    }
        return 0; 
    }

    public boolean isPalindrome(String s) {
        boolean isPalindrome = false;
        StringBuilder sb = new StringBuilder();

        if(s==null || s.isEmpty()|| s.isBlank()){
           
            isPalindrome = true;
             return true;
         }

       char[] arr = s.toLowerCase().toCharArray();
        for(char myChar : arr){
            if(Character.isLetter(myChar)){
                sb.append(myChar);
            }
        }

        
        char[] ch = sb.toString().toCharArray();
        int n = ch.length-1;
        for(int i=0; i< ch.length; i++){

            if(ch[i]==ch[n-i]){

                isPalindrome = true;

            }else{
                isPalindrome = false;
                break;
            }


        }
        System.out.println("My String :"+s+" updated String : "+sb.toString());

       return isPalindrome; 
    }

    public static void main(String[] args){

        RandomSolutions solution = new RandomSolutions();
        //int[] citation = {3,0,6,1,5};
        //solution.hIndex(citation);
        String s = "A man, a plan, a canal: Panama";

        solution.isPalindrome(s);

    }
    
}
