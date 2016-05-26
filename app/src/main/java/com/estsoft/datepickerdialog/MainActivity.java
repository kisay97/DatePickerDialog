package com.estsoft.datepickerdialog;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dialogDatePicker(View view){
        Calendar cal = Calendar.getInstance();
        DatePickerDialog dialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.
                OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Log.d("------------------->", year + "-" + (monthOfYear+1) + "-" + dayOfMonth);
            }
        }, cal.get( Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DATE) );

        dialog.show();
    }
}
