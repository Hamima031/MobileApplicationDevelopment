package com.example.beerselector;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private Button button;
    private TextView textView;

    private BeerExpert beerExpert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner_id);
        button = findViewById(R.id.button_id);
        textView = findViewById(R.id.text_id);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String beerType = String.valueOf(spinner.getSelectedItem());
                textView.setText(beerType);

                List<String> brandList = beerExpert.getBrands(beerType);

                StringBuilder brandsFormatted = new StringBuilder();

                for(String brand : brandList)
                {
                    brandsFormatted.append(brand).append('\n');
                }

                textView.setText(brandsFormatted);
            }
        });
    }
}
