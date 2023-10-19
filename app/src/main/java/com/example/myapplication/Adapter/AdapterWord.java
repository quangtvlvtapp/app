package com.example.myapplication.Adapter;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
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

import com.example.myapplication.DTO.item_ds;
import com.example.myapplication.DTO.item_w;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterWord extends RecyclerView.Adapter<AdapterWord.ViewHodel>{
    List<item_w> listw = new ArrayList<>();
    private Context mContext;
    boolean like=false;

    public AdapterWord(List<item_w> list, Context mContext) {
        this.listw = listw;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHodel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_layoutword,parent,false);
        return new ViewHodel(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHodel holder, int position) {
        item_w itemDs = listw.get(position);
        holder.textView.setText(itemDs.getNamew());
        holder.textView2.setText(itemDs.getDatew());
        holder.textView3.setText(itemDs.getTimew());
        holder.textView4.setText(itemDs.getDulieuw());

        holder.deleteedit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDilog(Gravity.CENTER);
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
    }
    private void openDilog(int gravity){
        LinearLayout edit,delete,share;
        final Dialog dialog = new Dialog((Activity) mContext);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.show_chucnang);
        edit = dialog.findViewById(R.id.edit);
        delete = dialog.findViewById(R.id.delete);
        share = dialog.findViewById(R.id.share);

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
        return listw.size();
    }

    public class ViewHodel extends RecyclerView.ViewHolder{
        private TextView textView,textView2,textView3,textView4;
        private ImageView like1,deleteedit1;

        public ViewHodel(@NonNull View itemView) {
            super(itemView);
            like1 = (ImageView) itemView.findViewById(R.id.like);
            deleteedit1 = (ImageView) itemView.findViewById(R.id.deleteedit);
            textView = (TextView) itemView.findViewById(R.id.text1);
            textView2 = (TextView) itemView.findViewById(R.id.text2);
            textView3 = (TextView) itemView.findViewById(R.id.text3);
            textView4 = (TextView) itemView.findViewById(R.id.text4);
        }
    }
}
