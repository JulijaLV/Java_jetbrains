import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] parts = line.split(" ");
        Double op1 = Double.parseDouble(parts[0]);
        char operand = parts[1].charAt(0);
        Double op2 = Double.parseDouble(parts[2]);

        double res;
        long resLong;
        switch (operand) {
            case '+':
                res = op1 + op2;
                resLong = (long) res;
                break;
            case '-':
                res = op1 - op2;
                resLong = (long) res;
                break;
            case '*':
                res = op1 * op2;
                resLong = (long) res;
                break;
            case '/':
                if (op2 == 0) {
                    System.out.println("Division by 0!");
                    return;
                } else {
                    res = op1 / op2;
                    resLong = (long) res;
                    break;
                }

            default:
                System.out.println("Unknown operator");
                return;
        }
        System.out.println(resLong);


    }
}