package com.study.twitter.activities.registerFragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.study.twitter.R;
import com.study.twitter.activities.activities.WebViewActivityHelp;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondStepFragment extends Fragment {
    private TextView tvHelp;
    private Button btnNext2;


    public SecondStepFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second_step, container, false);
        tvHelp = view.findViewById(R.id.tvHelp);
        btnNext2 = view.findViewById(R.id.btnNext2);
        tvHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), WebViewActivityHelp.class);
                startActivity(intent);
            }
        });
        btnNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.midPanel, new ThirdStepFragment());
                fragmentTransaction.commit();
            }
        });
        return view;
    }

}
