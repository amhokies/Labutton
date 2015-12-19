package edu.vt.amm28053.labutton;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button labutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        labutton = (Button)findViewById(R.id.labutton);

        labutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mPlayer = MediaPlayer.create(MainActivity.this, R.raw.doit);
                mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mPlayer.start();
            }
        });
    }
}
