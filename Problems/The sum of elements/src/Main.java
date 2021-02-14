import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nextNum;
        int sum = 0;
        do {
            nextNum = scan.nextInt();
            sum += nextNum;
        } while (nextNum != 0);
        System.out.println(sum);
    }
}