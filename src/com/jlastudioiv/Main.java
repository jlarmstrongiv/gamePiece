package com.jlastudioiv;

public class Main {

    public static void main(String[] args) {

        // Create a GamePiece object
        GamePiece knight = new GamePiece();

        knight.move(1, 3);
        knight.freeze();
        knight.move(2, 6);
        knight.unfreeze();
        knight.move(2, 6);

    }
}
