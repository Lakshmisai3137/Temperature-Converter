package com.example.temperatureconvertercelsiustofahrenheit;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button convert;
        EditText celsius;
        TextView fahrenheit;

        convert = findViewById(R.id.convert);
        celsius = findViewById(R.id.Celsius);
        fahrenheit = findViewById(R.id.Fahrenheit);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int celsiusValue = Integer.parseInt(celsius.getText().toString());
                int fahrenheitValue = (celsiusValue * 9 / 5) + 32;
                fahrenheit.setText(String.valueOf(fahrenheitValue));
            }
        });
            }
        }
