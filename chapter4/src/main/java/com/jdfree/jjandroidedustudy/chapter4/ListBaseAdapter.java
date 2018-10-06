package com.jdfree.jjandroidedustudy.chapter4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public class ListBaseAdapter extends BaseAdapter {

    private List mData;

    public ListBaseAdapter(List mData) {
        this.mData = mData;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
    }
}
