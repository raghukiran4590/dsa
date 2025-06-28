package practice.algo.arrays;

public class MaxMinSum {
    public static void main(String[] args) {
        int[] arr = {-1, 3, 4, 1};
        int max = 0, min = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        int sum = max + min;
        System.out.println(sum);
    }
}
