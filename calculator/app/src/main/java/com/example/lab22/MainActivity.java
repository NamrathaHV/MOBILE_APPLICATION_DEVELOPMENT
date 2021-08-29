package com.example.lab22;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button badd,bsub,bmult,bdiv;
    EditText editt1,editt2;
    TextView textres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        badd=(Button) findViewById(R.id.button1);
        badd.setOnClickListener(this);
        bsub=(Button) findViewById(R.id.button2);
        bsub.setOnClickListener(this);
        bmult=(Button) findViewById(R.id.button3);
        bmult.setOnClickListener(this);
        bdiv=(Button) findViewById(R.id.button4);
        bdiv.setOnClickListener(this);
        editt1=(EditText) findViewById(R.id.editText1);
        editt2=(EditText) findViewById(R.id.editText2);
        textres=(TextView) findViewById(R.id.textView);
    }

    @Override
    public void onClick(View view) {
        int num1, num2;
        num1 = Integer.parseInt(editt1.getText().toString());
        num2 = Integer.parseInt(editt2.getText().toString());
        switch (view.getId()) {
            case R.id.button1:
                int sum = num1 + num2;
                textres.setText("= " + String.valueOf(sum));
                break;

            case R.id.button2:
                int difference = num1 - num2;
                textres.setText("= " + String.valueOf(difference));
                break;

            case R.id.button3:
                int product = num1 * num2;
                textres.setText("= " + String.valueOf(product));
                break;

            case R.id.button4:
                float quotient;
                if (num2 == 0)
                    textres.setText("Divide By Zero Error");
                else {
                    quotient = (float) num1 / num2;
                    textres.setText("= " + String.valueOf(quotient));
                }
                break;
        }
    }
}