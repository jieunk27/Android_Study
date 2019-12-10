package com.example.login_google;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class CallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        Button b0 = findViewById(R.id.buttonCall);
        b0.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("MissingPermission")
            public void onClick(View v) {
                Intent tt = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:01077777777"));
                startActivity(tt);


//                Context c = v.getContext();
//                Intent callintent = new Intent(Intent.ACTION_CALL);
//                callintent.setData(Uri.parse("tel:16612642"));
//                try {
//                    c.startActivity(callintent);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
            }
        });
        Button b1 = findViewById(R.id.buttonWeb1);
        b1.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("MissingPermission")
            public void onClick(View v) {

                Context c = v.getContext();
                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("http://www.noiseinfo.or.kr/"));

                try {
                    c.startActivity(intent1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        Button b2 = findViewById(R.id.buttonWeb2);
        b2.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("MissingPermission")
            public void onClick(View v) {

                Context c = v.getContext();
                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("http://ecc.me.go.kr/"));

                try {
                    c.startActivity(intent1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        Button b3 = findViewById(R.id.buttonWeb3);
        b3.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("MissingPermission")
            public void onClick(View v) {

                Context c = v.getContext();
                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("http://www.k-apt.go.kr/"));

                try {
                    c.startActivity(intent1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
//        Button b2 = findViewById(R.id.buttonWeb2);
//        b2.setOnClickListener(new View.OnClickListener() {
//
//            @SuppressLint("MissingPermission")
//            public void onClick(View v) {
//
//                Context c = v.getContext();
//                Intent intent2 = new Intent(Intent.ACTION_VIEW);
//                intent2.setData(Uri.parse("http://ecc.me.go.kr/"));
//
//                try {
//                    c.startActivity(intent2);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//        Button b3 = findViewById(R.id.buttonWeb3);
//        b3.setOnClickListener(new View.OnClickListener() {
//
//            @SuppressLint("MissingPermission")
//            public void onClick(View v) {
//
//                Context c = v.getContext();
//                Intent intent3 = new Intent(Intent.ACTION_VIEW);
//                intent3.setData(Uri.parse("http://www.k-apt.go.kr/"));
//
//                try {
//                    c.startActivity(intent3);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });
    }
}