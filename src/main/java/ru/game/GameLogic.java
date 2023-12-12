package ru.game;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {

    public void roundResult(String choosingPlayer, String choosingComputer) {
        if (choosingPlayer.equals(choosingComputer)) {
            System.out.println("Ничья");
        } else if (choosingPlayer.equals("Камень")) {
            if (choosingComputer.equals("Ножницы")) {
                System.out.println("Выиграл игрок");
            } else {
                System.out.println("Выиграл компьютер");
            }
        } else if (choosingPlayer.equals("Ножницы")) {
            if (choosingComputer.equals("Бумага")) {
                System.out.println("Выиграл игрок");
            } else {
                System.out.println("Выиграл компьютер");
            }
        } else {
            if (choosingComputer.equals("Камень")) {
                System.out.println("Выиграл игрок");
            } else {
                System.out.println("Выиграл компьютер");
            }
        }
    }

    public void playGame() {
        int countPlayerWin = 0;
        int countComputerWin = 0;
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
//            System.out.println(choosingComputer);
//            String choosingPlayer = "";
            System.out.println("Компьютер сделал выбор.");
            System.out.println();
            System.out.print("Введите ваш выбор: ");
//            for (int i = 0; i < gameElements.length; i++) {
//                if (!choosingPlayer.equals(gameElements[i])) {
//                    Scanner input = new Scanner(System.in);
//                    choosingPlayer = input.nextLine();
//                }
//            }
            boolean trigger = true;
            while (trigger) {
                Scanner input = new Scanner(System.in);
                String choosingPlayer = input.nextLine();
//                for (String gameElement : gameElements) {
//                    if (!choosingPlayer.equals(gameElement)) {
//                        trigger = false;
//                        break;
//                    } else {
//                        roundResult(choosingPlayer, choosingComputer);
//                        break;
//                    }
//                }

                for (String gameElement : gameElements) {
                    if (choosingPlayer.equals(gameElement)) {
                        roundResult(choosingPlayer, choosingComputer);
                        break;
                    } else {
                        trigger = false;
//                        break;
                    }
                }
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
