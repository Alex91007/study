package homework2.practicalask;

/*
    Дан порядковый номер месяца. Вывести на консоль пору года, к которой относится месяц.
 */

import java.util.Scanner;
public class TimeOfTheYear {

    public static void main(String[] args) {

        String messange = "Введите порядковый номер номер месяца: ";
        System.out.print(messange);
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number) {
            case 12,1,2: {
                String str = "Пора года - зима";
                System.out.println(str);
                break;
            }
            case 3,4,5: {
                String str = "Пора года - весна";
                System.out.println(str);
                break;
            }
            case 6,7,8: {
                String str = "Пора года - лето";
                System.out.println(str);
                break;
            }
            case 9,10,11: {
                String str = "Пора года - осень";
                System.out.println(str);
                break;
            }
            default: {
                String str = "В году 12 месяце!!!";
                System.out.println(str);
            }
        }
    }
}
