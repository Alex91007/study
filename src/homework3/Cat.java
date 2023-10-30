package homework3;

import java.util.Objects;
import java.util.Scanner;

public class Cat {

    private String nameCat = "Кузя";
    private int ageCat = 5;

    public String getNameCat() {
        return nameCat;
    }

    public void setNameCat(String nameCat) {
        this.nameCat = nameCat;
    }

    public int getAgeCat() {
        return ageCat;
    }

    public void setAgeCat(int ageCat) {
        this.ageCat = ageCat;
    }

    public void catKuza() {
        String str = "Кот завут " + nameCat + " ему " + ageCat + " лет.";
        System.out.println(str);
    }

    public Cat() {

    }

    public Cat(String nameCat, int ageCat) {
        this.nameCat = nameCat;
        this.ageCat = ageCat;
    }

    public String toString() {
        return nameCat + "," + ageCat;
    }

    @Override
    public boolean equals(Object obj) {
        Cat otherCat = (Cat) obj;
        return this.nameCat == otherCat.nameCat;
    }
}