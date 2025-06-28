package practice.algo.strings;

public class ReverseVowelsString {
    public static void main(String[] args) {
//        String s = "Welcometoscaler";
        String s = "welcometojavaprogramming";
        char[] charArray = s.toCharArray();
        int i = 0;
        int j = charArray.length - 1;

        while(i<j) {
            if(charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' ||
                    charArray[i] == 'o' || charArray[i] == 'u') {
                while (j>i) {
                    if(charArray[j] == 'a' || charArray[j] == 'e' || charArray[j] == 'i' ||
                            charArray[j] == 'o' || charArray[j] == 'u') {
                        char temp = charArray[i];
                      charArray[i] = charArray[j];
                      charArray[j] = temp;
                      j--;
                      break;
                    }
                    j--;
                }
            }
            i++;
        }
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    }
}
