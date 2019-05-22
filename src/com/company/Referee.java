package com.company;

public class Referee {

    private boolean turn;
    private Player player1;
    private Player player2;
    private GameTable gameTable;

    public Referee(Player player1, Player player2, GameTable gameTable) {
        this.player1 = player1;
        this.player2 = player2;
        this.gameTable = gameTable;
        this.turn = true;
    }

    public void move(GameTable gameTable) {

        boolean quit = false;
        while (gameTable.getEmptySpaces() != 0) {

            int choice1 = 0;
            char c = '.';
            String name = "";
            System.out.println(gameTable);

            if (turn) {
                name = player1.getName();
                c = player1.getSymbol();
                System.out.println("It is " + name + " turn -> " + c);
                player1.setChoice();
                choice1 = player1.getChoice();
            } else if (!turn) {
                name = player2.getName();
                c = player2.getSymbol();
                System.out.println("It is " + name + " turn -> " + c);
                player2.setChoice();
                choice1 = player2.getChoice();
            }

            switch (choice1) {
                case 1:
                    if (gameTable.fillTable(2, 0, c)) {
                        gameTable.setEmptySpaces(gameTable.getEmptySpaces() - 1);
                        changeTurn();
                    } else {
                        System.out.println("Position occupied");
                    }
                    break;
                case 2:
                    if (gameTable.fillTable(2, 1, c)) {
                        gameTable.setEmptySpaces(gameTable.getEmptySpaces() - 1);
                        changeTurn();
                    } else {
                        System.out.println("Position occupied");
                    }
                    break;
                case 3:
                    if (gameTable.fillTable(2, 2, c)) {
                        gameTable.setEmptySpaces(gameTable.getEmptySpaces() - 1);
                        changeTurn();
                    } else {
                        System.out.println("Position occupied");
                    }
                    break;
                case 4:
                    if (gameTable.fillTable(1, 0, c)) {
                        gameTable.setEmptySpaces(gameTable.getEmptySpaces() - 1);
                        changeTurn();
                    } else {
                        System.out.println("Position occupied");
                    }
                    break;
                case 5:
                    if (gameTable.fillTable(1, 1, c)) {
                        gameTable.setEmptySpaces(gameTable.getEmptySpaces() - 1);
                        changeTurn();
                    } else {
                        System.out.println("Position occupied");
                    }
                    break;
                case 6:
                    if (gameTable.fillTable(1, 2, c)) {
                        gameTable.setEmptySpaces(gameTable.getEmptySpaces() - 1);
                        changeTurn();
                    } else {
                        System.out.println("Position occupied");
                    }
                    break;
                case 7:
                    if (gameTable.fillTable(0, 0, c)) {
                        gameTable.setEmptySpaces(gameTable.getEmptySpaces() - 1);
                        changeTurn();
                    } else {
                        System.out.println("Position occupied");
                    }
                    break;
                case 8:
                    if (gameTable.fillTable(0, 1, c)) {
                        gameTable.setEmptySpaces(gameTable.getEmptySpaces() - 1);
                        changeTurn();
                    } else {
                        System.out.println("Position occupied");
                    }
                    break;
                case 9:
                    if (gameTable.fillTable(0, 2, c)) {
                        gameTable.setEmptySpaces(gameTable.getEmptySpaces() - 1);
                        changeTurn();
                    } else {
                        System.out.println("Position occupied");
                    }
                    break;
                default:
                    System.out.println("Wrong input !");
                    break;
            }
            if (checkWinner(name)) {
                return;
            }
        }
        System.out.println(gameTable);
        System.out.println("Tie !");
    }

    private void changeTurn() {
        if (turn) {
            turn = false;
        } else if (!turn) {
            turn = true;
        }
    }

    private boolean checkWinner(String name) {
        if (gameTable.win()) {
            System.out.println(gameTable);
            System.out.println("End !\n" +
                    "" + name + " is the winner !!");
            return true;
        }
        return false;
    }
}
