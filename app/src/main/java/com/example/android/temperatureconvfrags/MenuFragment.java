package com.example.android.temperatureconvfrags;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by hernandez on 10/1/2016.
 */
public class MenuFragment extends Fragment{

    public MenuFragment(){

    }

    private Button ftoc_button, ctof_button, chart_button;

    Fragment frag;
    FragmentTransaction fragTransaction;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.menu_buttons, container, false);

        ftoc_button = (Button) rootView.findViewById(R.id.ftoc_button);
        ctof_button = (Button) rootView.findViewById(R.id.ctof_button);
        chart_button = (Button) rootView.findViewById(R.id.chart_button);

        frag = new TempChartFragment();
        fragTransaction = getFragmentManager().beginTransaction().add(R.id.container, frag);
        fragTransaction.commit();

        ftoc_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                frag = new FtoCFragment();
                fragTransaction = getFragmentManager().beginTransaction().replace(R.id.container, frag);
                fragTransaction.commit();
            }
        });

        ctof_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                frag = new CtoFFragment();
                fragTransaction = getFragmentManager().beginTransaction().replace(R.id.container, frag);
                fragTransaction.commit();
            }
        });

        chart_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                frag = new TempChartFragment();
                fragTransaction = getFragmentManager().beginTransaction().replace(R.id.container, frag);
                fragTransaction.commit();
            }
        });

        return rootView;
    }
}
