package com.i2i.shivambill;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // From CNC button onclick go to cnc bill activity
    public void goto_cnc_bill(View view) {
        startActivity(new Intent(getApplicationContext(), Cnc_Bill.class));
    }

    // From VMC button onclick go to vmc bill activity
    public void goto_vmc_bill(View view) {
    }
}
