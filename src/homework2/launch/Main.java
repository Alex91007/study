package homework2.launch;
/*
    •	Создать новый пакет, как в первом задании (в последующем по дефолту). Создать два класса (в разных пакетах),
        первый - только для запуска второй класс - Радуга.
    •	Класс Радуга должен уметь выводить названия цветов по введенным номерам цветов. (сопоставление цвет-номер
        на ваше усмотрение).
    •	Класс Радуга может выводить не только основные цвета но еще и полуцвета (например, желто-зеленый);
    •	Способ задания номеров цвета придумать самостоятельно.
    •	Использовать для решения задачи if и switch.
    •	Методы можно вызывать друг из друга. Постарайтесь уменьшить дублирование кода. Обратить внимание на именование
        методов, классов, переменных и констант.

 */
import homework2.colorsofrainbow.Rainbow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Rainbow color = new Rainbow();
        color.colorOutput();
    }
}
