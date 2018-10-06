package com.jdfree.jjandroidedustudy.chapter4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ListBaseAdapter extends BaseAdapter {

    private List<InfoModel> mData;

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
        ViewHolder holder;

        if (convertView == null) {
            holder = new ViewHolder();
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);

            holder.textView1 = convertView.findViewById(R.id.item_list_textview1);
            holder.textView2 = convertView.findViewById(R.id.item_list_textview2);
            holder.textView3 = convertView.findViewById(R.id.item_list_textview3);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        InfoModel model = mData.get(position);

        holder.textView1.setText(model.getField1());
        holder.textView2.setText(model.getField2());
        holder.textView3.setText(model.getField3());

        return convertView;
    }

    static class ViewHolder {
        TextView textView1;
        TextView textView2;
        TextView textView3;
    }
}
