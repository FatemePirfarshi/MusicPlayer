package com.example.musicplayer.model;

import android.net.Uri;

public class Music {

    private String mPath;
    private String mMusicName;
    private String mSinger;
    private String mAlbum;
    private Uri mAlbumArt;
    private String mDuration;

    public String getPath() {
        return mPath;
    }

    public void setPath(String path) {
        mPath = path;
    }

    public String getMusicName() {
        return mMusicName;
    }

    public void setMusicName(String musicName) {
        mMusicName = musicName;
    }

    public Uri getAlbumArt() {
        return mAlbumArt;
    }

    public void setAlbumArt(Uri albumArt) {
        mAlbumArt = albumArt;
    }

    public String getSinger() {
        return mSinger;
    }

    public void setSinger(String singer) {
        mSinger = singer;
    }

    public String getAlbum() {
        return mAlbum;
    }

    public void setAlbum(String album) {
        mAlbum = album;
    }

    public String getDuration() {
        return mDuration;
    }

    public void setDuration(String duration) {
        mDuration = duration;
    }
}
