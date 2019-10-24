package com.example.lab1mivos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    private Button btnConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnConvert = (Button) findViewById(R.id.btnConvert);

        btnConvert.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (btnConvert.equals(v))
        {
            int dec = -1;
            String bin = "";
            String decStr;
            EditText decText;

            decText = (EditText) findViewById(R.id.decText);
            decStr = decText.getText().toString();
            if(decStr.length()>0 && decStr.length()<9)
            {
                dec = Integer.parseInt(decStr);
            }
            if(dec>=0)
            {
                bin = "";
            }
            while(dec != 0)
            {
                if(dec % 2 == 0) {
                    bin = "0" + bin;
                }
                else {
                    bin = "1" + bin;
                }
                dec = dec/2;
            }
            EditText binText = (EditText) findViewById(R.id.binText);
            binText.setText(bin);
        }
    }
}
