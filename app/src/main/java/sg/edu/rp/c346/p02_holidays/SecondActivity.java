package sg.edu.rp.c346.p02_holidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvHolidays;
    ArrayAdapter aa;
    ArrayList<Holiday> holidays;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lvHolidays);
        tvHolidays = (TextView) findViewById(R.id.tvHoliday);

        Intent i = getIntent();
        String year = i.getStringExtra("holiday");
        tvHolidays.setText(year);

        holidays = new ArrayList<Holiday>();
        if(year.equalsIgnoreCase("Secular")) {
            holidays.add(new Holiday("New Year's Day", "1 Jan 2017", "newyear"));
            holidays.add(new Holiday("Labour Day", "1 May 2017", "labourday"));


        }else if(year.equalsIgnoreCase("Ethnic & Religion")){
            holidays.add(new Holiday("Chinese New Year", "28-29 Jan 2017", "cny"));
            holidays.add(new Holiday("Good Friday", "14 April 2017", "goodFriday"));
        }




        aa = new HolidayAdapter(this, R.layout.holiday, holidays);
        lv.setAdapter(aa);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Holiday selectedName = holidays.get(position);
                Holiday selectedDate = holidays.get(position);

                Toast.makeText(SecondActivity.this, selectedName.getCode()
                              + " date: " + selectedDate.getDate(),
                        Toast.LENGTH_LONG).show();
            }
        });



    }



}
