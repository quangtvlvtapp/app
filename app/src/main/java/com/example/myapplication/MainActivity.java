package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.Adapter.AdapterListDS;
import com.example.myapplication.Adapter.AdapterTablayout;
import com.example.myapplication.DTO.item_ds;
import com.example.myapplication.Fragment.FavoriteFragment;
import com.example.myapplication.Fragment.HomeFragment;
import com.example.myapplication.Fragment.SettingFragment;
import com.example.myapplication.Fragment.recentFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity  {
    RecyclerView tablayout1, listdanhsach1;
    AdapterTablayout adapterTablayout;
    List<String> list;
    List<item_ds> list2;
    AdapterListDS adapterListDS;
    boolean danhgia = false;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        BottomFragmentAdapter adapter = new BottomFragmentAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);



        getSupportFragmentManager().beginTransaction().replace(R.id.view_page,HomeFragment.newInstance(),"HomeFragment").commit();
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if(id==R.id.menu_document){
                    showFragment(HomeFragment.newInstance(),"HomeFragment");
                    return true;
                }else if(id == R.id.menu_recent){
                    showFragment(recentFragment.newInstance(),"recentFragment");
                    return true;
                }else if(id==R.id.menu_favorite){
                    showFragment(FavoriteFragment.newInstance(),"FavoriteFragment");
                    return true;
                } else if (id ==R.id.menu_setting) {
                    showFragment(SettingFragment.newInstance(),"SettingFragment");
                    dilog(Gravity.BOTTOM);
                    return true;
                }
                return false;
            }
        });
    }
     public void dilog(int gravity){
         TextView textView;
         ImageView imageView,imageView1,imageView2,imageView3,imageView4,view;

         Dialog dialog = new Dialog(MainActivity.this);
         dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
         dialog.setContentView(R.layout.dialog_danhgia);
         textView = dialog.findViewById(R.id.dongdgia);
         imageView = dialog.findViewById(R.id.saodg);
         imageView1 = dialog.findViewById(R.id.saodg1);
         imageView2 = dialog.findViewById(R.id.saodg2);
         imageView3 = dialog.findViewById(R.id.saodg3);
         imageView4 = dialog.findViewById(R.id.saodg4);
         view = dialog.findViewById(R.id.dong);
         view.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 dialog.dismiss();
             }
         });
         Window window = dialog.getWindow();
         if(window==null){
             return;
         }
         window.setLayout(WindowManager.LayoutParams.MATCH_PARENT,WindowManager.LayoutParams.WRAP_CONTENT);
         window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
         WindowManager.LayoutParams layoutParams = window.getAttributes();
         layoutParams.gravity = gravity;
         imageView.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(danhgia){
                     imageView.setImageResource(R.drawable.sao);
                     danhgia = false;
                 }else{
                     imageView.setImageResource(R.drawable.saom);
                     danhgia = true;
                 }

             }
         });
         imageView1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(danhgia){
                     imageView1.setImageResource(R.drawable.sao);
                     danhgia = false;
                 }else{
                     imageView1.setImageResource(R.drawable.saom);
                     danhgia = true;
                 }
             }
         });
         imageView2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(danhgia){
                     imageView2.setImageResource(R.drawable.sao);
                     danhgia = false;
                 }else{
                     imageView2.setImageResource(R.drawable.saom);
                     danhgia = true;
                 }
             }
         });
         imageView3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(danhgia){
                     imageView3.setImageResource(R.drawable.sao);
                     danhgia = false;
                 }else{
                     imageView3.setImageResource(R.drawable.saom);
                     danhgia = true;
                 }
             }
         });
         imageView4.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(danhgia){
                     imageView4.setImageResource(R.drawable.sao);
                     danhgia = false;
                 }else{
                     imageView4.setImageResource(R.drawable.saom);
                     danhgia = true;
                 }
             }
         });
         textView.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 dialog.dismiss();
             }
         });

         dialog.show();
     }

    public void showFragment(Fragment fragment, String tag) {
        try {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            Fragment fragment1 = getSupportFragmentManager().findFragmentByTag(tag);
            if (fragment1 != null && fragment1.isAdded()) {
                ft.show(fragment1);
            } else { // fragment needs to be added to frame container
                ft.add(R.id.view_page, fragment, tag);
            }
            List<Fragment> fragments = getSupportFragmentManager().getFragments();
            if (fragments.size() > 0) {
                for (Fragment frag : fragments) {
                    if (frag != fragment1) {
                        if (frag.isAdded())
                            ft.hide(frag);
                    }
                }
            }
            ft.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}