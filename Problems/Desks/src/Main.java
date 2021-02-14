import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var gr1 = scanner.nextInt();
        var gr2 = scanner.nextInt();
        var gr3 = scanner.nextInt();

        int sumGr1 = gr1 / 2 + gr1 % 2;
        int sumGr2 = gr2 / 2 + gr2 % 2;
        int sumGr3 = gr3 / 2 + gr3 % 2;
        System.out.println(sumGr1 + sumGr2 + sumGr3);

    }
}