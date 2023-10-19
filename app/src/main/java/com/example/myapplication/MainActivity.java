package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;

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

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    RecyclerView tablayout1, listdanhsach1;
    AdapterTablayout adapterTablayout;
    List<String> list;
    List<item_ds> list2;
    AdapterListDS adapterListDS;
//    HomeFragment homeFragment = new HomeFragment();
//    FavoriteFragment favoriteFragment = new FavoriteFragment();
//    recentFragment recentFragment = new recentFragment();
//    SettingFragment settingFragment = new SettingFragment();


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        BottomFragmentAdapter adapter = new BottomFragmentAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        tablayout1 = findViewById(R.id.tablayout);
        listdanhsach1 = findViewById(R.id.listdanhsach);
        list = new ArrayList<>();
        String[] tab = {"PDF", "Word","Excel", "PPT"};
        list.addAll(Arrays.asList(tab));

        adapterListDS = new AdapterListDS(list,getApplicationContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        tablayout1.setLayoutManager(linearLayoutManager);
        tablayout1.setAdapter(adapterListDS);



//        list2 = new ArrayList<>();
//        String[] tab2 = {"All PDF Reader", "2023/05/31","11:37", "37.08KB"};
//        list2.addAll(Arrays.asList(tab2));
        list2 = new ArrayList<>();
        list2.add(new item_ds("All PDF Reader", "2023/05/31","11:37", "37.08KB"));
        list2.add(new item_ds("All PDF Reader", "2023/05/31","11:37", "37.08KB"));
        list2.add(new item_ds("All PDF Reader", "2023/05/31","11:37", "37.08KB"));
        list2.add(new item_ds("All PDF Reader", "2023/05/31","11:37", "37.08KB"));
        list2.add(new item_ds("All PDF Reader", "2023/05/31","11:37", "37.08KB"));
        list2.add(new item_ds("All PDF Reader", "2023/05/31","11:37", "37.08KB"));
        list2.add(new item_ds("All PDF Reader", "2023/05/31","11:37", "37.08KB"));
        list2.add(new item_ds("All PDF Reader", "2023/05/31","11:37", "37.08KB"));
        list2.add(new item_ds("All PDF Reader", "2023/05/31","11:37", "37.08KB"));
        adapterTablayout = new AdapterTablayout(list2,MainActivity.this);
        LinearLayoutManager linearLayout = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        listdanhsach1.setLayoutManager(linearLayout);
        listdanhsach1.setAdapter(adapterTablayout);


//
//     getSupportFragmentManager().beginTransaction().replace(R.id.view_page,homeFragment).commit();
//     bottomNavigationView.setOnItemReselectedListener(new NavigationBarView.OnItemReselectedListener() {
//         @SuppressLint("NonConstantResourceId")
//         @Override
//         public void onNavigationItemReselected(@NonNull MenuItem item) {
//             switch (item.getItemId()){
//                 case R.id.menu_document:
//                     getSupportFragmentManager().beginTransaction().replace(R.id.view_page,homeFragment).commit();
//                     return;
//                 case R.id.menu_recent:
//                     getSupportFragmentManager().beginTransaction().replace(R.id.view_page,favoriteFragment).commit();
//                     return;
//                 case R.id.menu_favorite:
//                     getSupportFragmentManager().beginTransaction().replace(R.id.view_page,recentFragment).commit();
//                     return;
//                 case R.id.menu_setting:
//                     getSupportFragmentManager().beginTransaction().replace(R.id.view_page,settingFragment).commit();
//                     return;
//             }
//             return;
//         }
//     });




    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.menu_document:
//                frame(new HomeFragment());
//                return true;
//            case R.id.menu_recent:
//                frame(new recentFragment());
//                return true;
//            case R.id.menu_favorite:
//                frame(new FavoriteFragment());
//                return true;
//            case R.id.menu_setting:
//                frame(new SettingFragment());
//                return true;
//        }return false;


//
//        int id = item.getItemId();
//        if(id==R.id.menu_document){
//            frame(HomeFragment.newInstance());
//        }else if(id == R.id.menu_recent){
//            frame(recentFragment.newInstance());
//        }else if(id==R.id.menu_favorite){
//            frame(FavoriteFragment.newInstance());
//        } else if (id ==R.id.menu_setting) {
//            frame(SettingFragment.newInstance());
//        }
//        return true;
//    }


        return false;
    }
}