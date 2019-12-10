package com.example.adapterviewexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //자료
        ArrayList<Weather> data = new ArrayList<>();
        data.add(new Weather("수원","25도","맑음"));
        data.add(new Weather("서울","26도","비"));
        data.add(new Weather("안양","24도","구름"));
        data.add(new Weather("부산","29도","구름"));
        data.add(new Weather("인천","23도","맑음"));
        data.add(new Weather("대구","28도","비"));
        data.add(new Weather("용인","25도","비"));

        //어댑터
     MyFirstAdapter adapter = new MyFirstAdapter(data);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
//                android.R.layout.simple_list_item_1,data);

        // 뷰와 어댑터 연결
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        //아이템 클릭 이벤트
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, position+"번째 아이템 선택",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}
