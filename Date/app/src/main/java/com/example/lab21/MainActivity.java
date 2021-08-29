package com.example.lab21;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String disp="Activity Life Cycle";
    TextView txt1;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(disp,"onCreate EXECUTED");
        btn=(Button) findViewById(R.id.button);
        btn.setOnClickListener(this);
        txt1 = (TextView) findViewById(R.id.text1);
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(disp, "onRestart EXECUTED");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(disp, "onStart EXECUTED");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(disp, "onResume EXECUTED");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(disp, "onPause EXECUTED");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(disp, "onStop EXECUTED");
    }

    @Override
    public void onClick(View v) {
        Date date=new Date();
        txt1.setText("Date:"+date.toString());

        Toast.makeText(getBaseContext(), "You pressed Submit Button",Toast.LENGTH_LONG).show();

    }
}

