package com.example.hannamofid.hacknowprojectofficial;

import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Activity2 extends YouTubeBaseActivity {

    android.widget.Button buttonPlay;
    android.widget.VideoView videoView;
    android.net.Uri uri;
    MediaController mediaC;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        buttonPlay = (Button) findViewById(R.id.playbutton);
        final YouTubePlayerView youtubePlayerView = findViewById(R.id.youtubePlayerView);
        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // String videoId = editTextId.getText().toString();
                //String videoId ="XQKFNF0sAAY";
                String videoId = "EpVFSti0Ydg";
                playVideo(videoId, youtubePlayerView);
            }
        });


       /* videoView = (VideoView) findViewById(R.id.videoView);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoPlay(v);

            }
        });
        mediaC = new MediaController(this);
*/

    }
    //end of on create



    public void playVideo(final String videoId, YouTubePlayerView youTubePlayerView) {
        //initialize youtube player view
        youTubePlayerView.initialize("AIzaSyCyRqclsfbd-tllvIkaA0-4dt601-opdGM",
                new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider,
                                                        YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.cueVideo(videoId);
                    }

                    @Override
                    public void onInitializationFailure(YouTubePlayer.Provider provider,
                                                        YouTubeInitializationResult youTubeInitializationResult) {

                    }
                });
    }


    /*public void videoPlay (View v){
        String VideoPath = "android:resource//com.example.hannamofid.hacknowprojectofficial/"+ R.raw.meditation;
        Uri uri = Uri.parse(VideoPath);
        videoView.setVideoURI(uri);
        videoView.setMediaController(mediaC);
        mediaC.setAnchorView(videoView);
        videoView.start();

    }
*/




}
