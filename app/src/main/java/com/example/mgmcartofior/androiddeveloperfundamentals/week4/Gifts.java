package com.example.mgmcartofior.androiddeveloperfundamentals.week4;

public class Gifts {
    private String mColor;
    private int mWeight;
    private String mName;
    private double mPrice;
    private String mPicture;

    public String getmColor() {
        return mColor;
    }

    public void setmColor(String mColor) {
        this.mColor = mColor;
    }

    public int getmWeight() {
        return mWeight;
    }

    public void setmWeight(int mWeight) {
        this.mWeight = mWeight;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public double getmPrice() {
        return mPrice;
    }

    public void setmPrice(double mPrice) {
        this.mPrice = mPrice;
    }

    public String getmPicture() {
        return mPicture;
    }

    public void setmPicture(String mPicture) {
        this.mPicture = mPicture;
    }

    public Gifts(String mColor, int mWeight, String mName, double mPrice, String mPicture) {
        this.mColor = mColor;
        this.mWeight = mWeight;
        this.mName = mName;
        this.mPrice = mPrice;
        this.mPicture = mPicture;
    }
}
