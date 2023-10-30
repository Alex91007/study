package homework3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] catNames = {"Кузя", "Алиса", "Пушок", "Каспер", "Снежок", "Феликс", "Рокки", "Астра", "Соня", "Лиза"};

        Cat cat1 = new Cat();

        for (int i = 0; i < 10; i++) {
                cat1.catKuza();
        }

        for (int x = 0; x < 10; x++) {
            cat1.setNameCat(catNames[random.nextInt(catNames.length)]);
            cat1.setAgeCat(random.nextInt(27) + 1);

            String output = x + " Кота завут - " + cat1.getNameCat() + ", возраст - " + cat1.getAgeCat();
            System.out.println(output);
        }

        int e = 0;
        do {
            e++;
            Cat cat2 = new Cat(catNames[random.nextInt(catNames.length)], random.nextInt(27) + 1);
            String output = e + " Кота завут - " + cat2.getNameCat() + ", возраст - " + cat2.getAgeCat();
            System.out.println(output);
        } while(e < 10);

        Cat[] cat3 = new Cat[4];

        for (Cat cat: cat3) {;
            char a = (char)(random.nextInt(33) + 'А');
            char b = (char)(random.nextInt(33) + 'а');
            char c = (char)(random.nextInt(33) + 'а');
            String name = String.valueOf(a) + String.valueOf(b) + String.valueOf(c);
            int i = 0;
            i++;
            cat3[i] = new Cat(name, random.nextInt(27) + 1);
            System.out.println(cat3[i]);
        }

        Cat a = new Cat();
        Cat b = new Cat();

        System.out.println(a.equals(b));
    }
}