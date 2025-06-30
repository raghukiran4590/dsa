package practice.algo.recursion;

public class PrintIncreasing {
    public static void main(String[] args) {
        int num = 5;
        printNumbers(num);
    }
    public static void printNumbers(int num) {
        if (num == 0) {
            return;
        }
        printNumbers(num - 1);
        System.out.println(num);
    }
}
