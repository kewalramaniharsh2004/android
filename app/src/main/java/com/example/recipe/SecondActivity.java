package com.example.recipe;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Retrieve data from the Intent
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String link = extras.getString("link");
            int imageResourceId = extras.getInt("imageResourceId");
            int number = extras.getInt("number");
            String message = extras.getString("message");

            // Set the message as the title
            TextView titleTextView = findViewById(R.id.titleTextView);
            titleTextView.setText(message);

            // Set image
            ImageView imageView = findViewById(R.id.imageView);
            imageView.setImageResource(imageResourceId);

            // Read text file and set the content to the second TextView based on the number
            TextView textView = findViewById(R.id.textView);
            String textContent = readTextFile(number);
            textView.setText(textContent);

            // First button click listener
            Button button = findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Open link in browser
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                    startActivity(intent);
                }
            });

            // Second button click listener
            Button backButton = findViewById(R.id.button12);
            backButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Go back to MainActivity
                    finish();
                }
            });
        }
    }

    // Method to read text file from raw folder based on number
    private String readTextFile(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        int resourceId = 0;
        switch (number) {
            case 1:
                resourceId = R.raw.text1;
                break;
            case 2:
                resourceId = R.raw.text2;
                break;
            // Add cases for other numbers as needed
            case 3:
                resourceId = R.raw.text3;
                break;
            case 4:
                resourceId = R.raw.text4;
                break;
            case 5:
                resourceId = R.raw.text5;
                break;
            case 6:
                resourceId = R.raw.text6;
                break;
            case 7:
                resourceId = R.raw.text7;
                break;
            case 8:
                resourceId = R.raw.text8;
                break;
            case 9:
                resourceId = R.raw.text9;
                break;
            case 10:
                resourceId = R.raw.text10;
                break;
            case 11:
                resourceId = R.raw.text11;
                break;
            default:
                break;
        }
        try {
            InputStream inputStream = getResources().openRawResource(resourceId);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
            bufferedReader.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}
