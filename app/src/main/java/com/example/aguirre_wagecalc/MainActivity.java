package com.example.aguirre_wagecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ed1, ed2, ed3, ed4;
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.username);
        ed2 = findViewById(R.id.wrk_hrs);
        ed3 = findViewById(R.id.hr_rate);
        ed4 = findViewById(R.id.total);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                total();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                clear();

            }
        });

    }
    public void total()
    {

        double wrkhrs = Double.parseDouble(ed2.getText().toString());
        double rate = Double.parseDouble(ed3.getText().toString());
        double total;

        total = wrkhrs * rate;
        
        ed4.setText(String.valueOf(total));
    }

    public void clear()
    {
        ed1.setText("");
        ed2.setText("");
        ed3.setText("");
        ed4.setText("");
        ed1.requestFocus();

    }
}