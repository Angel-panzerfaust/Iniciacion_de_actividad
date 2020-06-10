package com.example.iniciaciondeactividad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // se obtiene un intent que tendra un texto para enviar a la siguiente activity
        Intent intent = getIntent();

        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        //establecer que el view tendra el texto insertado
        TextView textView = findViewById(R.id.textView);

        textView.setText(message);


    }
}
