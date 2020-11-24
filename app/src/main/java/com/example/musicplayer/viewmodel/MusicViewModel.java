package com.example.musicplayer.viewmodel;

import android.content.Context;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.musicplayer.model.Music;
import com.example.musicplayer.repository.MusicRepository;

public class MusicViewModel extends BaseObservable {
    private Music mMusic;
    private MusicRepository mRepository;

    public Music getMusic() {
        return mMusic;
    }

    public void setMusic(Music music) {
        mMusic = music;
        notifyChange();
    }

    public MusicViewModel(Context context){

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
    public String getMusicPath(){
        return mMusic.getPath();
    }

}