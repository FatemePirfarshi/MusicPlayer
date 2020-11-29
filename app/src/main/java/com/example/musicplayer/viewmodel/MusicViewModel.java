package com.example.musicplayer.viewmodel;

import android.content.Context;
import android.content.Intent;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.musicplayer.model.Music;
import com.example.musicplayer.repository.MusicRepository;
import com.example.musicplayer.view.activity.MusicPlayerActivity;

public class MusicViewModel extends BaseObservable {
    private Music mMusic;
    private MusicRepository mRepository;
    private Context mContext;

    public Music getMusic() {
        return mMusic;
    }

    public MusicViewModel(Context context){
        mContext = context;
        mRepository = MusicRepository.getInstance(context);
    }

    public void setMusic(Music music) {
        mMusic = music;
        notifyChange();
    }

    @Bindable
    public String getMusicName(){
        return mMusic.getMusicName();
    }

    @Bindable
    public String getAlbum(){
        return mMusic.getAlbum();
    }

    @Bindable
    public String getSinger(){
        return mMusic.getSinger();
    }

    @Bindable
    public long getMusicId(){
        return mMusic.getId();
    }

    public void playMusic(){
        mRepository.playMusic(mMusic);
        MusicPlayerActivity.start(mContext, mMusic);
    }
}