package com.example.adapterviewexam;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyFirstAdapter extends BaseAdapter {
    // 메서드 재정의
    // BaseAdapter 는 추상클래스

    private final List<Weather> mData;

    // List를 구현한 모든 것(ArrayList 등)을 받는 생성자
    public MyFirstAdapter(List<Weather> data) {
        mData = data;
    }

    //아이템의 개수
    @Override
    public int getCount() {
        return mData.size();
    }

    // position 번째의 아이템
    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    // position 번째의 아이디
    //나중에 SQLite 데이터를 실제 데이터베이스를 저장된ID 반환.. 일단은 position으로 저장해서 사용
    @Override
    public long getItemId(int position) {
        return position;
    }

    // position 번째의 아이템의 View를 구성하는 부분
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            holder = new ViewHolder();
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_weather, parent, false);
            ImageView weatherImage = convertView.findViewById(R.id.weather_image);
            TextView cityText = convertView.findViewById(R.id.city_text);
            TextView tempText = convertView.findViewById(R.id.temp_text);
            holder.weatherImage = weatherImage;
            holder.cityText = cityText;
            holder.tempText = tempText;
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        //  현재 position 의 날씨 데이터
        Weather weather = mData.get(position);

        // 데이터 설정 => 홀더에 저장
        holder.cityText.setText(weather.getCity());
        holder.tempText.setText(weather.getTemp());
        return convertView;
    }
    // holder.weatherImage.setImageResource(mWeatherImageMap.get(weather.getWeather()));


    //        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_weather,parent, false);
//
//        //날씨, 도시, 기온 View
//        ImageView weatherImage = convertView.findViewById(R.id.weather_image);
//        TextView cityText = convertView.findViewById(R.id.city_text);
//        TextView tempText = convertView.findViewById(R.id.temp_text);
//
//        // 현재 position 의 날씨 데이터
//        Weather weather = mData.get(position);
//
//        //데이터 설정
//        cityText.setText(weather.getCity());
//        tempText.setText(weather.getTemp());
    static class ViewHolder {
        ImageView weatherImage;
        TextView cityText;
        TextView tempText;
    }
}






