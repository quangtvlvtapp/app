package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.myapplication.Fragment.FavoriteFragment;
import com.example.myapplication.Fragment.HomeFragment;
import com.example.myapplication.Fragment.SettingFragment;
import com.example.myapplication.Fragment.recentFragment;
import com.example.myapplication.Tabbar.ExcelFragment;
import com.example.myapplication.Tabbar.PDFFragment;
import com.example.myapplication.Tabbar.PPTFragment;
import com.example.myapplication.Tabbar.WordFragment;

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

//    @Nullable
//    @Override
//    public CharSequence getPageTitle(int position) {
//        String title ="";
//        switch (position){
//            case 0:
//                title ="Doucument";
//                break;
//            case 1:
//                title="Recent";
//                break;
//            case 2:
//                title="Favorite";
//                break;
//            case 3:
//                title="Setting";
//                break;
//
//        }
//        return super.getPageTitle(position);
//    }
}
