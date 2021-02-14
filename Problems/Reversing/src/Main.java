import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var number = scanner.nextInt();
        var d1 = (number % 10) * 100;
        number = number / 10;
        var d2 = (number % 10) * 10;
        number = number / 10;
        var d3 = number % 10;
        var newNumber = d1 + d2 + d3;
        System.out.println(newNumber);
    }
}