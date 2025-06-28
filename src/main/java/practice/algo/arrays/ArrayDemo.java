package practice.algo.arrays;

import java.util.*;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] a = {1,2,9,6,4,10,12,3,5};
        int[] b = {1,33,45,67,9,2,3,4,5};
        Arrays.sort(a);
        for(int i: a) {
            System.out.print(i+ " ");
        }
        System.out.println();
        List<Integer> integerList = new ArrayList<>(Arrays.stream(a).boxed().toList());
        Collections.sort(integerList);
        System.out.println(integerList);

        ArrayList<Integer> integers = new ArrayList<>(Arrays.stream(b).boxed().toList());
        System.out.println(integers.stream().sorted().toList());
    }
}
