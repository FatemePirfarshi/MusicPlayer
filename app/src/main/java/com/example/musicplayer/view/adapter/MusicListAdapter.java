package com.example.musicplayer.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.musicplayer.R;
import com.example.musicplayer.databinding.FragmentMusicListBinding;
import com.example.musicplayer.model.Music;

import java.util.List;

public class MusicListAdapter extends RecyclerView.Adapter<MusicListAdapter.MusicHolder> {

    private List<Music> mMusics;
    private Context mContext;

    public List<Music> getMusics() {
        return mMusics;
    }

    public void setMusics(List<Music> musics) {
        mMusics = musics;
    }

    public MusicListAdapter(Context context, List<Music> musics){
        mMusics = musics;
        mContext = context.getApplicationContext();
    }

    @NonNull
    @Override
    public MusicHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MusicHolder(DataBindingUtil.inflate(
                LayoutInflater.from(mContext),
                R.layout.music_list_item,
                parent,
                false));
    }

    @Override
    public void onBindViewHolder(@NonNull MusicHolder holder, int position) {
        holder.bindMusic(mMusics.get(position));
    }

    @Override
    public int getItemCount() {
        return mMusics.size();
    }

    class MusicHolder extends RecyclerView.ViewHolder {

        FragmentMusicListBinding mFragmentMusicListBinding;

        public MusicHolder(FragmentMusicListBinding fragmentMusicListBinding) {
            super(fragmentMusicListBinding.getRoot());
            mFragmentMusicListBinding = fragmentMusicListBinding;
        }

        public void bindMusic(Music music) {
            //todo
        }
    }
}
