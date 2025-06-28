package practice.algo.strings;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveConsecutiveCharacters {
    public static void main(String[] args) {
        String str = "aabbcddee";
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = str.toCharArray();
        for(int i = 0; i<= chars.length; i = i+2) {
            if(chars[i+1] == chars[i] && chars[i+2] != chars[i]) {
                chars[i] = '*';
                chars[i+1] = '*';
            }
        }
        for(char c : chars) {
            System.out.print(c + " ");
        }
    }
}
