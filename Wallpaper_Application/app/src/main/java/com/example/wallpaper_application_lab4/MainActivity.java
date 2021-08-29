package com.example.wallpaper_application_lab4;

import androidx.appcompat.app.AppCompatActivity;
import android.app.WallpaperManager;
import android.graphics.BitmapFactory;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.google.android.material.tabs.TabLayout;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import static android.service.controls.ControlsProviderService.TAG;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn;
    boolean running = false;
    int [] imagesArray = new int []{R.drawable.p1,R.drawable.p2,R.drawable.p3,R.drawable.p4,R.drawable.p5,
            R.drawable.p6,R.drawable.p7,R.drawable.p8,R.drawable.p9,R.drawable.p10,R.drawable.p11,
            R.drawable.p12, R.drawable.p13};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btnchng);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(!running)
        {
            new Timer().schedule(new MyTimer(),0,30000);
            running=false;
        }
    }
    class MyTimer extends TimerTask
    {
        public void run()
        {
            try {
                {
                    WallpaperManager wallpaperManager = WallpaperManager.getInstance(getBaseContext());
                    Random r = new Random();
                    wallpaperManager.setBitmap(BitmapFactory.decodeResource(getResources(), imagesArray[r.nextInt(13)]));
                    //Log.d(TAG, "loadUserData() after increment is" + i);
                }
            }
            catch (Exception e){}
        }
    }
}