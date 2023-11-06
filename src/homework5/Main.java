package homework5;

public class Main {
    public static void main(String[] args) {
        Phone Alex = new Phone(3463454, "F-123");
        Phone Dima = new Phone(5432341, "SV-234");
        Phone Sergei = new Phone(1236567, "FG-123");

        System.out.println(Alex);
        System.out.println(Dima);
        System.out.println(Sergei);

        Alex.receiveCall("Dima");
        Dima.receiveCall("Sergei");
        Sergei.receiveCall("Alex");

        Alex.receiveCall("Dima", 1234412);

        Alex.sendMessage(3463454, 5432341, 1236567, 1235878);
    }
}
