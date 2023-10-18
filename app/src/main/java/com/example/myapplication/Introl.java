package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.QuickContactBadge;
import android.widget.RelativeLayout;
import android.widget.TextView;

import me.relex.circleindicator.CircleIndicator;

public class Introl extends AppCompatActivity {
   private TextView next;
   private ViewPager viewPager;
   private RelativeLayout relativeLayout;
   private CircleIndicator circleIndicator;
   private SlideshowAdapter adapter;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introl);
        next = findViewById(R.id.nextslide);
        viewPager = findViewById(R.id.view_slide);
        relativeLayout = findViewById(R.id.relativeLayout);
        circleIndicator = findViewById(R.id.circle);
        adapter = new SlideshowAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(adapter);
        circleIndicator.setViewPager(viewPager);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(viewPager.getCurrentItem()<2){
                    viewPager.setCurrentItem(viewPager.getCurrentItem()+1);
                } else  {
                    //relativeLayout.setVisibility(View.GONE);
                    startActivity(new Intent(getApplicationContext(),Permission.class));
                }
            }
        });
    }
}