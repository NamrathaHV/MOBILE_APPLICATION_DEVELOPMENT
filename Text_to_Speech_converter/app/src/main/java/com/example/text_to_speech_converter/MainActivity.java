package com.example.text_to_speech_converter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    EditText txtspk;
    Button button;
    TextToSpeech textToSpeech;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtspk = (EditText) findViewById(R.id.edittxt);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

        textToSpeech = new TextToSpeech(getBaseContext(), new TextToSpeech.OnInitListener()
        {
            @Override
            public void onInit(int status)
            {
                if(status!=TextToSpeech.ERROR)
                {
                    Toast.makeText(getBaseContext(),"Success",Toast.LENGTH_LONG).show();
                }
            }
        });
        textToSpeech.setLanguage(Locale.ENGLISH);
    }

    @Override
    public void onClick(View v)
    {
        String text=txtspk.getText().toString();
        textToSpeech.speak(text,TextToSpeech.QUEUE_FLUSH,null);
    }
}
