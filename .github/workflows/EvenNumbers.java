public class EvenNumbers {
    public static void main(String[] args) {
        // Заданный массив целых чисел
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Вывод чётных чисел из массива
        System.out.println("Чётные числа из массива:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " "); }
        }
    }
}
