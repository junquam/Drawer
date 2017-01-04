package com.junqua.drawer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DrawerAdapter extends ArrayAdapter<DrawerData> {

    private static class ViewHolder {
        TextView name;
        ImageView icon;
    }

    public DrawerAdapter(ArrayList<DrawerData> data, Context context) {
        super(context, R.layout.drawer_list_item, data);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        DrawerData data = getItem(position);
        ViewHolder viewHolder;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.drawer_list_item, parent, false);
            viewHolder.name = (TextView) convertView.findViewById(R.id.name);
            viewHolder.icon = (ImageView) convertView.findViewById(R.id.icon);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.name.setText(data.getName());

        viewHolder.icon.setImageResource(data.getIcon());

        return convertView;
    }
}
