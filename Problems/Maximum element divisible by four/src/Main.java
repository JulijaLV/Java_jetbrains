import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = 0;
        int nextInt;
        int seqElm = scan.nextInt();
        for (int i = 0; i < seqElm; i++) {
            nextInt = scan.nextInt();
            max = nextInt % 4 == 0 ?  nextInt > max ? nextInt : max : max;
        }
        System.out.println(max);
    }
}
