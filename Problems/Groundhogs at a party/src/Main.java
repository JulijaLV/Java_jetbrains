import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cupsQty = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        boolean weekend = isWeekend && cupsQty >= 15 && cupsQty <= 25;
        boolean workWeek = !isWeekend && cupsQty >= 10 && cupsQty <= 20;
        System.out.println(weekend || workWeek);
    }
}