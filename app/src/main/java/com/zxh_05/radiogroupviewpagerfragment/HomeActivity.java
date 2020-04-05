package com.zxh_05.radiogroupviewpagerfragment;

import android.os.Bundle;
import android.widget.RadioGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;

import com.zxh_05.radiogroupviewpagerfragment.adapter.navAdapter;
import com.zxh_05.radiogroupviewpagerfragment.fragment.FragmentA;
import com.zxh_05.radiogroupviewpagerfragment.fragment.FragmentB;
import com.zxh_05.radiogroupviewpagerfragment.fragment.FragmentC;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends FragmentActivity implements RadioGroup.OnCheckedChangeListener {
    RadioGroup radioGroup;
    ViewPager viewPager;
    List<Fragment> fragmentArrayList;
    final int navBtnAId = R.id.aRadioBotton;
    final int navBtnBId = R.id.bRadioBotton;
    final int navBtnCId = R.id.cRadioBotton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
    }

    private void initData() {
        fragmentArrayList = new ArrayList<>();
        fragmentArrayList.add(new FragmentA());
        fragmentArrayList.add(new FragmentB());
        fragmentArrayList.add(new FragmentC());
    }

    private void initView() {
        radioGroup = findViewById(R.id.navRadioGroup);
        viewPager = findViewById(R.id.homeViewPager);
        viewPager.setAdapter(new navAdapter(getSupportFragmentManager(), fragmentArrayList));
        radioGroup.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case navBtnAId:
                viewPager.setCurrentItem(0);
                break;
            case navBtnBId:
                viewPager.setCurrentItem(1);
                break;
            case navBtnCId:
                viewPager.setCurrentItem(2);
                break;

        }
    }
}
