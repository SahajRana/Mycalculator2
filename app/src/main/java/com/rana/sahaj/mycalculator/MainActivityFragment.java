package com.rana.sahaj.mycalculator;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    public int p=0,q=0,l=0,x;
    public int q1=0,q2=0, i=0,ui=0;
    public int arrayTotalDigit[]= new int[20];
    public int ans=0,Ve=0, f,counSUB=0;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_main, container, false);
        Button OneB=(Button)v.findViewById(R.id.B1);           // 1 Button inflate
        Button TwoB=(Button)v.findViewById(R.id.B2);
        Button ThreeB=(Button)v.findViewById(R.id.B3);
        Button AddB=(Button)v.findViewById(R.id.B_Add);
        Button SubB=(Button)v.findViewById(R.id.B_Sub);
        Button Enter=(Button)v.findViewById(R.id.B_Enter);
        //final TextView input=(TextView)v.findViewById(R.id.TFinput);
        final TextView output=(TextView)v.findViewById(R.id.TFoutput);
        //final TextView i1=(TextView)v.findViewById(R.id.TF1);
       // final TextView i2=(TextView)v.findViewById(R.id.TF2);
       // final TextView i3=(TextView)v.findViewById(R.id.TF3);
        final TextView i4=(TextView)v.findViewById(R.id.TF4);
      //  final TextView i5=(TextView)v.findViewById(R.id.TF5);
       // final TextView i6=(TextView)v.findViewById(R.id.TF6);



        OneB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=1;
                l=(p*10)+x;
                q=l;
                p=l;
                l=0;
                if(counSUB!=0)
                {
                    q=q-(2*q);
                }
                output.setText(q+"");

            }
        });

        TwoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=2;
                l=(p*10)+x;
                q=l;
                p=l;
                l=0;
                if(counSUB!=0)
                {
                    q=q-(2*q);
                }
                output.setText(q + "");
            }
        });
        ThreeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=3;
                l=(p*10)+x;
                q=l;
                p=l;
                l=0;
                if(counSUB!=0)
                {
                    q=q-(2*q);
                }
                output.setText(q + "");                                                                             //q=contains the total digit ... eg 1321 or 1212
            }
        });                                                                                           //"after clicking plus" q=1321  --- q=0 & q1=1321
                                                                                     // array mae jakar sari digits store ho jayegi
        AddB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q1=q;
                arrayTotalDigit[ui]=q1;
               // i5.setText(arrayTotalDigit[ui]+"");
                ui++;
                q=0;
                p=0;
               // counADD++;
              //  i2.setText(q+"");
              //  i6.setText(ui+"");
            }
        });
        q=0;
        SubB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q2=q;
                p=0;
               counSUB++;
                arrayTotalDigit[ui]=q2;
                ui++;
                q=0;

                //i3.setText(q+"");
            }
        });
        q=0;
        Enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(f=0;f<ui;f++){
                    Ve=arrayTotalDigit[f];
                    ans=ans+Ve;
                }
                ui=0;
                p=0;
                ans=ans+q;
                q1=0;
                q2=0;
                i4.setText(ans+"");
                ans=0;
                q=0;
                counSUB=0;
            }
        });

        return v ;

    }
}
