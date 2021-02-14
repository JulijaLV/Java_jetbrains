import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int num;
        while ((num = scan.nextInt()) != 0 && sum < 1000) {
            sum += num;
        }
        if (sum >= 1000) {
            System.out.println(sum - 1000);
        } else {
            System.out.println(sum);
        }
    }
}