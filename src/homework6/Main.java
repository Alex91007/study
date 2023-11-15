package homework6;

public class Main {
    public static void main(String[] args) {
        Port port = new Port();

        port.fillThePort();

        port.massOfWaterInThePort();

        port.removeShipPort("Бурный");

        for (Ship a : port.port) {
            System.out.println(a);
        }
    }
}

