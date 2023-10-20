
package com.example.myapplication.View;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.DTO.item_ds;
import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

import java.util.List;

public class pdfActivity extends AppCompatActivity {
    ImageView out;
    LinearLayout linearLayout;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);

        Bundle bundle = getIntent().getExtras();
        if(bundle == null){
           return;
        }
        item_ds itemDs = (item_ds) bundle.get("object_user");



    }
}