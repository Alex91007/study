package homework2.practicalask;

/*
    Дано целое число. Определить, является ли последняя цифра этого числа – цифрой 3.
 */

import java.util.Scanner;

public class Number3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "Введите число: ";
        System.out.print(str);
        int  number = scanner.nextInt();

        if (number == 3) {
            System.out.println(number);
        } else if (number % 10 == 3) {
            int x = number % 10;
            String message1 = "Последня цифра этого числа является 3";
            System.out.println(message1);
        } else {
            String message = "Последняя цифра этого числа не является 3";
            System.out.println(message);
        }
    }
}
