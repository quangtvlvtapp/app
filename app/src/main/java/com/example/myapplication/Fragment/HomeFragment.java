package com.example.myapplication.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.Adapter.AdapterListDS;
import com.example.myapplication.Adapter.AdapterTablayout;
import com.example.myapplication.DTO.item_ds;
import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import com.example.myapplication.TabbarAdapter;
import com.example.myapplication.tabbar;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


    // TODO: Rename and change types of parameters
    RecyclerView tablayout1, listdanhsach1;
    AdapterTablayout adapterlist2;
    List<String> list;
    List<item_ds> list2;
    AdapterListDS adapterListDS;
    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        tabLayout = view.findViewById(R.id.tab_layout);
//        viewPager = view.findViewById(R.id.viewpager);
//        TabbarAdapter tabbarAdapter = new TabbarAdapter(getActivity().getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
//        viewPager.setAdapter(tabbarAdapter);
//        tabLayout.setupWithViewPager(viewPager);
        tablayout1 = view.findViewById(R.id.tablayout);
        listdanhsach1 = view.findViewById(R.id.listdanhsach);
        list = new ArrayList<>();
        String[] tab = {"PDF", "Word","Excel", "PPT"};
        list.addAll(Arrays.asList(tab));
        list2 = new ArrayList<>();
        list2.add(new item_ds("All PDF Reader", "2023/05/31","11:37", "37.08KB","PDF"));
        list2.add(new item_ds("All PDF Reader", "2023/05/31","11:37", "37.08KB","PDF"));
        list2.add(new item_ds("All PDF Reader", "2023/05/31","11:37", "37.08KB","Word"));
        list2.add(new item_ds("All PDF Reader", "2023/05/31","11:37", "37.08KB","Word"));
        list2.add(new item_ds("All PDF Reader", "2023/05/31","11:37", "37.08KB","Word"));
        list2.add(new item_ds("All PDF Reader", "2023/05/31","11:37", "37.08KB","Word"));
        list2.add(new item_ds("All PDF Reader", "2023/05/31","11:37", "37.08KB","Word"));
        list2.add(new item_ds("All PDF Reader", "2023/05/31","11:37", "37.08KB","Word"));
        list2.add(new item_ds("All PDF Reader", "2023/05/31","11:37", "37.08KB","Word"));
        adapterlist2 = new AdapterTablayout(list2, getContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        listdanhsach1.setLayoutManager(linearLayoutManager);
        listdanhsach1.setAdapter(adapterlist2);
        adapterListDS = new AdapterListDS(list, getContext(), new tabbar() {
            @Override
            public void onclick(String s) {
                List<item_ds> listm = new ArrayList<>();
                for(int i = 0;i < list2.size();i++){
                    if(list2.get(i).getCataname()== s){
                        listm.add(list2.get(i));
                    }
                }
                adapterlist2 = new AdapterTablayout(listm, getContext());
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
                listdanhsach1.setLayoutManager(linearLayoutManager);
                listdanhsach1.setAdapter(adapterlist2);
            }
        });
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        tablayout1.setLayoutManager(linearLayoutManager1);
        tablayout1.setAdapter(adapterListDS);



//        list2 = new ArrayList<>();
//        String[] tab2 = {"All PDF Reader", "2023/05/31","11:37", "37.08KB"};
//        list2.addAll(Arrays.asList(tab2));

    }
}