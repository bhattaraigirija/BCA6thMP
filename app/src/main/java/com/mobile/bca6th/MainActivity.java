package com.mobile.bca6th;

import android.annotation.SuppressLint;
import android.content.Intent;
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
    EditText dname, daddress, dphone, demail;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btnRegister);
        dname = findViewById(R.id.edtName);
        daddress = findViewById(R.id.edtAddress);
        dphone = findViewById(R.id.edtPhone);
        demail = findViewById(R.id.edtEmail);

        btn.setOnClickListener(view -> {
            String name = dname.getText().toString();
            String address = daddress.getText().toString();
            String phone = dphone.getText().toString();
            String email = demail.getText().toString();

            Intent i = new Intent(MainActivity.this, DashboardActivity.class);
            i.putExtra("name", name);
            i.putExtra("address", address);
            i.putExtra("phone",phone);
            i.putExtra("email",email);
            startActivity(i);

        });







        }
    }
