package homework5;

import java.sql.SQLOutput;

public class Phone {
    private int number;
    private String model;
    private int weight;

    public void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + "номер - " + number);
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void sendMessage(int ... number) {
        for (int i = 0; i < number.length; i++) {
            System.out.println("Сообщение было отправленно на номер - " + number[i]);
        }

    }

    public int getNumber() {
        return number;
    }

    public Phone() {

    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
