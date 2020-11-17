package com.example.musicplayer.model;

public class Music {

    private String mPath;
    private String mMusicName;
    private String mMusicPicPath;
    private String mSinger;
    private String mAlbum;

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

    public String getMusicPicPath() {
        return mMusicPicPath;
    }

    public void setMusicPicPath(String musicPicPath) {
        mMusicPicPath = musicPicPath;
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
}
