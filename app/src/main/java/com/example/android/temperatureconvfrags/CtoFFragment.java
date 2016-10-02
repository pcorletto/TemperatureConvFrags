package com.example.android.temperatureconvfrags;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

/**
 * Created by hernandez on 10/1/2016.
 */
public class CtoFFragment extends Fragment{

    private EditText input_editText, output_editText;

    private Button convert_button;

    private double c, f;

    public CtoFFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_ctof, container, false);

        input_editText = (EditText) rootView.findViewById(R.id.input_editText);
        output_editText = (EditText) rootView.findViewById(R.id.output_editText);
        convert_button = (Button) rootView.findViewById(R.id.convert_button);

        convert_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Capture the input celsius from the EditText and store it into var. c

                c = Double.parseDouble(input_editText.getText().toString());

                // Calculate the fahrenheit

                f = ((9 * c) /  5) + 32;

                // Output the fahrenheit

                DecimalFormat df = new DecimalFormat("#.#");

                output_editText.setText(df.format(f));

                }
            }
        );


        return rootView;
    }
}
