package lesson01.part1;

import java.util.Scanner;

public class Task10 {

    /**
     * Не думать о секундах…
     * Напиши код, который считает сколько секунд прошло с 15:00, если на часах 15:30. Выведи результат на экран.
     * <p>
     * <p>
     * Требования:
     * 1. Программа должна выводить текст.
     * 2. Выведенный текст должен быть целым положительным числом.
     * 3. Выведенное число должно быть кратно 60.
     * 4. Выводимое число должно соответствовать заданию.
     */

    public static void main(String[] args) {
        int i;
        int secondsAfter15 = 0;
        int minutes = 30;
        for (i=0; i<minutes; i++){
            secondsAfter15 = secondsAfter15+60;
        }

        System.out.println(secondsAfter15);
    }
}
