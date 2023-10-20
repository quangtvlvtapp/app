package com.example.myapplication.View;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.myapplication.R;

public class pdffActivity extends AppCompatActivity {
    ImageView out;
    LinearLayout linearLayout;
    ImageView imageView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdff);
//        ImageView img = findViewById(R.id.docexcel);
//        out = findViewById(R.id.outtrangpdf);

        imageView = findViewById(R.id.outtrangpdff);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//               startActivity(new Intent(pdfActivity.this, MainActivity.class));
//              Toast.makeText(pdfActivity.this, "Thành cong", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}