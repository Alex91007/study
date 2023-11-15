package homework6;

public class Ship extends Сontainer {

    String[] pulName = {"Автроил", "Агатополь", "Абрек", "Аврора", "Азард", "Азимут", "Акару", "Бурный", "Бонасорте",
            "Бородино", "Восток", "Всадник", "Гагры", "Гамидие", "Глиндер", "Дамиад", "Десна", "Диана", "Днепр",
            "Донец", "Живучий", "Жуткий", "Изяслав", "Ингерманланд"};

    String name = pulName[ran.nextInt(pulName.length)];
    String numberOfDecks;
    String cargoOnTheFirstDeck;
    String cargoOnTheSecondDeck;
    int lightWater = water();
    int volume;

    public int water() {
        if (0 == ran.nextInt(2)) {
            return lightWater = 1000;
        } else {
            return lightWater = 2000;
        }
    }


    public void shipType() {

        int decks = ran.nextInt(2);
        int largeSoapContainer = ran.nextInt(2);
        int largeSoapContainerSecondDeck = ran.nextInt(2);
        int containerShape = ran.nextInt(3);
        int containerFormSecondDeck = ran.nextInt(3);
        if (0 == decks) {
            numberOfDecks = "однопалубный";
            if(0 == largeSoapContainer) {

                switch (containerShape) {
                    case 0: {
                        cargoOnTheFirstDeck = "куб";
                        volume = super.squareLarge();
                    }
                    case 1: {
                        cargoOnTheFirstDeck = "цилиндр";
                        volume = super.largeCylinder();
                    }
                    case 2: {
                        cargoOnTheFirstDeck = "конус";
                        volume = super.largeCone();
                    }
                }
            } else {

                switch (containerShape) {
                    case 0: {
                        cargoOnTheFirstDeck = "куб малый";
                        volume = super.smallSquare() + super.smallSquare() + super.smallSquare() + super.smallSquare();
                    }
                    case 1: {
                        cargoOnTheFirstDeck = "цилиндр малый";
                        volume = super.smallCylinder() + super.smallCylinder() + super.smallCylinder() +
                                super.smallCylinder();
                    }
                    case 2: {
                        cargoOnTheFirstDeck = "конус малый";
                        volume = super.smallCone() + super.smallCone() + super.smallCone() + super.smallCone();
                    }
                }
            }
        } else {

            int volumeParvayDeck = 0;
            int volumeSecondDeck = 0;

            numberOfDecks = "двухпалубный";

            if (0 == largeSoapContainer) {

                switch (containerShape) {
                    case 0: {
                        cargoOnTheFirstDeck = "куб";
                        volumeParvayDeck = super.squareLarge();
                    }
                    case 1: {
                        cargoOnTheFirstDeck = "цилиндр";
                        volumeParvayDeck = super.largeCylinder();
                    }
                    case 2: {
                        cargoOnTheFirstDeck = "конус";
                        volumeParvayDeck = super.largeCone();
                    }
                }
            } else {

                switch (containerShape) {
                    case 0: {
                        cargoOnTheFirstDeck = "куб малый";
                        volumeParvayDeck = super.smallSquare() + super.smallSquare() + super.smallSquare() +
                                super.smallSquare();
                    }
                    case 1: {
                        cargoOnTheFirstDeck = "цилиндр малый";
                        volumeParvayDeck = super.smallCylinder() + super.smallCylinder() + super.smallCylinder() +
                                super.smallCylinder();
                    }
                    case 2: {
                        cargoOnTheFirstDeck = "конус малый";
                        volumeParvayDeck = super.smallCone() + super.smallCone() + super.smallCone() + super.smallCone();
                    }
                }
            }

            if (0 == largeSoapContainerSecondDeck) {

                switch (containerFormSecondDeck) {
                    case 0: {
                        cargoOnTheSecondDeck = "куб";
                        volumeSecondDeck = super.squareLarge();
                    }
                    case 1: {
                        cargoOnTheSecondDeck = "цилиндр";
                        volumeSecondDeck = super.largeCylinder();
                    }
                    case 2: {
                        cargoOnTheSecondDeck = "конус";
                        volumeSecondDeck = super.largeCone();
                    }
                }
            } else {

                switch (containerFormSecondDeck) {
                    case 0: {
                        cargoOnTheSecondDeck = "куб малый";
                        volumeSecondDeck = super.smallSquare() + super.smallSquare() + super.smallSquare() +
                                super.smallSquare();
                    }
                    case 1: {
                        cargoOnTheSecondDeck = "цилиндр малый";
                        volumeSecondDeck = super.smallCylinder() + super.smallCylinder() + super.smallCylinder() +
                                super.smallCylinder();
                    }
                    case 2: {
                        cargoOnTheSecondDeck = "конус малый";
                        volumeSecondDeck = super.smallCone() + super.smallCone() + super.smallCone() + super.smallCone();
                    }
                }
            }

            volume = volumeParvayDeck + volumeSecondDeck;
        }
    }

    @Override
    public String toString() {
        return "Ship{" +
                "имя='" + name + '\'' +
                ", количество палуб='" + numberOfDecks + '\'' +
                ", первая палуба='" + cargoOnTheFirstDeck + '\'' +
                ", вторая палуба='" + cargoOnTheSecondDeck + '\'' +
                ", плотность воды=" + lightWater +
                ", объем=" + volume +
                '}';
    }
}
