package homework4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        RandomNumAndStr randomNumAndStr = new RandomNumAndStr();

        String[][] matrix = new String[10][10];
        int a = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (a % 3 == 0) {
                    matrix[i][j] = String.valueOf(Math.random()).substring(0, 7);
                } else {
                    matrix[i][j] = randomNumAndStr.randomStr();
                }
                a++;
            }
        }

        randomNumAndStr.diagonalOutput(matrix);
        System.out.println();
        randomNumAndStr.reversdiagonalOutput(matrix);
        System.out.println();

        String[] arrDigRevDig = new String[20];

        int dig = 0;
        int revDig = 9;
        for (int y = 0; y < 20; y++) {
            if (y <= 9) {
                arrDigRevDig[y] = matrix[dig][dig];
                dig++;
            } else {
                arrDigRevDig[y] = matrix[revDig][revDig];
                revDig--;
            }
        }

        for (int i = 0; i < 20; i++) {
                System.out.print(arrDigRevDig[i] + " ");
        }

        System.out.println();
        System.out.println();

        randomNumAndStr.comparison(arrDigRevDig);

        randomNumAndStr.threeCharacters(arrDigRevDig);

        randomNumAndStr.rounding(arrDigRevDig);

        System.out.println();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
