import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            String line = scan.nextLine();
            Collections.addAll(list, line.split("\\s+"));
        }
        int listSize = list.size() - 1;
        for (int i = listSize; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}