import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var name = scan.nextLine();
        scan.nextLine();
        scan.nextLine();
        scan.nextLine();
        var cus = scan.nextLine();
        System.out.println("The form for " + name +
                " is completed. We will contact you if we need a chef that cooks " +
                cus + " dishes.");
    }
}