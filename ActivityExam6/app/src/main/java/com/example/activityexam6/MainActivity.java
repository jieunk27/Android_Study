package com.example.activityexam6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import kotlin.jvm.internal.CollectionToArray;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static final int REQUEST_CODE = 1000;
    private EditText mNameEditText;
    private EditText mAgeEditText;

    @Override // 화면표시
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // 화면표시
        setContentView(R.layout.activity_main); // 이름, 표시
        mNameEditText = (EditText) findViewById(R.id.name_edit); // 이름 이벤트처리
        mAgeEditText = (EditText) findViewById(R.id.age_edit);  // 나이 이벤트처리

        findViewById(R.id.submit_button).setOnClickListener(this);

        findViewById(R.id.submit_button).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(MainActivity.this,R.id.name_edit+"살"+R.id.age_edit,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override // 버튼클릭시
    public void onClick(View v) {
        //SecondActivity로 전환하겠다는 intent
        Intent intent = new Intent(this, SecondActivity.class); // Intent!!

        // 이름, 나이 가져와서 intent에 추가
        intent.putExtra("name", mNameEditText.getText().toString());
        intent.putExtra("age", mAgeEditText.getText().toString());

        // intent의 정보를 토대로 다른 Activity를 시작
        startActivityForResult(intent,REQUEST_CODE);
    }

    @Override // 버튼클릭후
    protected void onActivityResult(int requestCode, int resultCode, Intent data)  {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_CODE && requestCode == RESULT_OK && data!=null){
            String result = data.getStringExtra("result");
            // 결과를 받음

            // Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
            // 토스트 메세지 표시
        }
    }

}
