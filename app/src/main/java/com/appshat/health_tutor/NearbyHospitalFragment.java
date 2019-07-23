package com.appshat.health_tutor;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;


import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class NearbyHospitalFragment extends Fragment {

    public NearbyHospitalFragment(){
        //required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_nearby_hospital,container,false);
        return v;
    }


}
