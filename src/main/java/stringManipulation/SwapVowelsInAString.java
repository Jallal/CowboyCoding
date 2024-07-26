package stringManipulation;

public class SwapVowelsInAString {

    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        char[] result = s.toCharArray();
        String vowels = "aeiouAEIOU";
        while (i < j) {
            if (!vowels.contains(result[i] + "")) {
                i++;
                continue;
            }
            if (!vowels.contains(result[j] + "")) {
                j--;
                continue;
            }
            swap(result, i, j);
            i++;
            j--;
        }
        return new String(result);
    }
    
    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}
