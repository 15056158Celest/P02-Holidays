package sg.edu.rp.c346.p02_holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 15056158 on 25/4/2017.
 */

public class HolidayAdapter extends ArrayAdapter<Holiday> {
    private Context context;
    private ArrayList<Holiday> holidays;
    private TextView tvHolidayCode;
    private TextView tvDateCode;
    private ImageView ivHoliday;



    public HolidayAdapter(Context context, int resource, ArrayList<Holiday> objects) {
        super(context, resource, objects);

        holidays = objects;

        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.holiday, parent, false);

        tvHolidayCode = (TextView) rowView.findViewById(R.id.textView2);

        tvDateCode = (TextView) rowView.findViewById(R.id.textView3);

        ivHoliday = (ImageView) rowView.findViewById(R.id.imageView2);



        Holiday currentHoliday = holidays.get(position);

        tvHolidayCode.setText(currentHoliday.getCode());

        tvDateCode.setText(currentHoliday.getDate());


        if(currentHoliday.getHoly().equals("newyear")) {
            ivHoliday.setImageResource(R.drawable.newyear);
        }
        else if(currentHoliday.getHoly().equals("labourday")) {
            ivHoliday.setImageResource(R.drawable.labourday);

        }  else if(currentHoliday.getHoly().equals("cny")) {
            ivHoliday.setImageResource(R.drawable.cny);

        }  else if(currentHoliday.getHoly().equals("goodFriday")) {
            ivHoliday.setImageResource(R.drawable.goodfriday);

        }


        return rowView;
    }
}
