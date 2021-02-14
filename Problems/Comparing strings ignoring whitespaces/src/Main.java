import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine().replace(" ", "");
        String str2 = scan.nextLine().replace(" ", "");
        System.out.println(str1.equalsIgnoreCase(str2));
    }
}