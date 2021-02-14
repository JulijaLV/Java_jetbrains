import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        long next;
        long i = 0;
        long maxFour = 0;
        while (i < num) {
            next = scan.nextLong();
            maxFour = next % 4 == 0 && next > maxFour ? next : maxFour;
            i++;
        }
        System.out.println(maxFour);
    }
}