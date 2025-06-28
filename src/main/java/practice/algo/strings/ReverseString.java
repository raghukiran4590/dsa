package practice.algo.strings;

public class ReverseString {
    public static void main(String[] args) {
        String str = "The Sky is Blue";
        String[] split = str.split(" ");
        StringBuilder s1 = new StringBuilder("");
        for(int i = split.length-1; i>=0; i--) {
//            System.out.print(split[i] + " ");
            s1.append(split[i]).append(" ");
        }
        String s = s1.toString();
        System.out.println(s);
    }
}
