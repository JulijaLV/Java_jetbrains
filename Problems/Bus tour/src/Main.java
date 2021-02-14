import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int busH = scan.nextInt();
        int bridgeQty = scan.nextInt();
        int bridge;
        int i;
        for (i = 1; i <= bridgeQty; i++) {
            bridge = scan.nextInt();
            if (bridge <= busH) {
                System.out.println("Will crash on bridge " + i);
                return;
            }
        }
        System.out.println("Will not crash");
    }
}