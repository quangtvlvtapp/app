package com.example.myapplication.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.DTO.item_ds;
import com.example.myapplication.R;
import com.example.myapplication.Tabbar.ExcelFragment;
import com.example.myapplication.Tabbar.PDFFragment;
import com.example.myapplication.Tabbar.PPTFragment;
import com.example.myapplication.Tabbar.WordFragment;
import com.example.myapplication.View.pdffActivity;
import com.example.myapplication.tabbar;

import java.util.ArrayList;
import java.util.List;

public class AdapterListDS extends RecyclerView.Adapter<AdapterListDS.ViewHodel> {
    List<String> list = new ArrayList<>();
    private Context mContext;
    tabbar tabbar;

    public AdapterListDS(List<String> list, Context mContext,tabbar tabbar) {
        this.list = list;
        this.mContext = mContext;
        this.tabbar = tabbar;
    }

    @NonNull
    @Override
    public ViewHodel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_tablayout,parent,false);
        return new ViewHodel(view);
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull ViewHodel holder, int position) {
        holder.textView.setText(list.get(position));
        holder.linearLayout.setOnClickListener(view -> tabbar.onclick(list.get(position)));
    }
//    private void onClickPdf(item_ds itemDs) {
//        Intent intent = new Intent(mContext, pdffActivity.class);
//        Bundle bundle = new Bundle();
//        bundle.putSerializable("object_user",itemDs);
////        intent.putExtra(bundle);
//        mContext.startActivity(intent);
//    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHodel extends RecyclerView.ViewHolder{
        private TextView textView;
        LinearLayout linearLayout;
        public ViewHodel(@NonNull View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.tv_tablayout);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.tablayoutrcview);
        }
    }
}
