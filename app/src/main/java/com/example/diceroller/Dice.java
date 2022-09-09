package com.example.diceroller;

import java.util.Random;

/**
 * Dice with a fixed number of sides.
 */
class Dice {
    private final Random random = new Random();
    private final int numSides;

    public Dice(int numSides) {
        this.numSides = numSides;
    }

    /**
     * Do a random dice roll and return the result.
     */
    public int roll() {
        // Add 1 to change the range from 1 to numSides, inclusive
        return random.nextInt(numSides) + 1;
    }
}
