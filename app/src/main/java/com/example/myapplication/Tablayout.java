package com.example.myapplication;

import static com.example.myapplication.R.id.menu_setting;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import com.example.myapplication.Fragment.FavoriteFragment;
import com.example.myapplication.Fragment.HomeFragment;
import com.example.myapplication.Fragment.SettingFragment;
import com.example.myapplication.Fragment.recentFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.tabs.TabLayout;

public class Tablayout extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager2 viewPager2;
    TabbarAdapter tabbarAdapter;
    FrameLayout frameLayout;
    BottomNavigationView bottomNavigationView;

    private int[] tabIcons = {
            R.drawable.home,
            R.drawable.recent,
            R.drawable.heart,
            R.drawable.settingfr,
    };
    @SuppressLint({"MissingInflatedId", "NonConstantResourceId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablayout);
        frameLayout = findViewById(R.id.framelayout);
        //tabbarAdapter = new TabbarAdapter(this);
        viewPager2 = findViewById(R.id.viewpagetablayout);
        //viewPager2.setAdapter(tabbarAdapter);
        tabLayout = findViewById(R.id.tablayoutfix);
        bottomNavigationView = findViewById(R.id.bottomnvigation);

//        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
//        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
//        tabLayout.getTabAt(2).setIcon(tabIcons[2]);


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tabLayout.getTabAt(position).select();
            }
        });


//        bottomNavigationView.setOnItemReselectedListener((item)-> {
//                switch (item.getItemId()){
//                    case R.id.menu_document:
//                        break;
//                    case R.id.menu_recent:
//                        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,new FavoriteFragment()).commit();
//                        break;
//                    case R.id.menu_favorite:
//                        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,new recentFragment()).commit();
//                        break;
//                    case menu_setting:
//                        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,new SettingFragment()).commit();
//                        break;
//                }
//                return true;
//        });

    }
    private void setUpViewPage(){
//        BottomFragmentAdapter adapter = new BottomFragmentAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
//        viewPager2.setAdapter(adapter);

    }
}