package practice.algo.recursion;

public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        printElement(arr, 0);
    }
    private static void printElement(int[] arr, int indx) {
        if(indx == arr.length) {
            return;
        }
        System.out.println(arr[indx]);
        printElement(arr, indx + 1);
    }
}
