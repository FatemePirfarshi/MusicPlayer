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

public class AlbumListFragment extends Fragment {

    private RecyclerView mRecyclerView;
    //todo

    public AlbumListFragment() {
        // Required empty public constructor
    }

    public static AlbumListFragment newInstance() {
        AlbumListFragment fragment = new AlbumListFragment();
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

    private class AlbumHolder extends RecyclerView.ViewHolder{

        private TextView mAlbumName;
        private TextView mAlbumSinger;
        private ImageView mAlbumImage;


        public AlbumHolder(@NonNull View itemView) {
            super(itemView);
            mAlbumName = itemView.findViewById(R.id.txtview_album);
            mAlbumSinger = itemView.findViewById(R.id.txtview_singer_album);
            mAlbumImage = itemView.findViewById(R.id.imgview_album_pic);
        }

        public void bindAlbum(){
            //todo
        }
    }

    private class AlbumAdapter extends RecyclerView.Adapter<AlbumHolder>{
        //todo

        @NonNull
        @Override
        public AlbumHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(@NonNull AlbumHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }
}