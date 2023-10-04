package lesson1;

import java.time.LocalDateTime;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner scanz = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = scanz.nextLine();
        System.out.println("Привет, " + name);

    }
}
