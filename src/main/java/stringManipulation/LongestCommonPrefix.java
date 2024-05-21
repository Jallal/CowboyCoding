package stringManipulation;

public class LongestCommonPrefix {

    public static String longestCommonPreFix(String[] args){

        if(args.length ==1){
            
            return args[0];
        }

int firstLen = args[0].length();

for(int preFixLen =0; preFixLen < firstLen; preFixLen++){

    char ch = args[0].charAt(preFixLen);
    for(int i=1; i< args.length; i++){
        if(preFixLen>args[i].length() || args[i].charAt(preFixLen) !=ch){

            return args[i].substring(0,preFixLen);

        }

    }

}
return args[0];
    }
}
