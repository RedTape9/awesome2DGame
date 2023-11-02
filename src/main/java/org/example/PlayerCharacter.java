package org.example;

public class PlayerCharacter {
    protected int x = 0;
    protected int y = 0;

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public void move(String w) {
        y++;
    }
}
