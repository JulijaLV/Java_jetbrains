import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] annSleep = new int[3];
        for (int i = 0; i < annSleep.length; i++) {
            annSleep[i] = scan.nextInt();
        }
        if (annSleep[2] >= annSleep[0] && annSleep[2] <= annSleep[1]) {
            System.out.println("Normal");
        } else if (annSleep[2] < annSleep[0]) {
            System.out.println("Deficiency");
        } else {
            System.out.println("Excess");
        }
    }
}