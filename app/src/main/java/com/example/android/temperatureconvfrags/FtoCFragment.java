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
public class FtoCFragment extends Fragment{

    private EditText input_editText, output_editText;

    private Button convert_button;

    private double c, f;

    public FtoCFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_ftoc, container, false);

        input_editText = (EditText) rootView.findViewById(R.id.input_editText);
        output_editText = (EditText) rootView.findViewById(R.id.output_editText);
        convert_button = (Button) rootView.findViewById(R.id.convert_button);

        convert_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    // Capture the input fahrenheit from the EditText and store it into var. f

                    f = Double.parseDouble(input_editText.getText().toString());

                    // Calculate the celsius

                    c = ((f - 32) *  5) / 9;

                    // Output the celsius

                    DecimalFormat df = new DecimalFormat("#.#");

                    output_editText.setText(df.format(c));

                }
            }
        );

        return rootView;
    }
}
