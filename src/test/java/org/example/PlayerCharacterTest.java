package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerCharacterTest {

    @Test
    void return0_whenGetXReturns0() {
        PlayerCharacter newPlayer = new PlayerCharacter();
        int expected = 0;
        int actual = newPlayer.getX();
        assertEquals(expected, actual);
    }

    @Test
    void return0_whenGetYReturns0() {
        PlayerCharacter newPlayer = new PlayerCharacter();
        int expected = 0;
        int actual = newPlayer.getY();
        assertEquals(expected, actual);
    }

    @Test
    void returnIncrementedY_whenMoveArgumentIsW() {
        PlayerCharacter newPlayer = new PlayerCharacter();
        //GIVEN
        int expected = newPlayer.getY() + 1;
        //WHEN
        newPlayer.move("w");
        int actual = newPlayer.getY();
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void returnIncrementedX_whenMoveArgumentIsD() {
        PlayerCharacter newPlayer = new PlayerCharacter();
        //GIVEN
        int expected = newPlayer.getX() + 1;
        //WHEN
        newPlayer.move("d");
        int actual = newPlayer.getX();
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void returnDecrementedY_whenMoveArgumentIsS() {
        PlayerCharacter newPlayer = new PlayerCharacter();
        //GIVEN
        int expected = newPlayer.getY() - 1;
        //WHEN
        newPlayer.move("s");
        int actual = newPlayer.getY();
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void returnDecrementedX_whenMoveArgumentIsA() {
        PlayerCharacter newPlayer = new PlayerCharacter();
        //GIVEN
        int expected = newPlayer.getX() - 1;
        //WHEN
        newPlayer.move("a");
        int actual = newPlayer.getX();
        //THEN
        assertEquals(expected, actual);
    }


}