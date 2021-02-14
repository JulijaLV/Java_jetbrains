import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var number = scanner.nextInt();
        int i = 1;
        int sum = 0;
        do {
            int d = number / 10;
            int m = number % 10;
            number = d;
            sum += m;
            i++;
        }
        while (i <= 3);

        System.out.println(sum);
    }
}