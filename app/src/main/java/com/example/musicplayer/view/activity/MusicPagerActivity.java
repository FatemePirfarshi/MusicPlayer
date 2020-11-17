package com.example.musicplayer.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.musicplayer.R;
import com.example.musicplayer.databinding.ActivityMusicPagerBinding;
import com.example.musicplayer.view.adapter.MusicPagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MusicPagerActivity extends AppCompatActivity {

    private ActivityMusicPagerBinding mBinding;

    public static void start(Context context){
        Intent intent = new Intent(context, MusicPagerActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_music_pager);

        initViews();
    }

    private void initViews() {
        MusicPagerAdapter adapter = new MusicPagerAdapter(this);
        mBinding.pager.setAdapter(adapter);

        final String[] tabText = {"singers", "albums", "songs"};

        new TabLayoutMediator(mBinding.tabLayout, mBinding.pager,
                new TabLayoutMediator.TabConfigurationStrategy() {
                    @Override
                    public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                        tab.setText(tabText[position]);
                    }
                }).attach();
    }
}