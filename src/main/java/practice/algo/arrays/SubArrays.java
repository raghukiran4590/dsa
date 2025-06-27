package practice.algo.arrays;

public class SubArrays {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        for(int startIndex = 0; startIndex<arr.length; startIndex++) {
            for(int endIndex = 0; endIndex<arr.length; endIndex++) {
                for(int subarrayIndex = startIndex; subarrayIndex<=endIndex; subarrayIndex++) {
                    System.out.print(arr[subarrayIndex]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
