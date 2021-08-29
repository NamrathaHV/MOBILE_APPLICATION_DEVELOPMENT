package com.example.list_view;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listView;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listView=(ListView)findViewById(R.id.listview1);
        adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        adapter.add(" Android Lab");
        adapter.add(" SS Lab");
        adapter.add(" CGV Lab");
        adapter.add(" WTA Lab");
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
        String item=(String)adapter.getItem(i);
        Toast.makeText(getBaseContext(),"You clicked on: "+item,Toast.LENGTH_LONG).show();
        if(i == 0)
        {
            Intent intent=new Intent(view.getContext(), MainActivity1.class);
            startActivity(intent);

        }
        else if(i == 1)
        {
            Intent intent=new Intent(view.getContext(), MainActivity2.class);
            startActivity(intent);
        }
        else if(i == 2)
        {
            Intent intent=new Intent(view.getContext(), MainActivity3.class);
            startActivity(intent);
        }
        else if (i == 3)
        {
            Intent intent=new Intent(view.getContext(), MainActivity4.class);
            startActivity(intent);
        }

    }
}