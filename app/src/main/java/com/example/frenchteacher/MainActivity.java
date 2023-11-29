package com.example.frenchteacher;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import com.example.frenchteacher.R;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playRabbitSound(View view) {
        playSound(R.raw.rabbit);
    }

    public void playLionSound(View view) {
        playSound(R.raw.lion);
    }

    public void playDogSound(View view) {
        playSound(R.raw.dog);
    }

    public void playCowSound(View view) {
        playSound(R.raw.cow);
    }

    public void playDonkeySound(View view) {
        playSound(R.raw.donkey);
    }

    private void playSound(int soundResource) {
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(this, soundResource);
        mediaPlayer.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
