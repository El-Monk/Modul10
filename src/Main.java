import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileInputStream("Test10.txt"));

        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        int sum = 0;

        if (numbers.length != 10)
            throw new IllegalArgumentException();

        for (String number: numbers) {
            sum += Integer.parseInt(number);
        }

        System.out.println("Сумма чисел = " + sum);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Введено некорректное количество чисел");
        }

        scanner.close();
    }
}
