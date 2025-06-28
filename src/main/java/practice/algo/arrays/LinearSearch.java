package practice.algo.arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] A = {1,4,3,2};
        int B = 5;
        int output = 0;

        for(int i=0; i< A.length; i++) {
            if(A[i] == B) {
                output = 1;
                break;
            }
        }
        System.out.println(output);
    }
}
