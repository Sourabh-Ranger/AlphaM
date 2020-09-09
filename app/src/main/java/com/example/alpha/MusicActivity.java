package com.example.alpha;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;

import java.io.IOException;
import java.util.ArrayList;


public class MusicActivity extends AppCompatActivity {


// this is fourth version off music player and best one which made
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);


        String url2="https://firebasestorage.googleapis.com/v0/b/alpha-music-94973.appspot.com/o/Songs%2FCalm%20Music%20for%20Peace%20and%20Relaxation%2C%20Inner%20Peace%20Music%20%E9%9F%B3%E6%A5%BD%20to%20Calm%20the%20Mind2020%2C.mp3?alt=media&token=a035fc05-6612-4bc0-b9d3-bb83213f24b4";
        String url1="https://firebasestorage.googleapis.com/v0/b/alpha-music-94973.appspot.com/o/Songs%2FMeditation.mp3?alt=media&token=28d849c6-5577-4f79-ae6e-9507b4ea3396";
        JcPlayerView jcPlayerView=findViewById(R.id.jcplayer);


        ArrayList<JcAudio> jcAudios = new ArrayList<>();
        jcAudios.add(JcAudio.createFromURL("Meditation 1",url1));
        jcAudios.add(JcAudio.createFromURL("Meditation 2",url2));

        jcPlayerView.initPlaylist(jcAudios, null);

        jcPlayerView.createNotification(); // default icon
    }




}


/*

version one 1.0.0

 String url = "https://firebasestorage.googleapis.com/v0/b/alpha-music-94973.appspot.com/o/Calm%20Music%20for%20Peace%20and%20Relaxation%2C%20Inner%20Peace%20Music%20%E9%9F%B3%E6%A5%BD%20to%20Calm%20the%20Mind2020%2C.mp3?alt=media&token=b2390e9e-e078-4284-8972-d4c356b6bf2a"; // your URL here
        final MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(
                new AudioAttributes.Builder()
                        .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                        .setUsage(AudioAttributes.USAGE_MEDIA)
                        .build()
        );
        try {
            mediaPlayer.setDataSource(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mediaPlayer.prepare(); // might take long! (for buffering, etc)
        } catch (IOException e) {
            e.printStackTrace();
        }


        final Button play = (Button) findViewById(R.id.btn1);
        final Button stop = (Button) findViewById(R.id.btn2);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.stop();

   }





   version 2.0.0


 <Button
        android:id="@+id/play_btn"
        android:layout_width="174dp"
        android:layout_height="wrap_content"
        android:layout_alignParentTop="true"
        android:layout_centerHorizontal="true"
        android:onClick="playFile1"
        android:layout_marginStart="105dp"
        android:layout_marginTop="50dp"
        android:background="@color/white"
        android:text="MIND MUSIC" />


    <Button
        android:id="@+id/stop_btn"
        android:layout_width="174dp"
        android:layout_height="wrap_content"
        android:layout_alignParentTop="true"
        android:layout_centerHorizontal="true"
        android:onClick="playFile2"
        android:layout_marginStart="105dp"
        android:layout_marginTop="500dp"
        android:background="@color/white"
        android:text="STOP MUSIC" />




//java

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import java.io.IOException;


public class MusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

    }

 public void playFile1(View v)
        {
            MediaPlayer mediaPlayer = new MediaPlayer();
            try
            {
                mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/alpha-music-94973.appspot.com/o/Calm%20Music%20for%20Peace%20and%20Relaxation%2C%20Inner%20Peace%20Music%20%E9%9F%B3%E6%A5%BD%20to%20Calm%20the%20Mind2020%2C.mp3?alt=media&token=b2390e9e-e078-4284-8972-d4c356b6bf2a");

                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();

                    }




            });
                        mediaPlayer.prepareAsync();
            } catch (IOException ex) {
                ex.printStackTrace();
            }


        }


    public void playFile2(View v)
    {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try
        {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/alpha-music-94973.appspot.com/o/Yanny%20v%20Laurel%20video%20which%20name%20do%20you%20hear%20audio.mp3?alt=media&token=9cc7d427-672d-47eb-9063-348753881892");

            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mp.start();

                }
            });
            mediaPlayer.prepareAsync();
        } catch (IOException ex) {
            ex.printStackTrace();
        }



    }






}



//new media


version 3.0.0

    <ImageView
        android:id="@+id/imagePlayPause"
        android:layout_width="100dp"
        android:layout_height="100dp"

        android:layout_alignParentBottom="true"
        android:layout_centerHorizontal="true"
        android:layout_marginStart="100dp"
        android:layout_marginTop="100dp"
        android:layout_marginBottom="100dp"
        android:contentDescription="@string/app_name"
        android:src="@drawable/ic_play" />

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"

        android:layout_alignParentBottom="true"
        android:layout_centerHorizontal="true"
        android:layout_marginStart="20dp"
        android:layout_marginEnd="20dp"
        android:layout_marginBottom="40dp"
        android:orientation="horizontal" />

    <TextView
        android:id="@+id/textCurrentTime"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentStart="true"
        android:layout_alignParentEnd="true"
        android:layout_alignParentBottom="true"
        android:layout_marginStart="5dp"
        android:layout_marginBottom="70dp"
        android:text="@string/zero"
        android:textColor="#212121"
        android:textSize="18sp"
        android:textStyle="bold" />

    <SeekBar
        android:id="@+id/playerSeekbar"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"

        android:layout_alignParentBottom="true"
        android:layout_centerHorizontal="true"
        android:layout_marginStart="20dp"
        android:layout_marginEnd="20dp"
        android:layout_marginBottom="40dp" />

    <TextView
        android:id="@+id/textTotalDuration"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentStart="true"
        android:layout_alignParentEnd="true"
        android:layout_alignParentBottom="true"
        android:layout_marginEnd="5dp"
        android:layout_marginBottom="70dp"
        android:text="@string/zero"
        android:textAlignment="textEnd"
        android:textColor="#212121"
        android:textSize="18sp"
        android:textStyle="bold" />






//java

package com.example.alpha;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;


public class MusicActivity extends AppCompatActivity {

    private ImageView imagePlayPause;
    private TextView textCurrentTime , textTotalDuration;
    private SeekBar playerSeekBar;
    private MediaPlayer mediaPlayer;
    private Handler handler= new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        imagePlayPause = findViewById(R.id.imagePlayPause);
        textCurrentTime = findViewById(R.id.textCurrentTime);
        textTotalDuration = findViewById(R.id.textTotalDuration);
        playerSeekBar = findViewById(R.id.playerSeekbar);
        mediaPlayer = new MediaPlayer();


        playerSeekBar.setMax(100);


        imagePlayPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying())
                {
                    handler.removeCallbacks(updater);
                    mediaPlayer.pause();
                    imagePlayPause.setImageResource(R.drawable.ic_play);
                }else {
                    mediaPlayer.start();
                    imagePlayPause.setImageResource(R.drawable.ic_pause);
                    updateSeekBar();

                }
            }
        });

        prepareMediaPlayer();
        playerSeekBar.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                SeekBar seekBar = (SeekBar) view;
                int playPosition = (mediaPlayer.getDuration() / 100)* seekBar.getProgress();
                mediaPlayer.seekTo(playPosition);
                textCurrentTime.setText(milliSecondsToTimer(mediaPlayer.getCurrentPosition()));
                return false;
            }
        });


        mediaPlayer.setOnBufferingUpdateListener(new MediaPlayer.OnBufferingUpdateListener() {
            @Override
            public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
                playerSeekBar.setSecondaryProgress(i);
            }
        });
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                playerSeekBar.setProgress(0);
                imagePlayPause.setImageResource(R.drawable.ic_play);
                textCurrentTime.setText(R.string.zero);
                textTotalDuration.setText(R.string.zero);
                mediaPlayer.reset();
                prepareMediaPlayer();
            }
        });

    }




    private void prepareMediaPlayer() {
        try{
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/alpha-music-94973.appspot.com/o/Calm%20Music%20for%20Peace%20and%20Relaxation%2C%20Inner%20Peace%20Music%20%E9%9F%B3%E6%A5%BD%20to%20Calm%20the%20Mind2020%2C.mp3?alt=media&token=b2390e9e-e078-4284-8972-d4c356b6bf2a");  //url of music
            mediaPlayer.prepare();
            textTotalDuration.setText(milliSecondsToTimer(mediaPlayer.getDuration()));
        }catch (Exception exception) {
            Toast.makeText(this, exception.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }




    private Runnable updater = new Runnable() {
        @Override
        public void run() {
            updateSeekBar();
            long currentDuration = mediaPlayer.getCurrentPosition();
            textCurrentTime.setText(milliSecondsToTimer(currentDuration));
        }
    };




    private void updateSeekBar(){
        if(mediaPlayer.isPlaying()){
            playerSeekBar.setProgress((int)(((float) mediaPlayer.getCurrentPosition() / mediaPlayer.getDuration())*100));
            handler.postDelayed(updater, 1000);
        }

    }NonNull



    private  String milliSecondsToTimer(long milliSeconds) {
        String timeString = "";
        String secondsString;

        int hours = (int) (milliSeconds / (1000 * 60 * 60));
        int minutes = (int) (milliSeconds % (1000 * 60 * 60)) / (1000 * 60);
        int seconds = (int) ((milliSeconds % (1000 * 60 * 60)) % (1000 * 60) / 1000);

        if (hours > 0) {
            timeString = hours + ":";
        }
        if (seconds < 10) {
            secondsString = "0" + seconds;
        } else {
            secondsString = "" + seconds;
        }
        timeString = timeString + minutes + ":" + secondsString;


        return timeString;
    }



}

 */