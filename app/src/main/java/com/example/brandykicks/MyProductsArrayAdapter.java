package com.example.brandykicks;

import android.content.Context;
import android.widget.ArrayAdapter;

public class MyProductsArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mProducts;
    private String[] mCuisines;

    public MyProductsArrayAdapter(Context mContext, int resource, String[] mProducts, String[] mCuisines) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mProducts = mProducts;
        this.mCuisines = mCuisines;
    }

    @Override
    public Object getItem(int position) {
        String restaurant = mProducts[position];
        String cuisine = mCuisines[position];
        return String.format("%s \n Type: %s", restaurant, cuisine);
    }

    @Override
    public int getCount() {
        return mProducts.length;
    }
}