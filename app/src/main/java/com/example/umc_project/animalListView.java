package com.example.umc_project;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class animalListView extends AppCompatActivity {

    private CustomAdapter adapter;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        adapter = new CustomAdapter();
        listView = (ListView) findViewById(R.id.listView);

        setData();

        listView.setAdapter(adapter);
    }

    private void setData() {
        TypedArray arrResId = getResources().obtainTypedArray(R.array.ResId);

        String[] departureDate = getResources().getStringArray(R.array.departureDate);
        String[] region = getResources().getStringArray(R.array.region);
        String[] type = getResources().getStringArray(R.array.type);
        String[] name = getResources().getStringArray(R.array.name);

        for(int i =0; i < arrResId.length(); i++) {
            CustomDTO dto = new CustomDTO();
            dto.setResId(arrResId.getResourceId(i, 0));
            dto.setDepartureDate(departureDate[i]);
            dto.setRegion(region[i]);
            dto.setType(type[i]);
            dto.setName(name[i]);

            adapter.addItem(dto);
        }
    }
}