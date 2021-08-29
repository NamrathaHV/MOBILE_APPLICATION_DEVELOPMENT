package com.example.signup_labprogram3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText txt_username, txt_password;
    Button btn_Signup;
    String regularExpression="^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!])[A-Za-z\\d@$!]{8,}$";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_username=(EditText)findViewById(R.id.txtUsername);
        txt_password=(EditText)findViewById(R.id.txtPassword);
        btn_Signup=(Button)findViewById(R.id.btnSignup);
        btn_Signup.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String username=txt_username.getText().toString();
        String password=txt_password.getText().toString();
        if((validatePassword(password))==true)
        {
            Bundle bundle=new Bundle();
            bundle.putString("user",username);
            bundle.putString("pass",password);
            Intent it=new Intent(this,SignIn.class);
            it.putExtra("data",bundle);
            startActivity(it);
        }
        else
        {
            Toast.makeText(getBaseContext(), "Invalid password", Toast.LENGTH_SHORT).show();
        }
    }
    public boolean validatePassword(String password) {
        Pattern pattern=Pattern.compile(regularExpression);
        Matcher matcher=pattern.matcher(password);
        return matcher.matches();
    }
}