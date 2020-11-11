package com.example.musicplayer.model;

public class Music {
    private String mMusicName;
    private String mMusicPicPath;
    private String mSingerName;
    private String mAlbumName;
    private String mAssetPath;

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

    public String getSingerName() {
        return mSingerName;
    }

    public void setSingerName(String singerName) {
        mSingerName = singerName;
    }

    public String getAlbumName() {
        return mAlbumName;
    }

    public void setAlbumName(String albumName) {
        mAlbumName = albumName;
    }

    public String getAssetPath() {
        return mAssetPath;
    }

    public void setAssetPath(String assetPath) {
        mAssetPath = assetPath;
    }
}
