package practice.algo.arrays;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {

        int[][] intArr = new int[][]{{1,5,9,13},
                                     {2,6,10,14},
                                     {3,7,11,15},
                                     {4,8,12,16}};

        System.out.println("Before Reversal : ");

        for(int i=0; i<intArr.length; i++) {
            for(int j=0; j<intArr[0].length; j++) {
                System.out.print(intArr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        reverseRows(intArr);

    }

    public static void reverseRows(int[][] intArr) {
        //Transpose an Array
        for(int i=0; i<intArr.length; i++) {
            for(int j=0; j<intArr[i].length; j++) {
                    int temp = intArr[i][j];
                    intArr[i][j] = intArr[j][i];
                    intArr[j][i] = temp;
            }
        }

        System.out.println("After Transpose : ");

        for(int i=0; i<intArr.length; i++) {
            for(int j=0; j<intArr[0].length; j++) {
                System.out.print(intArr[i][j]+" ");
            }
            System.out.println();
        }

        // In-place reversal
//        int[] arr1 = {1, 2, 3, 4, 5}; // {5,4,3,2,1}

        for(int i =0; i< intArr.length; i++) {
            for(int j=0; j<intArr[j].length/2; j++) {
                int temp = intArr[i][j];
                intArr[i][j] = intArr[i][intArr[i].length-1-j];
                intArr[i][intArr[i].length-1-j] = temp;
            }
        }

        System.out.println("After Reversal of Rows : ");

        for(int i=0; i<intArr.length; i++) {
            for(int j=0; j<intArr[0].length; j++) {
                System.out.print(intArr[i][j]+" ");
            }
            System.out.println();
        }


    }
}

