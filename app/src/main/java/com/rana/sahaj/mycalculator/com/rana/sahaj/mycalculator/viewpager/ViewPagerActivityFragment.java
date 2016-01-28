package com.rana.sahaj.mycalculator.com.rana.sahaj.mycalculator.viewpager;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rana.sahaj.mycalculator.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class ViewPagerActivityFragment extends Fragment {

    public ViewPagerActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_view_pager, container, false);


        return v;
    }
}
