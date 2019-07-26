package com.appshat.health_tutor;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


//AIzaSyCPZG1egPoXttCA67DziavzuF99wrKnRY0 --all access
//AIzaSyBLGc03DVHBYvzLnN7t6B2h_nKk3hXyHIA -- for this app only
public class NewBornbabyFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_new_born_baby,container,false);
    }
}
