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

        adapterListDS = new AdapterListDS(list, getContext(), new tabbar() {
            @Override
            public void onclick(String s) {

            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        tablayout1.setLayoutManager(linearLayoutManager);
        tablayout1.setAdapter(adapterListDS);



//        list2 = new ArrayList<>();
//        String[] tab2 = {"All PDF Reader", "2023/05/31","11:37", "37.08KB"};
//        list2.addAll(Arrays.asList(tab2));
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
        adapterTablayout = new AdapterTablayout(list2, getContext());
        LinearLayoutManager linearLayout = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        listdanhsach1.setLayoutManager(linearLayout);
        listdanhsach1.setAdapter(adapterTablayout);
    }
}