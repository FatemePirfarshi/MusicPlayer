package com.example.musicplayer.controller.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.musicplayer.R;
import com.example.musicplayer.controller.fragment.AlbumListFragment;
import com.example.musicplayer.controller.fragment.MusicListFragment;
import com.example.musicplayer.controller.fragment.SingerListFragment;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;

public class MusicPagerActivity extends AppCompatActivity {

    public static void start(Context context){
        Intent intent = new Intent(context, MusicPagerActivity.class);
        context.startActivity(intent);
    }

    private ViewPager2 mPager2;
    private TabLayout mTabLayout;
    private List<Fragment>  mFragments = new ArrayList<Fragment>(){{
        add(SingerListFragment.newInstance());
        add(AlbumListFragment.newInstance());
        add(MusicListFragment.newInstance());
    }};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_pager);

        findViews();
        initViews();
    }

    private void initViews() {
        MusicPagerAdapter adapter = new MusicPagerAdapter(this);
        mPager2.setAdapter(adapter);

        final String[] tabText = {"singers", "albums", "songs"};

        new TabLayoutMediator(mTabLayout, mPager2,
                new TabLayoutMediator.TabConfigurationStrategy() {
                    @Override
                    public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                        tab.setText(tabText[position]);
                    }
                }).attach();
    }

    private void findViews() {
        mPager2 = findViewById(R.id.pager);
        mTabLayout = findViewById(R.id.tab_layout);
    }


    private class MusicPagerAdapter extends FragmentStateAdapter {


        public MusicPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            return mFragments.get(position);
        }

        @Override
        public int getItemCount() {
            return mFragments.size();
        }
    }
}