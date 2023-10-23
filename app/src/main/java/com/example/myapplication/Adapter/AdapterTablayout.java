package com.example.myapplication.Adapter;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myapplication.DTO.item_ds;
import com.example.myapplication.R;
import com.example.myapplication.View.ShowwordActivity;
import com.example.myapplication.View.ViewExcelActivity;
import com.example.myapplication.View.pdffActivity;
import com.example.myapplication.View.ppActivity;

import java.util.ArrayList;
import java.util.List;

public class AdapterTablayout extends RecyclerView.Adapter<AdapterTablayout.ViewHodel> {
    List<item_ds> list = new ArrayList<>();
    private Context mContext;
    boolean like=false;


    public AdapterTablayout(List<item_ds> list, Context mContext) {
        this.list = list;
        this.mContext = mContext;
    }


    @NonNull
    @Override
    public ViewHodel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_danhsach,parent,false);
        return new ViewHodel(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHodel holder, int position) {
        item_ds itemDs = list.get(position);
        Glide.with(mContext).load(list.get(position).getImg()).into(holder.img);
          holder.textView.setText(itemDs.getName());
          holder.textView2.setText(itemDs.getDate());
          holder.textView3.setText(itemDs.getTime());
          holder.textView4.setText(itemDs.getDulieu());

          holder.deleteedit1.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                   openDilog(Gravity.CENTER,itemDs);
              }
          });

        holder.like1.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  if(like){
                      holder.like1.setImageResource(R.drawable.like);
                      like= false;
                  }else {
                      holder.like1.setImageResource(R.drawable.likedm);
                      like= true;
                  }
              }
          });

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 onClickPdf(itemDs);
            }
        });

    }

    private void onClickPdf(item_ds itemDs) {
        if(itemDs.getCataname() == "PDF"){
            Intent intent = new Intent(mContext, pdffActivity.class);
            mContext.startActivity(intent);
        }else if(itemDs.getCataname() == "Word"){
            Intent intent = new Intent(mContext, ShowwordActivity.class);
            mContext.startActivity(intent);
        } else if (itemDs.getCataname()=="Excel") {
            Intent intent = new Intent(mContext, ViewExcelActivity.class);
            mContext.startActivity(intent);
        }else{
            Intent intent = new Intent(mContext, ppActivity.class);
            mContext.startActivity(intent);
        }


    }

    private void openDilog(int gravity,item_ds itemDs){
        LinearLayout edit,delete,share;
        ImageView img;
        final Dialog dialog = new Dialog((Activity) mContext);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.show_chucnang);
        edit = dialog.findViewById(R.id.edit);
        delete = dialog.findViewById(R.id.delete);
        share = dialog.findViewById(R.id.share);
        img = dialog.findViewById(R.id.imgshow);
        if(itemDs.getCataname() == "PDF"){
            img.setImageResource(R.drawable.dsach);
        }else if(itemDs.getCataname() == "Word"){
            img.setImageResource(R.drawable.word);
        }else if(itemDs.getCataname() == "Excel"){
            img.setImageResource(R.drawable.logo_ex);
        }else if(itemDs.getCataname() == "PPT"){
            img.setImageResource(R.drawable.logo_ppt);
        }
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView canneledit,editd;
                final Dialog dialog = new Dialog((Activity) mContext);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.dialog_edit);
                canneledit = dialog.findViewById(R.id.canneledit);
                editd = dialog.findViewById(R.id.editdd);
                canneledit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });

                editd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });
                dialog.show();
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinearLayout delete;
                TextView cannel;
                final Dialog dialog = new Dialog((Activity) mContext);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.dilogdelete);
                cannel = dialog.findViewById(R.id.cannel);
                delete = dialog.findViewById(R.id.delete);
                cannel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });
                delete.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });
                dialog.show();
            }
        });
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

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
        window.setAttributes(layoutParams);
            dialog.setCancelable(true);
        dialog.show();
    }
    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHodel extends RecyclerView.ViewHolder{
        private TextView textView,textView2,textView3,textView4;
        private ImageView like1,deleteedit1,img;
        LinearLayout linearLayout;

        public ViewHodel(@NonNull View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.img);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.layout_item);
            like1 = (ImageView) itemView.findViewById(R.id.like);
            deleteedit1 = (ImageView) itemView.findViewById(R.id.deleteedit);
            textView = (TextView) itemView.findViewById(R.id.text1);
            textView2 = (TextView) itemView.findViewById(R.id.text2);
            textView3 = (TextView) itemView.findViewById(R.id.text3);
            textView4 = (TextView) itemView.findViewById(R.id.text4);
        }
    }
}
