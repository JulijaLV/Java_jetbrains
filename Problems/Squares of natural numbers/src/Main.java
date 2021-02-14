import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int i = 1;
        while (i * i <= number) {
            System.out.println(i * i);
            i++;
        }
    }
}