package practice.algo.arrays;

public class TransposeArray {
    public static void main(String[] args) {
        int[][] intArr = new int[][]{{1,2,3,4},
                                     {5,6,7,8},
                                     {9,10,11,12},
                                     {13,14,15,16}};

        System.out.println("Before Transpose : ");

        for(int i=0; i<intArr.length; i++) {
            for(int j=0; j<intArr[0].length; j++) {
                System.out.print(intArr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        transposeMatrix(intArr);
    }

    public static void transposeMatrix(int[][] intArr) {
        //Transpose Function
        for(int i=0; i<intArr.length; i++) {
            for(int j=0; j<i; j++) {
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
    }
}
