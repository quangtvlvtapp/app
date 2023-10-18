package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.myapplication.Fragment.HomeFragment;
import com.example.myapplication.Tabbar.ExcelFragment;
import com.example.myapplication.Tabbar.PDFFragment;
import com.example.myapplication.Tabbar.PPTFragment;
import com.example.myapplication.Tabbar.WordFragment;

public class TabbarAdapter extends FragmentStatePagerAdapter {
    public TabbarAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new PDFFragment();
            case 1:
                return new WordFragment();
            case 2:
                return new ExcelFragment();
            case 3:
                return new PPTFragment();
            default:
                return new PDFFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title ="";
        switch (position){
            case 0:
                title ="PDF";
                break;
            case 1:
                title="Word";
                break;
            case 2:
                title="Excel";
                break;
            case 3:
                title="PPT";
                break;

        }
        return super.getPageTitle(position);
    }
}
