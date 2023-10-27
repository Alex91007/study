package homework2.practicalask;

/*
 `  Имеется целое число, вводимое пользователем с консоли. Это число - сумма денег в рублях.
   -Вывести это число, добавив к нему слово "рубль" в правильном падеже ("рубль", "рублей", "рубля")
 */

import java.util.Scanner;
public class Money {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String message = "Введите сумму: ";
        System.out.print(message);
        int money = scanner.nextInt();

        switch (money % 10) {
            case 1: {
                String ruble = " рубль";
                System.out.println(money + ruble);
                break;
            }
            case 2,3,4: {
                String ruble = " рубля";
                System.out.println(money + ruble);
                break;
            }
            case 0,5,6,7,8,9,10: {
                String ruble = " рублей";
                System.out.println(money + ruble);
                break;
            }
        }
    }
}
