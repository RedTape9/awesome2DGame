package org.example;

public class PlayerCharacter {
    private int x = 0;
    private int y = 0;

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public static void main(String[] args) {

        PlayerCharacter player = new PlayerCharacter();
        player.move("w");
        player.move("w");
        player.move("w");
        System.out.println(player.getY());
    }
    public void move(String input) {
        String normolizedString = input.toLowerCase();
        /*if (normolizedString.equals("w")) {
            y++;
        }
        if (normolizedString.equals("d")) {
            x++;
        }
        if (normolizedString.equals("s")) {
            y--;
        }
        if (normolizedString.equals("a")) {
            x--;
        }*/
        // Refactoring mit switch
        switch (normolizedString) {
            case "w":
                y++;
                break;
            case "d":
                x++;
                break;
            case "s":
                y--;
                break;
            case "a":
                x--;
                break;
        }
    }
}
