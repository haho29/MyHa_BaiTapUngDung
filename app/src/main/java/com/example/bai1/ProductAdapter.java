package com.example.bai1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    private final String[] productNames;
    private final int[] productImages;
    private final OnProductClickListener listener;

    public interface OnProductClickListener {
        void onProductClick(String name, int image);
    }

    public ProductAdapter(String[] productNames, int[] productImages, OnProductClickListener listener) {
        this.productNames = productNames;
        this.productImages = productImages;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product, parent, false);
        return new ProductViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        String name = productNames[position];
        int image = productImages[position];

        holder.txtName.setText(name);
        holder.imgProduct.setImageResource(image);

        holder.itemView.setOnClickListener(v -> listener.onProductClick(name, image));
    }

    @Override
    public int getItemCount() {
        return productNames.length;
    }

    public static class ProductViewHolder extends RecyclerView.ViewHolder {
        ImageView imgProduct;
        TextView txtName;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProduct = itemView.findViewById(R.id.imgProduct);
            txtName = itemView.findViewById(R.id.txtName);
        }
    }
}
