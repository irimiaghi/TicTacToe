package com.company;

import java.util.Scanner;

public class Player {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private char symbol;
    private int choice;

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setChoice() {
        this.choice = scanner.nextInt();
    }

    public int getChoice() {
        return choice;
    }
}
