import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nextNum;
        int max = 0;
        do {
            nextNum = scan.nextInt();
            max = Math.max(nextNum, max);
        } while (nextNum != 0);
        System.out.println(max);
    }
}