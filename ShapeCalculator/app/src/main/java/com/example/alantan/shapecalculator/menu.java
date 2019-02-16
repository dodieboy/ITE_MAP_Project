package com.example.alantan.shapecalculator;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.VideoView;

public class menu extends AppCompatActivity {

    private  VideoView VideoView2D;
    private  VideoView VideoView3D;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Select type");
    }
    protected  void  onStart(){
        super.onStart();

        VideoView2D = (VideoView) findViewById(R.id.videoView2d);
        VideoView3D = (VideoView) findViewById(R.id.videoView3d);

        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.bg_2d);
        Uri uri2 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.bg_3d);

        VideoView2D.setVideoURI(uri);
        VideoView2D.start();

        VideoView2D.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        VideoView3D.setVideoURI(uri2);
        VideoView3D.start();

        VideoView3D.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });
    }
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            logoutByBackKey();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    protected void logoutByBackKey() {

        AlertDialog alertbox = new AlertDialog.Builder(this)
                .setMessage("Do you want to logout?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    // do something when the button is clicked
                    public void onClick(DialogInterface arg0, int arg1) {
                        startActivity(new Intent(menu.this, MainActivity.class));
                    }
                })

                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    // do something when the button is clicked
                    public void onClick(DialogInterface arg0, int arg1) {
                    }
                })

                .show();
    }
    public void btn2dOnClick(View v)
    {
        startActivity(new Intent(menu.this, cal_2d.class));
    }
    public void btn3dOnClick(View v)
    {
        startActivity(new Intent(menu.this, cal_3d.class));
    }
    public void btnLogoutOnClick(View v) { logoutByBackKey(); }
}
