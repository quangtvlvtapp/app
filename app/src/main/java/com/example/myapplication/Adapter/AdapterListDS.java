package com.example.myapplication.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.DTO.item_ds;
import com.example.myapplication.R;
import com.example.myapplication.tabbar;

import java.util.ArrayList;
import java.util.List;

public class AdapterListDS extends RecyclerView.Adapter<AdapterListDS.ViewHodel> {
    List<String> list = new ArrayList<>();
    private Context mContext;

    List<item_ds> item = new ArrayList<>();
    tabbar tabbar;
    boolean tab = false;

    int setSlecte = -1;
    int color,boder =R.drawable.boderdo ;
    public AdapterListDS(List<String> list, Context mContext,tabbar tabbar) {
        this.list = list;
        this.mContext = mContext;
        this.tabbar = tabbar;
        this.setSlecte = 0;
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
        int bp = R.drawable.boderdo;
        int bw = R.drawable.boderwx;
        int be = R.drawable.boderex;
        int bpp = R.drawable.boderp;

        boolean inselected = (position == setSlecte);

        int p = R.drawable.maunavpdf;
        int w = R.drawable.navword;
        int e= R.drawable.navex;
        int pp= R.drawable.navpp;
//        holder.imageView.setImageResource(bp);


        switch (list.get(position)){
            case "PDF":
                color = p;
                break;
            case "Word":
                color = w;
                break;
            case "Excel":
                color = e;
                break;
            case "PPT":
                color = pp;
                break;
        }

//        holder.imageView.setBackgroundResource(inselected?color: bp);

        holder.imageView.setBackgroundResource(inselected?color: boder);


        //holder.imageView.setBackgroundResource(inselected?color: android.R.color.white);
        holder.textView.setTextColor(inselected? Color.WHITE:Color.parseColor("#A0A0A0"));

        holder.textView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               switch (list.get(position)){
                   case "PDF":
                       boder = bp;
                       break;
                   case "Word":
                       boder = bw;
                       break;
                   case "Excel":
                       boder = be;
                       break;
                   case "PPT":
                       boder = bpp;
                       break;
               }
               setSlecte = position;
               notifyDataSetChanged();

               tabbar.onclick(list.get(position));

           }
       });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHodel extends RecyclerView.ViewHolder{
        private TextView textView;
        public ImageView imageView;
        CardView linearLayout;
        public ViewHodel(@NonNull View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.tv_tablayout);
            linearLayout = itemView.findViewById(R.id.tablayoutrcview);
            imageView = (ImageView) itemView.findViewById(R.id.imgtab);
        }
    }
}
