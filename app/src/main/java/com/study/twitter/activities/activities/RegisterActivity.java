package com.study.twitter.activities.activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.loader.content.CursorLoader;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.study.twitter.R;
import com.study.twitter.activities.adapter.ViewPagerRegisterAdapter;
import com.study.twitter.activities.registerFragments.FirstStepFragment;
import com.study.twitter.activities.registerFragments.SecondStepFragment;

public class RegisterActivity extends AppCompatActivity {
    private ImageView imgBtnBack;
    private Button btnNext;
    private ViewPager viewPagerRegister;
    private String status = "firstStep";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Binding();
        ButtonListener();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.midPanel, new FirstStepFragment());
        fragmentTransaction.commit();
//        ViewPagerRegisterAdapter viewPagerRegisterAdapter = new ViewPagerRegisterAdapter(getSupportFragmentManager());
//        viewPagerRegisterAdapter.addFragment(new FirstStepFragment(), "First Step");
//        viewPagerRegisterAdapter.addFragment(new SecondStepFragment(), "Second Step");
//        viewPagerRegister.setAdapter(viewPagerRegisterAdapter);
    }

    private void ButtonListener() {
        imgBtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void Binding() {
        imgBtnBack = findViewById(R.id.imgBtnBack);
        btnNext = findViewById(R.id.btnNext);
        viewPagerRegister = findViewById(R.id.viewPagerRegister);
    }
}
