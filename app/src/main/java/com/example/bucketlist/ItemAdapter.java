package com.example.bucketlist;

import android.media.Image;
import android.media.Rating;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
    private Item[] items;

    public ItemAdapter(Item[] items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_object, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.bind(items[position], position);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }

    static class ItemViewHolder extends RecyclerView.ViewHolder {
        private ImageView itemImage;
        private TextView itemHeading;
        private TextView itemDescription;
        private RatingBar ratingBar;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.image_view_item_image);
            itemHeading = itemView.findViewById(R.id.text_view_item_heading);
            itemDescription = itemView.findViewById(R.id.text_view_description);
            ratingBar = itemView.findViewById(R.id.rating_bar);
        }

        public void bind(Item item, int position) {
            itemImage.setImageResource(item.imageId);
            itemDescription.setText(item.description);
            ratingBar.setRating(item.decimalValue);
            String headingWithPosition = (position + 1) + ". " + item.heading;
            itemHeading.setText(headingWithPosition);
        }
    }
}
