package com.mobile.bca6th;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DashboardActivity extends AppCompatActivity {

    TextView name, address, age;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dashboard);

        name = findViewById(R.id.txvName);
        address = findViewById(R.id.txvAddress);
        age = findViewById(R.id.txvAge);

        String rsName = getIntent().getStringExtra("name");
        int rsAge = getIntent().getIntExtra("age", 0);
        String rsAddress = getIntent().getStringExtra("address");

        name.setText(rsName);
        address.setText(rsAddress);
        age.setText(String.valueOf(rsAge));
    }
}