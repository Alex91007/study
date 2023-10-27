package homework2.practicalask;

/*
    Написать программу, которая считывает год, введённый пользователем, и определяет,
    является ли этот год високосным.
    Год считается високосным, если он делится без остатка на 4. Однако, если год также делится на 100,
    то этот год не високосный, за исключением годов, делящихся на 400.
 */

import java.util.Scanner;
public class LeapYear {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = "Введите год: ";
        System.out.print(str);
        int year = scanner.nextInt();

        int checkFor4 = year % 4;
        int checkFor100 = year % 100;
        int checkFor400 = year % 400;

        String weighty = " год является весакосным.";
        String weightless = " год не является весакосным.";

        if (checkFor4 == 0) {
            System.out.println(year + weighty);
        } else if (checkFor100 == 0 && checkFor4 == 0) {
            System.out.println(year + weightless);
        } else if (checkFor100 == 0 && checkFor400 == 0) {
            System.out.println(year + weighty);
        } else {
            System.out.println(year + weightless);
        }
    }
}
