package com.example.bai1;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class HomeActivity extends AppCompatActivity implements ProductAdapter.OnProductClickListener {

    RecyclerView recyclerProducts;
    String[] productNames = {"Wireless ANC Headphones", "Howess AMMC", "Virgsess AINC", "I ialts Shue Pive"};
    int[] productImages = {R.drawable.ic_headphone, R.drawable.ic_watch, R.drawable.ic_watch, R.drawable.ic_watch};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerProducts = findViewById(R.id.recyclerProducts);
        recyclerProducts.setLayoutManager(new GridLayoutManager(this, 2));

        ProductAdapter adapter = new ProductAdapter(productNames, productImages, this);
        recyclerProducts.setAdapter(adapter);

        findViewById(R.id.btnProfile).setOnClickListener(v -> {
            startActivity(new Intent(HomeActivity.this, ProfileActivity.class));
        });
    }

    @Override
    public void onProductClick(String name, int image) {
        Intent intent = new Intent(HomeActivity.this, ProductDetailActivity.class);
        intent.putExtra("name", name);
        intent.putExtra("image", image);
        startActivity(intent);
    }
}
