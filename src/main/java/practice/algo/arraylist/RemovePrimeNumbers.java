package practice.algo.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class RemovePrimeNumbers {

    public static void removePrime(ArrayList<Integer> A) {

        Iterator<Integer> iteratorList = A.iterator();
        while(iteratorList.hasNext()){
            int num = iteratorList.next();
            if(isPrime(num))
                iteratorList.remove();
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(728);
        arrayList.add(556);
        arrayList.add(783);
        arrayList.add(501);
        arrayList.add(768);
        arrayList.add(335);
        arrayList.add(641);
        arrayList.add(378);
        arrayList.add(745);
        arrayList.add(281);
        arrayList.add(768);
        arrayList.add(556);
        arrayList.add(359);
        arrayList.add(896);
        arrayList.add(173);
        arrayList.add(271);
        arrayList.add(658);
        arrayList.add(260);
        arrayList.add(528);
        arrayList.add(782);
        arrayList.add(381);
        arrayList.add(868);
        arrayList.add(866);
        arrayList.add(376);
        arrayList.add(227);

        System.out.println(arrayList);

        int size = arrayList.size();

        removePrime(arrayList);

        System.out.println(arrayList);
    }
}
