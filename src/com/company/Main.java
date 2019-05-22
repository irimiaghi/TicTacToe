package com.company;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player("Big X", 'X');
        Player player2 = new Player("Wide 0", '0');
        GameTable gameTable = new GameTable();

        Referee referee = new Referee(player1, player2, gameTable);

        referee.move(gameTable);
    }
}
