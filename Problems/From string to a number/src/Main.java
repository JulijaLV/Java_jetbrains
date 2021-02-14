import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine().toUpperCase();
        switch (num) {
            case "ONE":
                System.out.println(1);
                break;
            case "TWO":
                System.out.println(2);
                break;
            case "THREE":
                System.out.println(3);
                break;
            case "FOUR":
                System.out.println(4);
                break;
            case "FIVE":
                System.out.println(5);
                break;
            case "SIX":
                System.out.println(6);
                break;
            case "SEVEN":
                System.out.println(7);
                break;
            case "EIGHT":
                System.out.println(8);
                break;
            case "NINE":
                System.out.println(9);
                break;
            default:
                System.out.println("unknown");
        }
    }
}