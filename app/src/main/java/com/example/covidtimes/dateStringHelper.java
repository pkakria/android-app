package com.example.covidtimes;

import java.text.SimpleDateFormat;
import java.text.ParseException;

public class dateStringHelper {
    private static String default_time = "T00:00:00:Z";

    private static String addDashes(String year, String month, String day){
        return year + "-" + month + "-" + day;
    }

    public static String getQueryableDate(String year, String month, String day){
        return addDashes(year,month,day) + default_time;
    }
    public static boolean isValidDate(String year, String month, String day){
        String date = addDashes(year,month,day);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false);
        try{
            sdf.parse(date);
        } catch (ParseException e){
            return false;
        }
        return true;
    }
}
