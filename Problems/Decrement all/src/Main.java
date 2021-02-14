import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            numbers[i]--;
        }
        for (int i:numbers) {
            System.out.print(i);
            System.out.print(' ');
        }

    }
}