package homework4;

import java.util.Objects;
import java.util.Random;
import java.util.regex.Pattern;

public class RandomNumAndStr {

    Random random = new Random();

    public String randomStr() {

        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz";
        char[] charLetters = letters.toCharArray();
        StringBuilder ranStr = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            ranStr.append(charLetters[random.nextInt(charLetters.length)]);
        }
        return ranStr.toString();
    }

    public void diagonalOutput (String[][]matrix){
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][i]);
        }
    }

     public void reversdiagonalOutput (String[][]matrix){
        for (int i = 9; i <= matrix.length; i--) {
            if (i == -1) {
                break;
            }
            System.out.println(matrix[i][i]);
        }
    }

    public void comparison(String[] arr) {
        StringBuilder dig = new StringBuilder();
        StringBuilder revDig = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i <= 10) {
                dig.append(arr[i]);
            } else {
                revDig.append(arr[i]);
            }
        }
        System.out.println(dig.equals(revDig));
    }

    public void threeCharacters(String[] array) {
        StringBuilder threeElement = new StringBuilder();
        for (String s : array) {
            if (s.matches("[a-zA-Z]*$")) {
                threeElement.append(s.substring(2, 5)).append(", ");
            }
        }
        System.out.println(threeElement);
    }

    public void rounding(String[] array) {
        double[] numRouding = new double[6];
        for (int i = 0; i < array.length; i++) {
            int a = 0;
            if (array[i].matches("[0-9].[0-9]+")) {
                Double dub = Double.valueOf(array[i]);
                numRouding[a] = Math.round(dub);
                a++;
            }
        }
        for (double s : numRouding) {
            System.out.println(s);
        }
    }
}
