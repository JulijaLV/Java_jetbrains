import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sumSix = 0;
        int nextInt;
        int seqElm = scan.nextInt();
        for (int i = 0; i < seqElm; i++) {
            nextInt = scan.nextInt();
            sumSix = nextInt % 6 == 0 ? sumSix + nextInt : sumSix;
        }

        System.out.println(sumSix);
    }
}