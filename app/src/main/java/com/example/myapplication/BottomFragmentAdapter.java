package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.myapplication.Fragment.FavoriteFragment;
import com.example.myapplication.Fragment.HomeFragment;
import com.example.myapplication.Fragment.SettingFragment;
import com.example.myapplication.Fragment.recentFragment;

public class BottomFragmentAdapter extends FragmentStatePagerAdapter {
    public BottomFragmentAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new recentFragment();
            case 2:
                return new FavoriteFragment();
            case 3:
                return new SettingFragment();
            default:
                return new HomeFragment() ;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }


}
