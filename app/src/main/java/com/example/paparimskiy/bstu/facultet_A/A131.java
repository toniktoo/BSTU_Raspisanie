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


public class A131 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        Context context = getActivity().getApplicationContext();
        RelativeLayout layout = new RelativeLayout(context);
        TextView text = new TextView(context);
        text.setText("Понедельник\t\t\t\t\t\t\n" +
                "09:00-10:30\t\tматан\t\t\t\tбрацлавский\n" +
                "10:50-12:20\t\tфизика\t\t\t\tледнев\n" +
                "12:40-14:10\t\tтеплоперед-ча\t\t\t\tбабук\n" +
                "14:55-16:25\t\tхимия\t\t\t\tрыбакина\n");
        layout.addView(text);


        return layout;
    }
}
