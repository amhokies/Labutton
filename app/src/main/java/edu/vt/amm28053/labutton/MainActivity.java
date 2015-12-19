package edu.vt.amm28053.labutton;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    /*
     *  These are all the audio files that are contained in the app. If new audio files are added
     *  in the future, they will also need to be added here in order to be played.
     */
    private static final int[] AUDIO_FILES = { R.raw.anyoneelse, R.raw.doit, R.raw.dreams,
            R.raw.dreamscometrue, R.raw.givingup, R.raw.impossible, R.raw.success, R.raw.yesterday,
            R.raw.yesyoucan };

    private Button labutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        labutton = (Button)findViewById(R.id.labutton);

        labutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mPlayer = MediaPlayer.create(MainActivity.this, getRandomAudioFile());
                mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mPlayer.start();
            }
        });
    }

    /**
     * Returns the resource ids of one of the audio files, chosen "Randomly"
     * @return the resource id of the audio file chosen
     */
    private int getRandomAudioFile() {
        return AUDIO_FILES[new Random().nextInt(AUDIO_FILES.length)];
    }
}
