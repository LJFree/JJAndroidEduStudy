package com.jdfree.jjandroidedustudy.chapter4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<InfoModel> list = new ArrayList<InfoModel>();

        for (int i = 0; i < 100; i++) {
            InfoModel model = new InfoModel("a" + i, "b" + i, "c" + i);
            list.add(model);
        }

        final ListBaseAdapter adapter = new ListBaseAdapter(list);

        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        // 클릭 이벤트
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this, adapter.getItem(position).toString(), Toast.LENGTH_SHORT).show();
                //    Toast.makeText(MainActivity.this, parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
