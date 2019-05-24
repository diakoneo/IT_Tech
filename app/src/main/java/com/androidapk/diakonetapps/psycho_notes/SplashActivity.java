package com.androidapk.diakonetapps.psycho_notes;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

public class SplashActivity extends AppCompatActivity {

    private ImageView loading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        loading = findViewById(R.id.loading);

        Glide.with(getApplicationContext())
//                .load("https://ui-ex.com/images/transparent-background-loading-3.gif")
                .load(R.drawable.trans)
                .into(loading);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, ReadActivity.class));
                overridePendingTransition(R.anim.split_enter, R.anim.split_exit);
                finish();
            }
        }, 3000);
    }
}
