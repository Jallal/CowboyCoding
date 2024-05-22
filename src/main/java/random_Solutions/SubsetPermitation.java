package random_Solutions;
import java.util.List;
import java.util.ArrayList;

public class SubsetPermitation {

    //https://stackoverflow.com/questions/29910312/algorithm-to-get-all-the-combinations-of-size-n-from-an-array-java

    public  void subset(){


            int[] input = {10, 20, 30, 40, 50};    // input array
            int k = 3;                             // sequence length   

            List<int[]> subsets = new ArrayList<>();

            int[] s = new int[k];                  // here we'll keep indices 
                                                // pointing to elements in input array

            if (k <= input.length) {
                // first index sequence: 0, 1, 2, ...
                for (int i = 0; (s[i] = i) < k - 1; i++);  
                subsets.add(getSubset(input, s));
                for(;;) {
                    int i;
                    // find position of item that can be incremented
                    for (i = k - 1; i >= 0 && s[i] == input.length - k + i; i--); 
                    if (i < 0) {
                        break;
                    }
                    s[i]++;                    // increment this item
                    for (++i; i < k; i++) {    // fill up remaining items
                        s[i] = s[i - 1] + 1; 
                    }
                    subsets.add(getSubset(input, s));
                }
            }
            }

    // generate actual subset by index sequence
    private int[] getSubset(int[] input, int[] subset) {
    int[] result = new int[subset.length]; 
    for (int i = 0; i < subset.length; i++) {
        int value = subset[i];
        System.out.println("value : "+value );
        result[i] = input[value];
    }
    System.out.println(" ******** DONE *********");
    return result;
}


public static void main(String[] args){
    SubsetPermitation permitation = new SubsetPermitation();
    permitation.subset();
}
}
