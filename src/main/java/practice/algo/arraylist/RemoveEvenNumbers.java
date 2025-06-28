package practice.algo.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveEvenNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(5,15,4,10,8,9,7,1,2,3));
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        for(int i = arrayList.size() -1 ; i>-0; i--) {
            if(arrayList.get(i) % 2 == 0) {
                arrayList.remove(i);
            }
        }
        System.out.println(arrayList);
    }
}
