package com.example.paparimskiy.bstu.menu_fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.desai.vatsal.mydynamiccalendar.EventModel;
import com.desai.vatsal.mydynamiccalendar.GetEventListListener;
import com.desai.vatsal.mydynamiccalendar.MyDynamicCalendar;
import com.desai.vatsal.mydynamiccalendar.OnDateClickListener;
import com.example.paparimskiy.bstu.R;

import java.util.ArrayList;
import java.util.Date;

public class Calendar extends AppCompatActivity {

    private MyDynamicCalendar myCalendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_calendar);

        myCalendar = (MyDynamicCalendar) findViewById(R.id.myCalendar);

        myCalendar.showMonthViewWithBelowEvents();

        myCalendar.setOnDateClickListener(new OnDateClickListener() {
            @Override
            public void onClick(Date date) {
                Log.e("date", String.valueOf(date));
            }

            @Override
            public void onLongClick(Date date) {
                Log.e("date", String.valueOf(date));
            }
        });

        myCalendar.setCalendarBackgroundColor("#eeeeee");
        myCalendar.setHeaderBackgroundColor("#F00200");
        myCalendar.setHeaderTextColor("#ffffff");
        myCalendar.setNextPreviousIndicatorColor("#ffffff");
        myCalendar.setWeekDayLayoutBackgroundColor("#fcc70a");
        myCalendar.setWeekDayLayoutTextColor("#246245");

       myCalendar.isSaturdayOff(true, "#ffffff", "#ff0000");

        myCalendar.isSundayOff(true, "#ffffff", "#ff0000");

        myCalendar.setExtraDatesOfMonthBackgroundColor("#ffffff");
        myCalendar.setExtraDatesOfMonthTextColor("#756325");
        myCalendar.setDatesOfMonthBackgroundColor("#ffffff");
        myCalendar.setDatesOfMonthTextColor("#745632");

        myCalendar.setCurrentDateBackgroundColor("#eed8e6");// текущий день

        myCalendar.setCurrentDateTextColor("#000000");// текущий день

        myCalendar.setEventCellBackgroundColor("#d8eeee");// событие
        myCalendar.setEventCellTextColor("#646df0");

        myCalendar.addEvent("24-01-2019", "8:00", "8:15", "Today Event 1");

        myCalendar.getEventList(new GetEventListListener() {
            @Override
            public void eventList(ArrayList<EventModel> eventList) {

                for (int i = 0; i < eventList.size(); i++) {
                    Log.e("tag", "eventList.getStrName:-" + eventList.get(i).getStrName());
                }

            }
        });

//        myCalendar.updateEvent(0, "5-10-2016", "8:00", "8:15", "Today Event 111111");

//        myCalendar.deleteEvent(2);

//        myCalendar.deleteAllEvent();

        myCalendar.setBelowMonthEventTextColor("#425684");
//        myCalendar.setBelowMonthEventTextColor(R.color.black);

        myCalendar.setBelowMonthEventDividerColor("#635478");
//        myCalendar.setBelowMonthEventDividerColor(R.color.black);

        myCalendar.setHolidayCellBackgroundColor("#ffffff");
//        myCalendar.setHolidayCellBackgroundColor(R.color.black);

        myCalendar.setHolidayCellTextColor("#d590bb");
//        myCalendar.setHolidayCellTextColor(R.color.black);

        myCalendar.setHolidayCellClickable(false);
        myCalendar.addHoliday("2-11-2016");
    }

    private void showMonthViewWithBelowEvents() {

        myCalendar.showMonthViewWithBelowEvents();

        myCalendar.setOnDateClickListener(new OnDateClickListener() {
            @Override
            public void onClick(Date date) {
                Log.e("date", String.valueOf(date));
            }

            @Override
            public void onLongClick(Date date) {
                Log.e("date", String.valueOf(date));
            }
        });
    }

}
