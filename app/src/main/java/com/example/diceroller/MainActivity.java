/*
 * Copyright (C) 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.diceroller;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
public class MainActivity extends AppCompatActivity {

    /**
     * This method is called when the Activity is created.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the Button in the layout
        Button rollButton = findViewById(R.id.button);

        // Set a click listener on the button to roll the dice when the user taps the button
        rollButton.setOnClickListener(v -> rollDice());
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private void rollDice() {
        // Create new Dice object with 6 sides and roll it
        Dice dice = new Dice(6);
        int diceRoll = dice.roll();

        // Update the screen with the dice roll
        TextView resultTextView = findViewById(R.id.textView);
        resultTextView.setText(String.valueOf(diceRoll));
    }
}
