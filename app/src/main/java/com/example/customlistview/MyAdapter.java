package com.example.customlistview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

 public class MyAdapter extends ArrayAdapter<I_Item>
{


    ArrayList<I_Item> arrayList= new ArrayList<>();
    public MyAdapter (MainActivity mainActivity, int custom_list_view_item, ArrayList<I_Item> i_items)
    {
        super(mainActivity,custom_list_view_item,i_items);
        arrayList= i_items;

    }

    @Override
    public int getCount()
    {
        return super.getCount();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        View v=convertView;

        LayoutInflater inflater =(LayoutInflater) getContext().getSystemService(MainActivity.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.custom_list_view_item, null);

        TextView textView = v.findViewById(R.id.textView);
        ImageView imageView = v.findViewById(R.id.imageView);

        textView.setText(arrayList.get(position).getName());
        imageView.setImageResource(arrayList.get(position).getImage());

        return v;
    }
}
