import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int[] q1 = new int[2];
        int[] q2 = new int[2];
        Scanner scan = new Scanner(System.in);
        q1[0] = scan.nextInt();
        q1[1] = scan.nextInt();
        q2[0] = scan.nextInt();
        q2[1] = scan.nextInt();
        if (q1[0] == q2[0] || q1[1] == q2[1] ||
                Math.abs(q1[0] - q2[0]) == Math.abs(q1[1] - q2[1])) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}