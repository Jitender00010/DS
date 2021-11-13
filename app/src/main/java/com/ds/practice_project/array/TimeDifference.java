package com.ds.practice_project.array;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeDifference {

    public static void getTimeStemp(String timeStr){
        try{
             SimpleDateFormat sdf = new SimpleDateFormat("HH.MM.a");

            Date date = new Date();
            System.out.println(date.getTime());

            //return number of milliseconds since January 1, 1970, 00:00:00 GMT
           // System.out.println(timestamp.getTime());

            //format timestamp
           // System.out.println(sdf.format(timestamp));
        }catch (Exception e){

        }
    }
}
