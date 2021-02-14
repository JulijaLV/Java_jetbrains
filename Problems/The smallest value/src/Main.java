import java.util.Scanner;
class Main {
    private static long factorial(long num) {
        long fct = 1;
        long i = 1;
        for (; i <= num; i++) {
            fct *= i;
        }
        return fct;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long m = scan.nextLong();
        long fct;
        long i = 1;
        do {
            i++;
            fct = factorial(i);
        } while (fct <= m);
        System.out.println(i);

    }
}