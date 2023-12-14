package ru.game;

import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {
        int playerChoice = 0;
        System.out.println("********* Добро пожаловать в игру 'Камень, Ножницы, Бумага' *********");
        Scanner input = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = input.nextLine();
        System.out.println(name + ", рад Вас видеть!");
        System.out.println("*********************************************************************");
        while (playerChoice != 2) {
            GameLogic gameLogic = new GameLogic();
            gameLogic.showMenu();
            System.out.print("Ваш выбор: ");
            playerChoice = input.nextInt();
            switch (playerChoice) {
                case (0):
                    gameLogic.playGame();
                    break;
                case (1):
                    Field field = new Field();
                    System.out.println(field.GAME_RULES);
                    break;
                case (2):
                    break;
            }
            System.out.println("*********************************************");
        }
    }
}
