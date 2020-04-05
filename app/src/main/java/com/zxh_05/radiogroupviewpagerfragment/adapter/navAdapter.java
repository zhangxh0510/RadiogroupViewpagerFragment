package com.zxh_05.radiogroupviewpagerfragment.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.lang.ref.WeakReference;
import java.util.List;

public class navAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragmentList;

    public navAdapter(FragmentManager fragmentManager, List<Fragment> list) {
        super(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        fragmentList = new WeakReference<>(list).get();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
