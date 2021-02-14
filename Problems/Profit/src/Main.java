import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] money = new double[3];
        int years = 0;
        for (int i = 0; i < money.length; i++) {
            money[i] = scan.nextInt();
        }
        while (money[0] < money[2]) {
            money[0] = money[0] + money[1] * money[0] / 100;
            years++;
        }
        System.out.println(years);
    }
}