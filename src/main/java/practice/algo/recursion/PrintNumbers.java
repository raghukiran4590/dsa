package practice.algo.recursion;

public class PrintNumbers {
    public static void main(String[] args) {
        int num = 5;
        int counter = num-1;
        printNumbers(num, counter);
    }

    public static void printNumbers(int num, int counter) {
        if(counter < 0) {
            return;
        }
        int res = num - counter;
        System.out.println(res);
        counter--;
        printNumbers(num, counter);
    }
}
