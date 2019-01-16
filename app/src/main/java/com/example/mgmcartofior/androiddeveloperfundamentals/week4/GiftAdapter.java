package com.example.mgmcartofior.androiddeveloperfundamentals.week4;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.alex.androidfundamentals.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class GiftAdapter extends RecyclerView.Adapter<GiftViewHolder> {

    private List<Gifts> mGifts;

    public GiftAdapter(List<Gifts> mGifts) {
        this.mGifts = mGifts;
    }

    @NonNull
    @Override
    public GiftViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View giftView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gift_item, viewGroup, false);
        return new GiftViewHolder(giftView);
    }

    @Override
    public void onBindViewHolder(@NonNull GiftViewHolder giftViewHolder, int i) {
        Gifts gift = mGifts.get(i);
        giftViewHolder.mTextViewName.setText(gift.getmName());
        giftViewHolder.mTextViewColorandWeight.setText(gift.getmColor() + " /" + gift.getmWeight());
        giftViewHolder.mTextViewPrice.setText(gift.getmPrice() + " RON");
        Picasso.get().load(gift.getmPicture()).into(giftViewHolder.mImageView);
    }

    @Override
    public int getItemCount() {
        return mGifts.size();
    }
}
