package model;

public class Cell {

    private String cell;
    private boolean ocupated;
    private int row, col;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.ocupated = false;
        this.cell = "_";
    }




    // GETTERS AND SETTERS
    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public boolean isOcupated() {
        return ocupated;
    }

    public void setOcupated(boolean ocupated) {
        this.ocupated = ocupated;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
}
