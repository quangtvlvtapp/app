package com.example.myapplication.Tabbar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;


public class PDFFragment extends Fragment {


    // TODO: Rename and change types of parameters


    public PDFFragment() {
        // Required empty public constructor
    }


    public static PDFFragment newInstance() {
        PDFFragment fragment = new PDFFragment();
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
        return inflater.inflate(R.layout.fragment_p_d_f, container, false);
    }
}