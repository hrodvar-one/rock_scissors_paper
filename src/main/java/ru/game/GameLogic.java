package ru.game;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {

    public void roundResult(String choosingPlayer, String choosingComputer) {
        if (choosingPlayer.equals(choosingComputer)) {
            System.out.println("Результат раунда: Ничья");
        } else if (choosingPlayer.equals("Камень")) {
            if (choosingComputer.equals("Ножницы")) {
                System.out.println("Результат раунда: Выиграл игрок");
            } else {
                System.out.println("Результат раунда: Выиграл компьютер");
            }
        } else if (choosingPlayer.equals("Ножницы")) {
            if (choosingComputer.equals("Бумага")) {
                System.out.println("Результат раунда: Выиграл игрок");
            } else {
                System.out.println("Результат раунда: Выиграл компьютер");
            }
        } else {
            if (choosingComputer.equals("Камень")) {
                System.out.println("Результат раунда: Выиграл игрок");
            } else {
                System.out.println("Результат раунда: Выиграл компьютер");
            }
        }
    }

    public void playGame() {
        String[] gameElements = {
                "Камень", "Ножницы", "Бумага"
        };
        System.out.println();
        System.out.println("**************** Игра начинается ********************");
        int roundGame = 1;
        while (roundGame <= 3) {
            System.out.println();
            System.out.println("**************** Раунд " + roundGame + " ********************");
            Random random = new Random();
            String choosingComputer = gameElements[random.nextInt(gameElements.length)];
            System.out.println();
            System.out.println("Компьютер сделал свой выбор.");
            System.out.println();
            System.out.print("Введите ваш выбор (Камень, Ножницы или Бумага): ");
            boolean trigger = true;
            while (trigger) {
                Scanner input = new Scanner(System.in);
                String choosingPlayer = input.nextLine();
                for (String gameElement : gameElements) {
                    if (choosingPlayer.equals(gameElement)) {
                        roundResult(choosingPlayer, choosingComputer);
                        break;
                    }
                }
                trigger = false;
            }
            roundGame++;
        }
    }

    public void showMenu() {
        String[] menu = {
                "Начать игру", "Посмотреть правила", "Выход"
        };
        System.out.println("Выберите команду из меню:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }
}
