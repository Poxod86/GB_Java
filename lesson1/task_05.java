package lesson1;

import java.util.Arrays;

public class task_05 {
    public static void main(String[] args) {
        String text = "Добро пожаловать на курс по Java";
        String array[] = text.split(" ");
        System.out.println(Arrays.toString(array));
        String temp = "";
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}
