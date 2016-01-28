package com.rana.sahaj.mycalculator;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 *
 */
public class MenuButtonFragment extends Fragment {

    Fragment Frag;
    FragmentTransaction FragT;

    public MenuButtonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_menu_button, container, false);


      FragmentManager fm=getFragmentManager();
        android.support.v4.app.Fragment fragment=fm.findFragmentById(R.id.fragment_calc);
        if(fragment==null){
            fragment = new MainActivityFragment();
            fm.beginTransaction()
                    .add(R.id.fragment_calc,fragment)
                    .commit();
        }


        Button calculator=(Button)v.findViewById(R.id.BCalc);
        Button picture=(Button)v.findViewById(R.id.BPic);

        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getFragmentManager();
                android.support.v4.app.Fragment fragment=fm.findFragmentById(R.id.fragment_calc);
                fragment = new MainActivityFragment();
                fm.beginTransaction()
                        .replace(R.id.fragment_calc, fragment)
                        .commit();

            }
        });

        picture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getFragmentManager();
                android.support.v4.app.Fragment fragment=fm.findFragmentById(R.id.fragment_calc);
                fragment = new BlankFragment();
                fm.beginTransaction()
                        .replace(R.id.fragment_calc,fragment)
                        .commit();

            }
        });


        return v;
    }


}
