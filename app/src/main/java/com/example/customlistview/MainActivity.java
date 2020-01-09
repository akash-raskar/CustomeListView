package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<I_Item> i_items= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.simpleListViewcustom);

        i_items.add( new I_Item("Akash", R.drawable.one));
        i_items.add( new I_Item("Jay", R.drawable.two));
        i_items.add( new I_Item("Chetan", R.drawable.three));
        i_items.add( new I_Item("Ketan", R.drawable.four));

        MyAdapter myAdapter = new MyAdapter(this, R.layout.custom_list_view_item,i_items);
        listView.setAdapter(myAdapter);
    }
}
