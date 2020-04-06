package com.mkyong.date;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class dateCalculator {

    public static void main(String[] args) {

        String date1 = "2016-08-16";
        String date2 = "2015-08-17";
        String birth="1998-07-26";
        System.out.println("Between " + date1 + " and " + date2 + " - " +betweenDate(date1, date2) + " days");
        int howDay=68;
        daysAdd(howDay);
        System.out.println("Since I was born, it has been "+leapYear(birth)+" leap years.");
        String startTime="11:45";
        String endTime="22:30";
        System.out.println("how many times the sum of the digits is equal to 15: " +time(startTime, endTime));
    }
    public static long time(String startTime, String endTime)
    {
        int how_sum_15=0;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmm");
        Integer decode = 0;
        int endTime_int;
        LocalTime time1 = LocalTime.parse(startTime);
        LocalTime time2 = LocalTime.parse(endTime);
        String endTime_string = time2.format(formatter);
        endTime_int = Integer.decode(endTime_string);
        LocalTime returnvalue = time1.plusMinutes(1);
        while(decode<=endTime_int) {
            returnvalue = returnvalue.plusMinutes(1);
            String formatDateTime = returnvalue.format(formatter);
            decode = Integer.decode(formatDateTime);
            int sum = 0;
            while (decode != 0) {
                sum += decode % 10;
                decode /= 10;
            }
            if (sum == 15)
                how_sum_15++;
            decode = Integer.decode(formatDateTime);
        }

        return how_sum_15;
    }
    public static long leapYear(String birth)
    {

        LocalDate localDate2 = LocalDate.now();
        int how=0;
        LocalDate localDate1 = LocalDate.parse(birth);
        long days = ChronoUnit.DAYS.between(localDate1, localDate2);
        for(int i=0; i<days;i++)
        {
            localDate1 = localDate1.plusDays(1);
            int dayOfMonth = localDate1.getDayOfMonth();
            int monthofYear = localDate1.getMonthValue();
            if(dayOfMonth==29 && monthofYear==2)
                how++;
        }
        return how;
    }

    public static long daysAdd(int howDay)
    {
        LocalDate localDate = LocalDate.parse("2016-01-01");
        LocalDate returnvalue = localDate.plusDays(howDay);
        System.out.println(""+howDay+"st day of the 2016: "+returnvalue);
        return 1;
    }

    public static long betweenDate(String date1, String date2)
    {
        LocalDate localDate1 = LocalDate.parse(date1);
        LocalDate localDate2 = LocalDate.parse(date2);
        long days = ChronoUnit.DAYS.between(localDate1, localDate2);

        if(days<0)
            days=days*(-1);
        return days;
    }
}