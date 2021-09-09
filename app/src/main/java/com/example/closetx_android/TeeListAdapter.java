package com.example.closetx_android;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class TeeListAdapter extends ArrayAdapter<Tee> {

    private static final String TAG = "TeeListAdapter";

    private Context mContext;
    int mResource;

    public TeeListAdapter(Context context, int resource, ArrayList<Tee> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //get Tee info
        String name = getItem(position).getName();
        String size = getItem(position).getSize();
        String color = getItem(position).getColor();

        //Create the Tee object with info
        Tee tee = new Tee(name,size,color);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView tvName = (TextView) convertView.findViewById(R.id.textView1);
        TextView tvSize = (TextView) convertView.findViewById(R.id.textView2);
        TextView tvColor = (TextView) convertView.findViewById(R.id.textView3);

        tvName.setText(name);
        tvSize.setText(size);
        tvColor.setText(color);

        return convertView;
    }
}
