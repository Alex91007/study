package homework6;

import java.util.Random;

public class Сontainer extends Literals {
    Random ran = new Random();
    public int squareLarge() {

        double sideLength = getDiagonalOfTheSquareIsLarge() / getSquareRoot();
        int volume = (int)(sideLength * sideLength * sideLength);
        return volume;
    }

    public int smallSquare() {

        double sideLength = getDiagonalOfTheSquareIsSmall() / getSquareRoot();
        int volume = (int)(sideLength * sideLength * sideLength);
        return volume;
    }

    public int largeCylinder() {

        int volume = (int)(((ran.nextInt(90) + 10) * getP() * getDiameterLarge()) / 4);
        return volume;
    }

    public int smallCylinder() {

        int volume = (int)(((ran.nextInt(90) + 10) * getP() * getSmallDiameter()) / 4);
        return volume;
    }

    public int largeCone() {

        int volume = (int)(((ran.nextInt(90) + 10) * getP() * getDiameterLarge()) / 3);
        return volume;
    }

    public int smallCone() {

        int volume = (int)(((ran.nextInt(90) + 10) * getP() * getSmallDiameter()) / 3);
        return volume;
    }
}
