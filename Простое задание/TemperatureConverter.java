import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Выберите операцию:");
        System.out.println("1 - Перевод из Цельсия в Фаренгейт");
        System.out.println("2 - Перевод из Фаренгейта в Цельсий");
        System.out.print("Ваш выбор: ");
        int choice = in.nextInt();

        if (choice == 1) {
            System.out.print("Введите температуру в Цельсиях (°C): ");
            double celsius = in.nextDouble();
            double fahrenheit = celsius * 1.8 + 32;
            System.out.printf("Температура в Фаренгейтах: %.2f °F\n", fahrenheit);
        } else if (choice == 2) {
            System.out.print("Введите температуру в Фаренгейтах (°F): ");
            double fahrenheit = in.nextDouble();
            double celsius = (fahrenheit - 32) / 1.8;
            System.out.printf("Температура в Цельсиях: %.2f °C\n", celsius);
        } else {
            System.out.println("Ошибка: неверный выбор операции.");
        }
    }
}
