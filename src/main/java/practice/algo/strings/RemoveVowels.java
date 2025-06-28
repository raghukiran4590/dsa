package practice.algo.strings;

public class RemoveVowels {

    public static void main(String[] args) {
//        String s = "Welcome to Java Programming";
        String s = "Yes, you can do it";
        char[] charArray = s.toCharArray();
        for(int i =0; i<charArray.length; i++) {
            /*char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                continue;
            else
                System.out.print(charArray[i]);*/

            if(charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' ||
            charArray[i] == 'o' || charArray[i] == 'u')
                continue;
            else
                System.out.print(charArray[i]);
        }
    }
}
