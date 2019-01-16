package com.example.mgmcartofior.androiddeveloperfundamentals.week4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.alex.androidfundamentals.R;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        initView();
    }

    private void initView() {
        mRecyclerView = findViewById(R.id.reciclerview_gifts);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        GiftAdapter giftAdapter = new GiftAdapter(getGifts());
        mRecyclerView.setAdapter(giftAdapter);
    }

    private List<Gifts> getGifts() {
        List<Gifts> list = new ArrayList<>();
        list.add(new Gifts("red", 3, "Toy car", 200, "http://i.imgur.com/DvpvklR.png"));
        list.add(new Gifts("blue", 1, "T-shirt", 150, "http://i.imgur.com/DvpvklR.png\""));
        list.add(new Gifts("white", 3, "Hat", 300, "http://i.imgur.com/DvpvklR.png\""));
        list.add(new Gifts("green", 5, "Cap", 450, "http://i.imgur.com/DvpvklR.png\""));
        list.add(new Gifts("yellow", 6, "Sneakers", 110, "http://i.imgur.com/DvpvklR.png\""));
        list.add(new Gifts("purple", 1, "Scarf", 150, "http://i.imgur.com/DvpvklR.png\""));
        list.add(new Gifts("black", 10, "Trousers", 85, "http://i.imgur.com/DvpvklR.png\""));
        list.add(new Gifts("orange", 3, "Jeans", 25, "http://i.imgur.com/DvpvklR.png\""));
        list.add(new Gifts("magenta", 2, "Book", 50, "http://i.imgur.com/DvpvklR.png\""));
        list.add(new Gifts("pink", 5, "Blazer", 120, "http://i.imgur.com/DvpvklR.png\""));
        return list;
    }
}
