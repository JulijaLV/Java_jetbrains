import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] snail = new int[3];
        for (int i = 0; i < snail.length; i++) {
            snail[i] = scanner.nextInt();
        }
        int days = (snail[0] - snail[2] - 1) / (snail[1] - snail[2]) + 1;
        System.out.println(days);
    }
}