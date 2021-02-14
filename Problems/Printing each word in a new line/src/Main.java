import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int size = 0;
        Scanner scan = new Scanner(System.in);
        while (size < 5) {
            String line = scan.nextLine();
            String[] words = line.split("\\s+");
            size += words.length;
            for (String word : words) {
                System.out.println(word);
            }
        }
    }
}