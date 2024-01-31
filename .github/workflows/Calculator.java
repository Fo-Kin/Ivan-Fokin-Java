import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Вводим два целых числа
        System.out.print("Введите число a: ");
        int a = scanner.nextInt();

        System.out.print("Введите число b: ");
        int b = scanner.nextInt();

        // Сравниваем числа и выводим результат
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Выполняем операции сложения, вычитания, деления и умножения и выводим результат
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        // Проверяем нет деления на 0
        if (b != 0) {
        System.out.println("a / b = " + ((double) a / b));
        } else {
        System.out.println("Деление не возможно, так как b = 0");}

       


        // Закрываем Scanner
        scanner.close();
    }
}
