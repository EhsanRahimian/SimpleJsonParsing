package com.nicootech.jasonparsingfromurl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button click;
    static TextView data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         click = findViewById(R.id.button);
         data = findViewById(R.id.fetch_data);
         click.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 FetchData process = new FetchData();
                 process.execute();

             }
         });
    }
}
