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

public class SingerListFragment extends Fragment {

    private RecyclerView mRecyclerView;

    public SingerListFragment() {
        // Required empty public constructor
    }


    public static SingerListFragment newInstance() {
        SingerListFragment fragment = new SingerListFragment();
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

    private class SingerHolder extends RecyclerView.ViewHolder{

        private TextView mSingerName;
        private ImageView mSingerPic;

        public SingerHolder(@NonNull View itemView) {
            super(itemView);
            mSingerName = itemView.findViewById(R.id.txtview_singer);
            mSingerPic = itemView.findViewById(R.id.imgview_singer_pic);
        }

        public void bindSinger(){
            //todo
        }
    }

    private class SingerAdapter extends RecyclerView.Adapter<SingerHolder>{
        //todo

        @NonNull
        @Override
        public SingerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(@NonNull SingerHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }
}