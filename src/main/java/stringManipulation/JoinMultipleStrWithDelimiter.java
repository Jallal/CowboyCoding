package stringManipulation;

public class JoinMultipleStrWithDelimiter {


    public static String JoinByDelimeter(char delimiter, String ...args){

        StringBuilder builder = new StringBuilder();

        int i=0;

        for( i=0; i< args.length; i++){

            builder.append(args[i]).append(delimiter);
        }
        builder.append(args[i]);
        return builder.toString();
    }
    


}
