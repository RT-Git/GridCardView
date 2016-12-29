package com.wordpress.obliviouscode.uisamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridLayoutManager lLayout;
        List<ItemObject> rowListItem = getAllItemList();
        //No of items per row  is second argument
        lLayout = new GridLayoutManager(MainActivity.this, 2);

        RecyclerView rView = (RecyclerView) findViewById(R.id.recycler_view);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(MainActivity.this, rowListItem);
        rView.setAdapter(rcAdapter);
    }

    private List<ItemObject> getAllItemList() {

        List<ItemObject> allItems = new ArrayList<ItemObject>();
        allItems.add(new ItemObject("60 Minutes", R.drawable.ic_access_time_black_90dp, "Total Time"));
        allItems.add(new ItemObject("120", R.drawable.ic_live_help_black_90dp, "Total Questions"));
        allItems.add(new ItemObject("480", R.drawable.ic_assignment_turned_in_black_90dp, "Maximum Marks"));
        allItems.add(new ItemObject("2", R.drawable.ic_restore_black_90dp, "Previous Attempts"));
        return allItems;
    }
}
