package ru.game;

import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {
//        Field field = new Field();
        System.out.println("********* Добро пожаловать в игру 'Камень, Ножницы, Бумага' *********");
        Scanner input = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = input.nextLine();
        System.out.println(name + ", рад Вас видеть!");
    }
}
