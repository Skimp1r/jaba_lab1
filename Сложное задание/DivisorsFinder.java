import java.util.Scanner;

public class DivisorsFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int n = in.nextInt();

        printDivisors(n);
    }

    public static void printDivisors(int number) {
        int temp = Math.abs(number);

        if (temp == 0) {
            System.out.println("У числа 0 бесконечно много делителей.");
            return;
        }

        System.out.print("Делители числа " + number + ": ");
        int count = 0;

        for (int i = 1; i <= temp; i++) {
            if (temp % i == 0) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nКоличество делителей: " + count);
    }
}
