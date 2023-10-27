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
    private String error = "Нет такова цвета!";
    public void colorOutput() {

        String str = "Введите один или два номер цвеита от 1 до 7: ";
        System.out.print(str);
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int num1 = number / 10;
        int num2 = number % 10;

        if (num1 == num2 || number > 77) {
            System.out.println(error);
        } else if (number > 10) {
            switch (num1) {
                case 1: {
                    String mixedRed = "красно-";
                    System.out.print(mixedRed);
                    break;
                }
                case 2: {
                    String mixedOrange = "оранжево-";
                    System.out.print(mixedOrange);
                    break;
                }
                case 3: {
                    String mixedYellow = "желто-";
                    System.out.print(mixedYellow);
                    break;
                }
                case 4: {
                    String mixedGreen = "зелено-";
                    System.out.print(mixedGreen);
                    break;
                }
                case 5: {
                    String mixedBlue1 = "голубо-";
                    System.out.print(mixedBlue1);
                    break;
                }
                case 6: {
                    String mixedBlue2 = "синий-";
                    System.out.print(mixedBlue2);
                    break;
                }
                case 7: {
                    String mixedViolet = "феолетоый-";
                    System.out.print(mixedViolet);
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
