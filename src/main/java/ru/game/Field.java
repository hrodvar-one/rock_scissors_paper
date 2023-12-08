package ru.game;

public class Field {
    private String playerName;
    private int numberOfRound;

    private enum gameMenu {

    }

    public final String gameRules = """
            Игрок и компьютер выбирают один из трех знаков: Камень, Ножницы или Бумага
            После выбора идёт определение победителя
            Победитель определяется по следующим правилам:
                    * Бумага побеждает камень (<< бумага оборачивает камень >>).
                    * Камень побеждает ножницы (<< камень затупляет или ломает ножницы >>).
                    * Ножницы побеждают бумагу (<< ножницы разрезают бумагу >>).
            Если игроки показали одинаковый знак, то засчитывается ничья.
            """;

    public static void main(String[] args) {
        Field field = new Field();
        System.out.println(field.gameRules);
    }
}
