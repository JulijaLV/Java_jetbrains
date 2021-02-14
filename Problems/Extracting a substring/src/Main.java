import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        System.out.println(str.substring(n1, n2 + 1));
    }
}