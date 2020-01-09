package com.study.twitter.activities.registerFragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.study.twitter.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FourthStepFragment extends Fragment {


    public FourthStepFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fourth_step, container, false);
        return view;
    }

}
