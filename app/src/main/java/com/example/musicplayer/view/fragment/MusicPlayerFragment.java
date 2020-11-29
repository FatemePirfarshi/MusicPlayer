package com.example.musicplayer.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.musicplayer.R;
import com.example.musicplayer.databinding.FragmentMusicPlayerBinding;
import com.example.musicplayer.model.Music;
import com.example.musicplayer.viewmodel.MusicViewModel;

public class MusicPlayerFragment extends Fragment {

    public static final String ARGS_MUSIC_PLAYED = "argsMusicPlayed";
    private FragmentMusicPlayerBinding mBinding;
    private MusicViewModel mMusicViewModel;
    private Music mMusic;

    public MusicPlayerFragment() {
        // Required empty public constructor
    }

    public static MusicPlayerFragment newInstance(Music music) {
        MusicPlayerFragment fragment = new MusicPlayerFragment();
        Bundle args = new Bundle();
        args.putSerializable(ARGS_MUSIC_PLAYED, music);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mMusic = (Music) getArguments().getSerializable(ARGS_MUSIC_PLAYED);
        mMusicViewModel = new MusicViewModel(getContext());
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mBinding = DataBindingUtil.inflate(
                inflater,
                R.layout.fragment_music_player,
                container,
                false);

        return mBinding.getRoot();
    }
}