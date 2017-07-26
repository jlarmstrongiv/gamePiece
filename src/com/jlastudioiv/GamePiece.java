package com.jlastudioiv;

public class GamePiece {
    private int intPositionX;
    private int intPositionY;
    private boolean frozen;
    private String name;
    private String color;

    // Verify that if the game piece is not frozen
    // then the call to move results in the new position

    // Verify that if the game piece is frozen
    // then the call to move does not change the position

    public void move(int intPositionX, int intPositionY) {
        if (!this.isFrozen()) {
            this.intPositionX = intPositionX;
            this.intPositionY = intPositionY;
            System.out.println("New Position (" + intPositionX + ", " + intPositionY + ")");
        } else {
            System.out.println("Cannot move frozen character");
            System.out.println("Current Position (" + this.intPositionX + ", " + this.intPositionY + ")");
        }
    }

    // Verify that if the game piece is not frozen
    // then the call to freeze sets the frozen varable to true

    public void freeze() {
        if (!this.isFrozen()) {
            this.frozen = true;
            System.out.println("frozen true");
        }
    }

    // Verify that if the game piece is frozen
    // then the call to unfreeze sets the frozen varable to false

    public void unfreeze() {
        if (this.isFrozen()) {
            this.frozen = false;
            System.out.println("frozen false");
        }
    }

    public GamePiece() {
        intPositionX = 0;
        intPositionY = 0;
        frozen = false;
        System.out.println("initial position set");
    }

//    public int getIntPositionX() {
//        return intPositionX;
//    }

//    public int getIntPositionY() {
//        return intPositionY;
//    }

    private Boolean isFrozen() {
        return frozen;
    }

//    public String getName() {
//        return name;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }

//    public String getColor() {
//        return color;
//    }

//    public void setColor(String color) {
//        this.color = color;
//    }
}
