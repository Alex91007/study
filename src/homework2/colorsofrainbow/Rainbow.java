package homework2.colorsofrainbow;

import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Rainbow {

    private String red = "красный";
    private String orange = "оранжевый";
    private String yellow = "желтый";
    private String green = "зеленый";
    private String blue1 = "голубой";
    private String blue2 = "синий";
    private String violet = "феолетоый";
    private String erro = "Нет такова цвета!";
    public void colorOutput() {

        String str = "Введите один или дваномер цвеита от 1 до 7: ";
        System.out.print(str);
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int num1 = number / 10;
        int num2 = number % 10;

        if (num1 == num2 || number > 77) {
            System.out.println(erro);
        } else if (number > 10) {
            switch (num1) {
                case 1: {
                    String str1 = "красно-";
                    System.out.print(str1);
                    break;
                }
                case 2: {
                    String str2 = "оранжево-";
                    System.out.print(str2);
                    break;
                }
                case 3: {
                    String str3 = "желто-";
                    System.out.print(str3);
                    break;
                }
                case 4: {
                    String str4 = "зелено-";
                    System.out.print(str4);
                    break;
                }
                case 5: {
                    String str5 = "голубо-";
                    System.out.print(str5);
                    break;
                }
                case 6: {
                    String str6 = "синий-";
                    System.out.print(str6);
                    break;
                }
                case 7: {
                    String str7 = "феолетоый-";
                    System.out.print(str7);
                    break;
                }
            }
            switch (num2) {
                case 1: {
                    System.out.print(red);
                    break;
                }
                case 2: {
                    System.out.print(orange);
                    break;
                }
                case 3: {
                    System.out.print(yellow);
                    break;
                }
                case 4: {
                    System.out.print(green);
                    break;
                }
                case 5: {
                    System.out.print(blue1);
                    break;
                }
                case 6: {
                    System.out.print(blue2);
                    break;
                }
                case 7: {
                    System.out.print(violet);
                    break;
                }
            }
        } else {
            switch (number) {
                case 1: {
                    System.out.print(red);
                    break;
                }
                case 2: {
                    System.out.print(orange);
                    break;
                }
                case 3: {
                    System.out.print(yellow);
                    break;
                }
                case 4: {
                    System.out.print(green);
                    break;
                }
                case 5: {
                    System.out.print(blue1);
                    break;
                }
                case 6: {
                    System.out.print(blue2);
                    break;
                }
                case 7: {
                    System.out.print(violet);
                    break;
                }
            }
        }
    }
}
