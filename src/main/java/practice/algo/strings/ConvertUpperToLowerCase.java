package practice.algo.strings;

public class ConvertUpperToLowerCase {
    public static void main(String[] args) {
        String str = "WelcomEtOScaLEr";
        char[] charArray = str.toCharArray();
        for(int i=0; i<charArray.length; i++) {
            if(charArray[i] >= 'A' && charArray[i] <= 'Z') {
                    char ch = (char) (charArray[i] - 'A' + 'a');
                    charArray[i] = ch;
            }
        }
        for(char c : charArray) {
            System.out.print(c);
        }
    }
}
