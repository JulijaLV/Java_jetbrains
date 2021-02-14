import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;
        int counter = 0;
        boolean go = true;
        while (go) {
            for (int j = 0; j < i; j++) {
                if (counter == n) {
                    go = false;
                    break;
                }
                System.out.print(i + " ");
                counter++;
            }
            i++;
        }
    }
}