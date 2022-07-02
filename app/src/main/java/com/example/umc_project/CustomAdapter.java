package com.example.umc_project;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    private ArrayList<CustomDTO> listCustom = new ArrayList<>();

    //ListView 에 보여질 item 수
    @Override
    public int getCount() {
        return listCustom.size();
    }

    //하나의 item(ImageView, Text 모음)
    @Override
    public Object getItem(int position) {
        return listCustom.get(position);
    }

    //item의 id : item을 구별하기 위한 position
    @Override
    public long getItemId(int position) {
        return position;
    }

    //실제로 item이 보여지는 부분
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CustomViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_custom, null, false);

            holder = new CustomViewHolder();
            holder.imageView = (ImageView)
                    convertView.findViewById(R.id.imageView);

            holder.departureDate = (TextView)
                    convertView.findViewById(R.id.departure_date);

            holder.Region = (TextView)
                    convertView.findViewById(R.id.region);

            holder.Type = (TextView)
                    convertView.findViewById(R.id.animal_type);

            holder.Name = (TextView)
                    convertView.findViewById(R.id.animal_name);

            holder.Age = (TextView)
                    convertView.findViewById(R.id.animal_age);

            holder.ResId = (TextView)
                    convertView.findViewById(R.id.animal_id);

            holder.Sex = (TextView)
                    convertView.findViewById(R.id.animal_sex);

            holder.Weight = (TextView)
                    convertView.findViewById(R.id.animal_weight);

            convertView.setTag(holder);
        } else {

            holder = (CustomViewHolder) convertView.getTag();

        }

        CustomDTO dto = listCustom.get(position);
        holder.imageView.setImageResource(dto.getResId());

        holder.ResId.setText(dto.getResId());

        holder.Weight.setText(dto.getWeight());
        holder.Sex.setText(dto.getSex());
        holder.departureDate.setText(dto.getDepartureDate());
        holder.Type.setText(dto.getType());
        holder.Region.setText(dto.getRegion());
        holder.Age.setText(dto.getAge());

        return convertView;
    }

    class CustomViewHolder {
        ImageView imageView;
        TextView departureDate;
        TextView Region;

        TextView Type;
        TextView Name;

        TextView Age;
        TextView Sex;
        TextView Weight;

        TextView ResId;

    }

    public void addItem(CustomDTO dto) {
        listCustom.add(dto);
    }

}
