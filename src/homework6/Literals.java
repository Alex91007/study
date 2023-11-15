package homework6;

public class Literals {

    private double squareRoot = 1.414D;
    private double diagonalOfTheSquareIsLarge = 20.0D;
    private double diagonalOfTheSquareIsSmall = 10;

    private double p = 3.1415926535D;
    private double diameterLarge = 20.0D;
    private double smallDiameter = 10.0D;

    private String removeShip = "Покинул порт";
    private String massOfWater = "Общая масса воды в порте состовляет - ";

    public double getSquareRoot() {
        return squareRoot;
    }

    public double getDiagonalOfTheSquareIsLarge() {
        return diagonalOfTheSquareIsLarge;
    }

    public double getDiagonalOfTheSquareIsSmall() {
        return diagonalOfTheSquareIsSmall;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getDiameterLarge() {
        return diameterLarge;
    }

    public double getSmallDiameter() {
        return smallDiameter;
    }

    public String getRemoveShip() {
        return removeShip;
    }

    public String getMassOfWater() {
        return massOfWater;
    }
}
