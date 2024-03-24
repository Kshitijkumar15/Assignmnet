package com.example.assignmnet;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class INDIVIDUALFragment extends Fragment {

    public INDIVIDUALFragment() {
        // Required empty public constructor
    }

    public static INDIVIDUALFragment newInstance(String param1, String param2) {
        INDIVIDUALFragment fragment = new INDIVIDUALFragment();
        Bundle args = new Bundle();

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
        return inflater.inflate(R.layout.fragment_i_n_d_i_v_i_d_u_a_l, container, false);
    }
}