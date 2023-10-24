package com.example.myapplication.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.myapplication.Adapter.AdapterListDS;
import com.example.myapplication.Adapter.AdapterTablayout;
import com.example.myapplication.DTO.item_ds;
import com.example.myapplication.R;
import com.example.myapplication.tabbar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FavoriteFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FavoriteFragment extends Fragment {

    RecyclerView tablayout1, listdanhsach1;
    AdapterTablayout adapterTablayout;
    List<String> list;
    List<item_ds> list2;
    AdapterListDS adapterListDS;
    LinearLayout linearLayout;

    // TODO: Rename and change types of parameters

    public FavoriteFragment() {
        // Required empty public constructor
    }


    public static FavoriteFragment newInstance() {
        FavoriteFragment fragment = new FavoriteFragment();
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
        return inflater.inflate(R.layout.fragment_favorite, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tablayout1 = view.findViewById(R.id.tablayoutfavorite);
        listdanhsach1 = view.findViewById(R.id.listdanhsachfavorite);
        list = new ArrayList<>();
        String[] tab = {"PDF", "Word","Excel", "PPT"};
        list.addAll(Arrays.asList(tab));
        linearLayout = view.findViewById(R.id.layoutf);


        int p = R.drawable.maunavpdf;
        int w = R.drawable.navword;
        int e= R.drawable.navex;
        int pp= R.drawable.navpp;
        adapterListDS = new AdapterListDS(list, getContext(), new tabbar() {
            @Override
            public void onclick(String s) {
                List<item_ds> listm = new ArrayList<>();
                for(int i = 0;i < list2.size();i++){
                    if(list2.get(i).getCataname()== s){
                        listm.add(list2.get(i));
                    }
                }
                switch (s){
                    case "PDF":
                        linearLayout.setBackgroundResource(p);
                        break;
                    case "Word":
                        linearLayout.setBackgroundResource(w);
                        break;
                    case "Excel":
                        linearLayout.setBackgroundResource(e);
                        break;
                    case "PPT":
                        linearLayout.setBackgroundResource(pp);
                        break;
                }
                adapterTablayout = new AdapterTablayout(listm, getContext());
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
                listdanhsach1.setLayoutManager(linearLayoutManager);
                listdanhsach1.setAdapter(adapterTablayout);
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        tablayout1.setLayoutManager(linearLayoutManager);
        tablayout1.setAdapter(adapterListDS);






        int pdf = R.drawable.dsach;
        int word = R.drawable.word;
        int excel = R.drawable.logo_ex;
        int ppt = R.drawable.logo_ppt;
        list2 = new ArrayList<>();

        list2.add(new item_ds(pdf,"All PDF Reader", "2023/05/31","11:37", "37.08KB","PDF"));
        list2.add(new item_ds(pdf,"All PDF Reader", "2023/05/31","11:37", "37.08KB","PDF"));
        list2.add(new item_ds(word,"All PDF Reader", "2023/05/31","11:37", "37.08KB","Word"));
        list2.add(new item_ds(word,"All PDF Reader", "2023/05/31","11:37", "37.08KB","Word"));
        list2.add(new item_ds(word,"All PDF Reader", "2023/05/31","11:37", "37.08KB","Word"));
        list2.add(new item_ds(excel,"All PDF Reader", "2023/05/31","11:37", "37.08KB","Excel"));
        list2.add(new item_ds(excel,"All PDF Reader", "2023/05/31","11:37", "37.08KB","Excel"));
        list2.add(new item_ds(ppt,"All PDF Reader", "2023/05/31","11:37", "37.08KB","PPT"));
        list2.add(new item_ds(ppt,"All PDF Reader", "2023/05/31","11:37", "37.08KB","PPT"));
        List<item_ds> listm = new ArrayList<>();
        for(int i = 0;i < list2.size();i++){
            if(list2.get(i).getCataname()== "PDF"){
                listm.add(list2.get(i));
            }
        }
        adapterTablayout = new AdapterTablayout(listm, getContext());
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        listdanhsach1.setLayoutManager(linearLayoutManager1);
        listdanhsach1.setAdapter(adapterTablayout);

    }
}