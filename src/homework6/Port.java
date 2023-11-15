package homework6;

import java.sql.SQLOutput;

public class Port extends Ship {

    Ship[] port = new Ship[10];

    public void fillThePort() {

        for (int i = 0; i < port.length; i++) {
            Ship ship = new Ship();
            ship.shipType();
            port[i] = ship;
            System.out.println(ship.toString());
        }
    }
    public void addAShipToPort(int berth) {

        Ship ship = new Ship();
        ship.shipType();
        port[berth] = ship;
    }

    public void removeShipPort(String name) {

        for (int i = 0; i < 9; i++) {
            if (port[i].name.equals(name)) {
                port[i] = null;
                System.out.println(name + " " +getRemoveShip());
            } else {
                continue;
            }
        }
    }

    public void massOfWaterInThePort() {

        int weight = 0;
        for (int i = 0; i < 9; i++) {
            if(1000 == port[i].lightWater) {
                weight = weight + (port[i].water() * port[i].lightWater);
            } else {
                weight = weight + (port[i].volume * port[i].lightWater);
            }
        }

        System.out.println(getMassOfWater() + " " + weight);
    }


}
