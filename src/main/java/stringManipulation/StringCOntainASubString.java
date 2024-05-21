package stringManipulation;

public class StringCOntainASubString {

    //String text = "hello world";

    //String subText = "orl";

    public boolean containsV1(String text, String subtext){

        return text.contains(subtext);
    }

    public boolean containsV2(String text, String subtext){

        return text.indexOf(subtext) !=-1;
    }
    
}
