package com.rana.sahaj.mycalculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.support.v4.app.FragmentManager fm=getSupportFragmentManager();
        android.support.v4.app.Fragment fragment=fm.findFragmentById(R.id.fragment_menu);
        if(fragment==null){
            fragment = new MenuButtonFragment();
            fm.beginTransaction()
                    .add(R.id.fragment_menu,fragment)
                    .commit();
        }
    }


}
