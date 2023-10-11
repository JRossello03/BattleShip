package model;

public class Board {

    private Cell[][] board;
    private int row, col;

    public Board(int row, int col) {
        this.row = row;
        this.col = col;
        this.board = new Cell[row][col];
        initializeBoard();
    }

    public void initializeBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                this.board[i][j] = new Cell(i,j);
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            System.out.println("______________________________");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print("|" + board[i][j].getCell() + "|");
            }
            System.out.println();
        }
    }

    public Cell[][] getBoard() {
        return board;
    }
}
