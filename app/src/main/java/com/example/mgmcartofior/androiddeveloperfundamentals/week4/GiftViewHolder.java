package com.example.mgmcartofior.androiddeveloperfundamentals.week4;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alex.androidfundamentals.R;

public class GiftViewHolder extends RecyclerView.ViewHolder {
    public ImageView mImageView;
    public TextView
            mTextViewName;
    public TextView mTextViewColorandWeight;
    public TextView mTextViewPrice;

    public GiftViewHolder(@NonNull View itemView) {
        super(itemView);
        mImageView = itemView.findViewById(R.id.imageview_picture);
        mTextViewName = itemView.findViewById(R.id.textview_name);
        mTextViewColorandWeight = itemView.findViewById(R.id.textview_color_weight);
        mTextViewPrice = itemView.findViewById(R.id.textview_price);
    }
}
