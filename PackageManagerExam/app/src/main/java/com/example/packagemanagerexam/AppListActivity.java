package com.example.packagemanagerexam;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.List;

public class AppListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_list);
        ListView listView = (ListView) findViewById(R.id.list_view);
        //기기에 설치된 모든 앱 목록
        PackageManager pm = getPackageManager(); // PackageManager는 메서드를 통해 얻을수 있다.
        List<ApplicationInfo> infos = pm.getInstalledApplications(PackageManager.GET_META_DATA);
        // List<ApplicationInfo> 모든 앱의 정보를 얻을수 있다.

        AppInfoAdapter adapter = new AppInfoAdapter(infos);
        listView.setAdapter(adapter);
    }
}
