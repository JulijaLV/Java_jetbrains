import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        ArrayList<Integer> eqRoots = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int eqRoot;
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        for (int i = 0; i <= 1000; i++) {
            eqRoot = a * i * i * i + b * i * i + c * i + d;
            if (eqRoot == 0) {
                eqRoots.add(i);
            }
        }
        Collections.sort(eqRoots);
        for (int i:eqRoots) {
            System.out.println(i);
        }
    }
}