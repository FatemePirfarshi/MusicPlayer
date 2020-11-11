package com.example.musicplayer.repository;

import android.content.Context;
import android.content.res.AssetManager;

public class MusicRepository {

    private static MusicRepository sInstance;
    private Context mContext;

    public static MusicRepository getInstance(Context context){
        if(sInstance == null)
            return new MusicRepository(context);
        return sInstance;
    }

    private MusicRepository(Context context){
        mContext = context.getApplicationContext();
    }

    public void loadMusics(){

    }
}
