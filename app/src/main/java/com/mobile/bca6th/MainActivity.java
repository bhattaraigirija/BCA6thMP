package com.mobile.bca6th;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    Button btn;
    EditText editText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btnRegister);
        editText = findViewById(R.id.edtName);

        btn.setOnClickListener(v -> {

            //show toast message on button click
            Toast.makeText(MainActivity.this,
                    "Button Clicked",
                    Toast.LENGTH_LONG).show();
        });

        editText.setOnKeyListener((v, keyCode, event) -> {
            if(event.getAction() == KeyEvent.ACTION_DOWN) {
                String keyName = KeyEvent.keyCodeToString(keyCode);
               Toast.makeText(MainActivity.this,
                       "Key Pressed " + keyName,
                       Toast.LENGTH_LONG).show();
            }
            return false;
        });

        }
    }
