package com.example.myapplication.Tabbar;

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
import com.example.myapplication.Adapter.AdapterWord;
import com.example.myapplication.DTO.item_ds;
import com.example.myapplication.DTO.item_w;
import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordFragment extends Fragment {

    RecyclerView tablayout1, listdanhsach1;

    List<String> list;
    List<item_w> listw;
   AdapterWord adapterListDS;

    // TODO: Rename and change types of parameters


    public WordFragment() {
        // Required empty public constructor
    }


    public static WordFragment newInstance() {
        WordFragment fragment = new WordFragment();
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
        return inflater.inflate(R.layout.fragment_word, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tablayout1 = view.findViewById(R.id.tablayoutWord);
        listdanhsach1 = view.findViewById(R.id.listdanhsachWord);
//        list = new ArrayList<>();
//        String[] tab = {"PDF", "Word","Excel", "PPT"};
//        list.addAll(Arrays.asList(tab));
//
//        adapterListDS = new AdapterListDS(list,getContext());
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
//        tablayout1.setLayoutManager(linearLayoutManager);
//        tablayout1.setAdapter(adapterListDS);



//        list2 = new ArrayList<>();
//        String[] tab2 = {"All PDF Reader", "2023/05/31","11:37", "37.08KB"};
//        list2.addAll(Arrays.asList(tab2));
        listw = new ArrayList<>();
        listw.add(new item_w("All PDF Reader", "2023/05/31","11:37", "37.08KB"));
        listw.add(new item_w("All PDF Reader", "2023/05/31","11:37", "37.08KB"));
        listw.add(new item_w("All PDF Reader", "2023/05/31","11:37", "37.08KB"));
        listw.add(new item_w("All PDF Reader", "2023/05/31","11:37", "37.08KB"));
        listw.add(new item_w("All PDF Reader", "2023/05/31","11:37", "37.08KB"));
        listw.add(new item_w("All PDF Reader", "2023/05/31","11:37", "37.08KB"));
        listw.add(new item_w("All PDF Reader", "2023/05/31","11:37", "37.08KB"));

        adapterListDS = new AdapterWord(listw, getContext());
        LinearLayoutManager linearLayout = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        listdanhsach1.setLayoutManager(linearLayout);
        listdanhsach1.setAdapter(adapterListDS);
    }
}