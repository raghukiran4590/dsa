package practice.algo.sorting;

import java.util.Random;

public class MergeSort {

    public static void printArray(int[] arr) {
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void divideArray(int[] inputArray) {
        int arrayLength = inputArray.length;

        if(arrayLength < 2) {
            return;
        }

        int midIndex = arrayLength/2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[arrayLength - midIndex];

        for(int i = 0; i< midIndex; i++) {
            leftHalf[i] = inputArray[i];
        }

        for(int j = midIndex; j< arrayLength; j++) {
            rightHalf[j - midIndex] = inputArray[j];
        }

        divideArray(leftHalf);
        divideArray(rightHalf);

        //Merge
        mergeArray(inputArray, leftHalf, rightHalf);

    }

    public static void mergeArray(int[] inputArray, int[] leftArray, int[] rightArray) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;
        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if(leftArray[i] <= rightArray[j]) {
                inputArray[k] = leftArray[i];
                i++;
            } else {
                inputArray[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while(i<leftSize) {
            inputArray[k] = leftArray[i];
            i++;
            k++;
        }

        while (j<rightSize) {
            inputArray[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        //initialize inputArray
        //Divide inputArray recursively until the size of the array is 1
        //Merge 2 arrays into 1 array(leftArray, rightArray, inputArray)

        int[] inputArray = new int[10];
        Random random = new Random();
        for(int i = 0; i<inputArray.length; i++) {
            inputArray[i] = random.nextInt(1, 1000);
        }

        System.out.print("Before Merged : ");
        //print Array
        printArray(inputArray);
        //Divide the Array
        divideArray(inputArray);
        System.out.println();
        System.out.print("After Merged : ");
        //print Array
        printArray(inputArray);

    }
}
