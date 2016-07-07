package com.example.admin.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    public  void onclick (View view)
    {
        EditText edttxt = (EditText) findViewById(R.id.currency);
        String value = edttxt.getText().toString();
        int finalValue= Integer.parseInt(value);
        Toast.makeText(MainActivity.this,"Currency= "+ finalValue * 65+ "Rs" +
                " Is it ok for you ",Toast.LENGTH_LONG).show();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }




}
