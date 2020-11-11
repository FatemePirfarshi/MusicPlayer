package com.example.musicplayer.controller.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.musicplayer.R;
import com.example.musicplayer.model.Music;

import java.util.List;


public class MusicListFragment extends Fragment {

    private RecyclerView mRecyclerView;
//todo

    public MusicListFragment() {
        // Required empty public constructor
    }

    public static MusicListFragment newInstance() {
        MusicListFragment fragment = new MusicListFragment();
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
        View view = inflater.inflate(R.layout.fragment_music_list, container, false);
        findViews(view);
        initViews();

        return view;
    }

    private void initViews() {
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        updateUI();
    }

    private void findViews(View view) {
        mRecyclerView = view.findViewById(R.id.recycler_view_music_list);
    }

    private void updateUI(){
        //todo
    }

    private class MusicHolder extends RecyclerView.ViewHolder{

        private TextView mMusicName;
        private TextView mSingerName;
        private ImageView mMusicPic;

        public MusicHolder(@NonNull View itemView) {
            super(itemView);
            mMusicName = itemView.findViewById(R.id.imgview_music_pic);
            mSingerName = itemView.findViewById(R.id.txtview_singer_music);
            mMusicPic = itemView.findViewById(R.id.imgview_music_pic);
        }

        public void bindMusic(Music music){
            //todo
        }
    }

    private class MusicAdapter extends RecyclerView.Adapter<MusicHolder> {

        private List<Music> mMusics;

        public List<Music> getMusics() {
            return mMusics;
        }

        public void setMusics(List<Music> musics) {
            mMusics = musics;
        }

        public MusicAdapter(List<Music> musics){
            mMusics = musics;
        }

        @NonNull
        @Override
        public MusicHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new MusicHolder(LayoutInflater
                    .from(getActivity())
                    .inflate(R.layout.music_list_item, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull MusicHolder holder, int position) {
            holder.bindMusic(mMusics.get(position));
        }

        @Override
        public int getItemCount() {
            return mMusics.size();
        }
    }
}