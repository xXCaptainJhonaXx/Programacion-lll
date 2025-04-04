package Ejercicio_8.Model;

public class Cell {

    private boolean isMine;
    private boolean revealed;
    private int nearbyMines;
    private boolean marked;

    public Cell() {
        this.isMine = false;
        this.revealed = false;
        this.nearbyMines = 0;
        this.marked = false;

    }

    public boolean isMine() {
        return isMine;
    }

    public void setMine(boolean mina) {
        this.isMine = mina;
    }

    public boolean isRevealed() {
        return revealed;
    }

    public void Reveal() {
        this.revealed = true;
    }

    public int getNearbyMines() {
        return nearbyMines;
    }

    public void setNearbyMines (int mines) {
        this.nearbyMines = mines;
    }

    public boolean isMarked() {
        return marked;
    }

    public void markAsFlag() {
        this.marked = !marked;
    }

    public boolean isSecure() {
        return !isMine;
    }



}
