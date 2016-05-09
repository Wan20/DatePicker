package com.example.wansu.datepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    DatePicker datePicker;
    TextView displayDate;
    Button changeDate;
    int month;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datePicker = (DatePicker) findViewById(R.id.datePicker);
        displayDate = (TextView) findViewById(R.id.display_date);
        changeDate = (Button) findViewById(R.id.change_date_button);

        displayDate.setText(currentDate());

        changeDate.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                displayDate.setText(currentDate());
            }
        });
    }

    public String currentDate() {
        StringBuilder mcurrentDate = new StringBuilder();
        month = datePicker.getMonth() + 1;
        mcurrentDate.append("Date: " + month + "/" + datePicker.getDayOfMonth() + "/" + datePicker.getYear());
        return mcurrentDate.toString();
    }
}

