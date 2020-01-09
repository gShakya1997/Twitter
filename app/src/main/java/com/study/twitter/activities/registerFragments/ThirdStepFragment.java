package com.study.twitter.activities.registerFragments;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.study.twitter.R;
import com.study.twitter.activities.activities.WebViewActivityCookie;
import com.study.twitter.activities.activities.WebViewActivityHelp;
import com.study.twitter.activities.activities.WebViewActivityPO;
import com.study.twitter.activities.activities.WebViewActivityPP;
import com.study.twitter.activities.activities.WebViewActivityTerms;

/**
 * A simple {@link Fragment} subclass.
 */
public class ThirdStepFragment extends Fragment {

    private TextView textView3;
    private Button btnSignUp;


    public ThirdStepFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_third_step, container, false);
        textView3 = view.findViewById(R.id.textView3);
        btnSignUp = view.findViewById(R.id.btnSignUp);
        String text = "By signing up, you agree to the Terms of service and Privacy Policy, including Cookie Use. Others will be able to find you by email or phone number when provided Privacy Options";
        SpannableString ss = new SpannableString(text);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.midPanel, new FourthStepFragment());
                fragmentTransaction.commit();
            }
        });
        ClickableSpan clickableSpanTerms = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent intent = new Intent(getActivity(), WebViewActivityTerms.class);
                startActivity(intent);
            }

            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.BLUE);
                ds.setUnderlineText(false);
            }
        };

        ClickableSpan clickableSpanPP = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent intent = new Intent(getActivity(), WebViewActivityPP.class);
                startActivity(intent);
            }

            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.BLUE);
                ds.setUnderlineText(false);
            }
        };

        ClickableSpan clickableSpanCookie = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent intent = new Intent(getActivity(), WebViewActivityCookie.class);
                startActivity(intent);
            }

            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.BLUE);
                ds.setUnderlineText(false);
            }
        };

        ClickableSpan clickableSpanPO = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent intent = new Intent(getActivity(), WebViewActivityPO.class);
                startActivity(intent);

            }

            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.BLUE);
                ds.setUnderlineText(false);
            }
        };


        ss.setSpan(clickableSpanTerms, 32, 48, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpanPP, 53, 67, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpanCookie, 79, 89, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpanPO, 162, 177, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView3.setText(ss);
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
        return view;
    }

}
