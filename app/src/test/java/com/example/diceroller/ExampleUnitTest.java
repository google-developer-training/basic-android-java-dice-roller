package com.example.diceroller;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ExampleUnitTest {
    @Test
    public void generates_number() {
        Dice dice = new Dice(6);
        int diceRoll = dice.roll();
        assertTrue("The value of diceRoll was not between 1 and 6", diceRoll > 0 && diceRoll < 7);
    }
}