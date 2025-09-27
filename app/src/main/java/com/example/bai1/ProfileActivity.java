package com.example.bai1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    Button btnEditProfile, btnChangePassword, btnOrders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        btnEditProfile = findViewById(R.id.btnEditProfile);
        btnChangePassword = findViewById(R.id.btnChangePassword);
        btnOrders = findViewById(R.id.btnOrders);

        btnEditProfile.setOnClickListener(v ->
                Toast.makeText(this, "Edit Profile clicked", Toast.LENGTH_SHORT).show());
        btnChangePassword.setOnClickListener(v ->
                Toast.makeText(this, "Change Password clicked", Toast.LENGTH_SHORT).show());
        btnOrders.setOnClickListener(v ->
                Toast.makeText(this, "View Orders clicked", Toast.LENGTH_SHORT).show());
    }
}
