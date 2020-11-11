package com.example.musicplayer.controller.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.musicplayer.R;
import com.example.musicplayer.model.Music;

import java.util.List;

public class MusicPlayerFragment extends Fragment {

    private ImageView mMusicPic;
    private SeekBar mSeekBar;
    private TextView mMusicName, mMusicSinger, mStartTime, mEndTime;
    private ImageButton mNext, mPrevious, mPlay, mShuffle, mRepeatAll, mRepeatOne;

    public MusicPlayerFragment() {
        // Required empty public constructor
    }

    public static MusicPlayerFragment newInstance() {
        MusicPlayerFragment fragment = new MusicPlayerFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_music_player, container, false);

        findViews(view);
        setListeners();

        return view;
    }

    private void findViews(View view) {
        mMusicPic = view.findViewById(R.id.imgview_music_pic);
        mMusicName = view.findViewById(R.id.txtview_music_name);
        mMusicSinger = view.findViewById(R.id.txtview_singer_music);
        mSeekBar = view.findViewById(R.id.seekBar_music);
        mStartTime = view.findViewById(R.id.txtview_start_seekbar);
        mEndTime = view.findViewById(R.id.txtView_end_seekbar);
        mNext = view.findViewById(R.id.btn_next);
        mPrevious = view.findViewById(R.id.btn_previous);
        mPlay = view.findViewById(R.id.btn_play);
        mShuffle = view.findViewById(R.id.btn_shuffle);
        mRepeatAll = view.findViewById(R.id.btn_repeat_all);
        mRepeatOne = view.findViewById(R.id.btn_repeat_one);
    }

    private void setListeners() {
    }
}