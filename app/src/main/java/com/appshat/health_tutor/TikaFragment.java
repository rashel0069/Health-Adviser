package com.appshat.health_tutor;

import android.content.Intent;
import android.os.Bundle;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class TikaFragment extends Fragment {
    private Button buttonSisu,buttonWomen;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tika,container,false);
        buttonSisu = (Button)v.findViewById(R.id.button1);
        buttonWomen = (Button)v.findViewById(R.id.button2);

        //onclick listener
        buttonSisu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = "babytika";
                Intent intent = new Intent(getContext(),GridView_Activity.class);
                intent.putExtra("name",s1);
                startActivity(intent);
            }
        });

        buttonWomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s2 = "womentika";
                Intent intent = new Intent(getContext(),GridView_Activity.class);
                intent.putExtra("name",s2);
                startActivity(intent);
            }
        });
        return v;
    }
}
