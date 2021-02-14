import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] boysHeight = new int[3];
        for (int i = 0; i < boysHeight.length; i++) {
            boysHeight[i] = scanner.nextInt();
        }
        System.out.println(boysHeight[0] <= boysHeight[1] &&
                            boysHeight[1] <= boysHeight[2]
                          ||
                            boysHeight[2] <= boysHeight[1] &&
                            boysHeight[1] <= boysHeight[0]);
    }
}