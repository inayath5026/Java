package Basics;
public class Patterns {

    public static void printInverted(int num) {
        for (int i = 1; i <= num; i++) {
            for (int s = 1; s <= num - i; s++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printNumbers(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void print01(int num) {
        int temp = 0;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                temp = (temp == 0) ? 1 : 0;
                System.out.print(temp);
            }
            System.out.println();
        }
    }

    public static void printButterfly(int num) {
        for (int i = 1; i <= num; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (num - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = num; i >= 1; i--) {
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (num - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printSolidRhombus(int num) {
        for (int i = 1; i <= num; i++) {
            for (int s = 1; s <= num - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printHollowRhombus(int num) {
        for (int i = 1; i <= num; i++) {
            for (int s = 1; s <= num - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= num; j++) {
                if (i == 1 || j == 1 || i == num || j == num) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printDiamond(int num) {
        for (int i = 0; i < num / 2 + 1; i++) {
            for (int j = 1; j <= (num / 2) - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = num / 2 - 1; i >= 0; i--) {
            for (int j = 1; j <= (num / 2) - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // printInverted(6);
        // printNumbers(6);
        // print01(6);
        // printButterfly(8);
        // printSolidRhombus(6);
        // printHollowRhombus(6);
        printDiamond(10);
    }
}