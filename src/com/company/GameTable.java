package com.company;

public class GameTable {

    private char[][] table;
    private int emptySpaces;


    public GameTable() {
        this.table = new char[3][3];
        this.emptySpaces = 9;
    }

    public boolean fillTable(int line, int column, char c) {
        if (table[line][column] == 'X' || table[line][column] == '0') {
            return false;
        } else {
            table[line][column] = c;
        }
        return true;
    }

    public boolean win() {

        // verify x on lines, columns, diagonals
        // line 3
        if (table[2][0] == 'X' && table[2][1] == 'X' && table[2][2] == 'X') {
            return true;
        } // line 2
        if (table[1][0] == 'X' && table[1][1] == 'X' && table[1][2] == 'X') {
            return true;
        } // line 1
        if (table[0][0] == 'X' && table[0][1] == 'X' && table[0][2] == 'X') {
            return true;
        } // column 1
        if (table[0][0] == 'X' && table[1][0] == 'X' && table[2][0] == 'X') {
            return true;
        } //column 2
        if (table[0][1] == 'X' && table[1][1] == 'X' && table[2][1] == 'X') {
            return true;
        } // column 3
        if (table[0][2] == 'X' && table[1][2] == 'X' && table[2][2] == 'X') {
            return true;
        }// diagonala 1
        if (table[2][0] == 'X' && table[1][1] == 'X' && table[0][2] == 'X') {
            return true;
        } // diagonala 2
        if (table[0][0] == 'X' && table[1][1] == 'X' && table[2][2] == 'X') {
            return true;
        }
        // verify 0 on lines, columns, diagonals
        // line 3
        if (table[2][0] == '0' && table[2][1] == '0' && table[2][2] == '0') {
            return true;
        } // line 2
        if (table[1][0] == '0' && table[1][1] == '0' && table[1][2] == '0') {
            return true;
        } // line 1
        if (table[0][0] == '0' && table[0][1] == '0' && table[0][2] == '0') {
            return true;
        } // column 1
        if (table[0][0] == '0' && table[1][0] == '0' && table[2][0] == '0') {
            return true;
        } //column 2
        if (table[0][1] == '0' && table[1][1] == '0' && table[2][1] == '0') {
            return true;
        } // column 3
        if (table[0][2] == '0' && table[1][2] == '0' && table[2][2] == '0') {
            return true;
        }// diagonala 1
        if (table[2][0] == '0' && table[1][1] == '0' && table[0][2] == '0') {
            return true;
        } // diagonala 2
        if (table[0][0] == '0' && table[1][1] == '0' && table[2][2] == '0') {
            return true;
        }
        return false;
    }

    public int getEmptySpaces() {
        return emptySpaces;
    }

    public void setEmptySpaces(int emptySpaces) {
        this.emptySpaces = emptySpaces;
    }

    @Override
    public String toString() {

        String s = "";

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                if (table[i][j] == 0) {
                    s += " _";
                } else {
                    s += " " + table[i][j];
                }
            }
            s += "\n";
        }

        return s;
    }
}
