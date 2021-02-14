import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        for (;;) {
            i = scan.nextInt();
            if (i == 0) {
                break;
            }
            System.out.println(i % 2 == 0 ? "even" : "odd");
        }
    }
}