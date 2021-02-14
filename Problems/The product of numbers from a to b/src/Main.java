import java.util.Scanner;
class Main {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        long prod;
//        int a = scan.nextInt();
//        prod = a;
//        int b = scan.nextInt();
//        a += 1;
//        while (a < b) {
//            prod *= a++;
//        }
//        System.out.println(prod);
        int i = 0;
        while (i < 10) {
            i++;
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}