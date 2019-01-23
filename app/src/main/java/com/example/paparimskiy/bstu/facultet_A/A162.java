package com.example.paparimskiy.bstu.facultet_A;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class A162 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        Context context = getActivity().getApplicationContext();
        RelativeLayout layout = new RelativeLayout(context);
        TextView text = new TextView(context);
        text.setText("Это область фрагмента");
        layout.addView(text);


        return layout;
    }
}
