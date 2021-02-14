import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int wtf = scan.nextInt();
        System.out.print(wtf + " ");
        while (wtf != 1) {
            wtf = wtf % 2 == 0 ? wtf / 2 : wtf * 3 + 1;
            System.out.print(wtf + " ");
        }
    }
}