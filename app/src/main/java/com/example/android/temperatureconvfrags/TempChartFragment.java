package com.example.android.temperatureconvfrags;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by hernandez on 10/1/2016.
 */
public class TempChartFragment extends Fragment{

    public TempChartFragment(){

    }

    ImageView mImageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {



        View rootView = inflater.inflate(R.layout.fragment_chart, container, false);

        mImageView = (ImageView) rootView.findViewById(R.id.imageView);
        mImageView.setImageResource(R.drawable.conv_table);
        return rootView;
    }
}
