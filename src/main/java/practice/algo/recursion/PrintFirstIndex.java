package practice.algo.recursion;

public class PrintFirstIndex {
    public static void main(String[] args) {
        int[] arr = {2,3,6,9,8,7,8,3,2,6,2,4};
        int x = 4;
        int n = 0;
        System.out.println(printFirstOccurrenceIndex(arr, x, n));

    }
    private static int printFirstOccurrenceIndex(int[] arr, int x, int n) {

        if(arr.length == 0 || n == arr.length) {
            return -1;
        }else if(arr[n] == x) {
            return n;
        }

        return printFirstOccurrenceIndex(arr, x, n+1);
    }
}
