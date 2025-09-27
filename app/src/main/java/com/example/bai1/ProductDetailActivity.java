package com.example.bai1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProductDetailActivity extends AppCompatActivity {

    TextView txtTitle, txtPrice, txtDescription;
    ImageView imgProduct;
    Button btnAddToCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        txtTitle = findViewById(R.id.txtTitle);
        txtPrice = findViewById(R.id.txtPrice);
        txtDescription = findViewById(R.id.txtDescription);
        imgProduct = findViewById(R.id.imgProduct);
        btnAddToCart = findViewById(R.id.btnAddToCart);

        // Nhận dữ liệu từ HomeActivity
        String name = getIntent().getStringExtra("name");
        int image = getIntent().getIntExtra("image", R.drawable.ic_launcher_foreground);

        txtTitle.setText(name);
        imgProduct.setImageResource(image);
        txtPrice.setText("$120");
        txtDescription.setText("This is a sample description for " + name);

        btnAddToCart.setOnClickListener(v -> {
            btnAddToCart.setText("Added!");
        });
    }
}
