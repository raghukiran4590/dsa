package practice.algo.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseVowels {
    public static void main(String[] args) {
        String s = "Welcome to Java";
        StringBuilder vowels = new StringBuilder();
        char[] charArray = s.toCharArray();
        ArrayList<Character> characterArrayList = new ArrayList<>();
        for(int i =0; i<charArray.length; i++) {
            if(charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' ||
                    charArray[i] == 'o' || charArray[i] == 'u')
//                characterArrayList.add(charArray[i]);
            vowels.append(charArray[i]);
            else
                System.out.print(charArray[i]);
        }
        System.out.println();
        /*
        System.out.println(characterArrayList);
        Collections.reverse(characterArrayList);
        System.out.println(characterArrayList);*/
        System.out.println(vowels.reverse());
    }
}
