import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.toUpperCase();
        System.out.println(str.charAt(0) == 'J');
    }
}