package practice.algo.recursion;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        System.out.print(getFactorial(num));
    }
    public static int getFactorial(int num) {
        if(num == 1) {
            return num;
        }
        return num * getFactorial(num - 1);
    }
}
