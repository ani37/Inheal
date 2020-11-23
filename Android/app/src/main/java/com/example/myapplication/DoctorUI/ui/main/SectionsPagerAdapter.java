package com.example.myapplication.DoctorUI.ui.main;

import android.content.Context;

import com.example.myapplication.DoctorUI.DoctorAcceptedFragment;
import com.example.myapplication.DoctorUI.DoctorDeclinedFragment;
import com.example.myapplication.DoctorUI.DoctorOnHoldFragment;
import com.example.myapplication.R;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_3, R.string.tab_text_4,R.string.tab_text_5};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        switch(position)
        {
            case 0 :
                return new DoctorOnHoldFragment();
            case 1 :
                return new DoctorAcceptedFragment();
            case 2 :
                return new DoctorDeclinedFragment();
            default:
                return null;

        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        return 3;
    }
}