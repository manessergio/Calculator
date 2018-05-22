package com.example.sergiomanes.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sergiomanes.calculator.MVP.Model.Model;
import com.example.sergiomanes.calculator.MVP.Presenter.Presenter;
import com.example.sergiomanes.calculator.MVP.Utils.BusProvider;
import com.example.sergiomanes.calculator.MVP.View.View;

public class MainActivity extends AppCompatActivity {

    private Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new Presenter(new Model(),new View(this, BusProvider.getInstance()));
    }

    @Override
    protected void onResume() {
        super.onResume();
        BusProvider.register(presenter);
    }

    @Override
    protected void onPause() {
        super.onPause();
        BusProvider.unregister(presenter);
    }
}
