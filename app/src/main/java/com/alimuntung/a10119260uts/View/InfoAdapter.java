package com.alimuntung.a10119260uts.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.alimuntung.a10119260uts.Presenter.info.SlideInfoFragment;

public class InfoAdapter extends FragmentStateAdapter {

    private final Fragment[] mFragments = new Fragment[] {

            new SlideInfoFragment(),
         //   new SecondPagerFrag(),
    };
    public final String[] mFragmentNames = new String[] {
            "Info 1",
            "SecondTab"
    };

    public InfoAdapter(FragmentActivity fa){
        super(fa);
    }

    @Override
    public int getItemCount() {
        return mFragments.length;
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return mFragments[position];
    }
}