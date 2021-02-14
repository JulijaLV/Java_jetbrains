import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int nextNum;
        int lastNum;
        char order = 0;
        boolean result = true;
        Scanner scan = new Scanner(System.in);
        nextNum = scan.nextInt();
        lastNum = nextNum;
        while (nextNum != 0) {
//            Lets set the order first
            if (order == 0) {
                if (lastNum < nextNum) {
                    order = 'A';
                } else if (lastNum > nextNum) {
                    order = 'D';
                }
            } else {
//                Once order set
                if (order == 'A' && nextNum < lastNum && result) {
                    result = false;
                } else if (order == 'D' && nextNum > lastNum && result) {
                    result = false;
                }
            }
            lastNum = nextNum;
            nextNum = scan.nextInt();
        }
        System.out.println(result);
    }
}