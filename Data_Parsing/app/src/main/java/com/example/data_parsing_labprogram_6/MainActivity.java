package com.example.data_parsing_labprogram_6;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnParseXml,btnParseJson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnParseXml=(Button)findViewById(R.id.parse_xml_button);
        btnParseJson=(Button)findViewById(R.id.parse_json_button);
        btnParseJson.setOnClickListener(this);
        btnParseXml.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.equals(btnParseJson))
        {
            Intent it=new Intent(this, ParseActivity.class);
            it.putExtra("mode",1);
            startActivity(it);
        }
        else if(view.equals(btnParseXml))
        {
            Intent it=new Intent(this,ParseActivity.class);
            it.putExtra("mode",2);
            startActivity(it);
        }
    }
}