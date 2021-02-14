import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var number = scanner.nextInt();
        int result = (number / 10) % 10;
        System.out.println(result);
    }
}