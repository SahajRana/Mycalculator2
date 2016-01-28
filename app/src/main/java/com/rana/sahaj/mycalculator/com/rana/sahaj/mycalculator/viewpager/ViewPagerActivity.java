package com.rana.sahaj.mycalculator.com.rana.sahaj.mycalculator.viewpager;//                                 Class created by me..!!

import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import com.rana.sahaj.mycalculator.R;

public class ViewPagerActivity extends ActionBarActivity {
    ViewPager pager;
    ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        pager= (ViewPager)findViewById(R.id.pager);
        adapter= new ViewPagerAdapter(getSupportFragmentManager());

        pager.setAdapter(adapter);
    }



}
