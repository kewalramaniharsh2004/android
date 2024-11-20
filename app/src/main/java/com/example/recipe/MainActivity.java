package com.example.recipe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find buttons by their IDs
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button button10 = findViewById(R.id.button10);
        Button button11 = findViewById(R.id.button11);

        // Set click listeners for each button
        setButtonClickListener(button1, "https://youtu.be/-DnoM36eqhA?si=T4JZEz3hf3NDkKTs", R.drawable.image1, 1, "Gulab Jamun");
        setButtonClickListener(button2, "https://youtu.be/gBlBuj_rBuw?si=TnQ7u6aOgu976d02",R.drawable.image2, 2, "Vegetable Stir fry");
        setButtonClickListener(button3, "https://youtu.be/S5Ngh6CFRmc?si=eBiaEUjmQjpff2XY", R.drawable.image3, 3, "Vegetable Biryani");
        setButtonClickListener(button4, "https://youtu.be/z161elNBhN4?si=N4ZKXls_cs19V0D3", R.drawable.image4, 4, "Curry");
        setButtonClickListener(button5, "https://youtu.be/EtpwOvjCNEI?si=2X9RdgVkJN3U1GCE", R.drawable.image5, 5, "Chick pea");
        setButtonClickListener(button6, "https://youtu.be/-gOhyN8WJMY?si=4kaI-Hrl58V2DK6P", R.drawable.image6, 6, "Spring Rolls");
        setButtonClickListener(button7, "https://youtu.be/suXQ2mPfhSg?si=KvrIzyWj6Shzvba9", R.drawable.image7, 7, "Fried Rice");
        setButtonClickListener(button8, "https://youtu.be/3nVnmjSWGfs?si=vK7m035ST4PYvy2I", R.drawable.image8, 8, "Chocolate Cake");
        setButtonClickListener(button9, "https://youtu.be/OzdqThvpMko?si=dVxhB2xmJ9o_1d-g", R.drawable.image9, 9, "Crossiant");
        setButtonClickListener(button10, "https://youtu.be/EiPZe0K9Q2E?si=YLcm6DqS23Xs13m7", R.drawable.image10, 10, "Jalebi");
        setButtonClickListener(button11, "https://youtu.be/AhoZ2TbLxzU?si=zba9QbFhMnHbaIac", R.drawable.image11, 11, "Quesedilla");
    }

    // Method to set click listener for a button and open SecondActivity with appropriate data
    private void setButtonClickListener(Button button, final String link, final int imageResourceId, final int number, final String message) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                // Pass the link, image resource ID, number, and message as extras in the Intent
                intent.putExtra("link", link);
                intent.putExtra("imageResourceId", imageResourceId);
                intent.putExtra("number", number);
                intent.putExtra("message", message);

                // Start SecondActivity
                startActivity(intent);
            }
        });
    }
}
