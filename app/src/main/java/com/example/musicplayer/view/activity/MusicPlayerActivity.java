package com.example.musicplayer.view.activity;

import android.content.Context;
import android.content.Intent;

import androidx.fragment.app.Fragment;

import com.example.musicplayer.view.fragment.MusicPlayerFragment;

public class MusicPlayerActivity extends SingleFragmentActivity {

    public static void start(Context context) {
        Intent starter = new Intent(context, MusicPlayerActivity.class);
        context.startActivity(starter);
    }

    @Override
    public Fragment createFragment() {
        return MusicPlayerFragment.newInstance();
    }
}