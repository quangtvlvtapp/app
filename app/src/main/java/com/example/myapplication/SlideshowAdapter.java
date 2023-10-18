package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.myapplication.Slide.Introl2Fragment;
import com.example.myapplication.Slide.Introl3Fragment;
import com.example.myapplication.Slide.IntrolFragment;

public class SlideshowAdapter extends FragmentStatePagerAdapter {
    public SlideshowAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new IntrolFragment();
            case 1:
                return new Introl2Fragment();
            case 2:
                return new Introl3Fragment();
            default:
                return new IntrolFragment();
        }

    }

    @Override
    public int getCount() {
        return 3;
    }
}
