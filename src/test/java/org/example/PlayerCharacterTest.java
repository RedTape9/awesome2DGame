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


}