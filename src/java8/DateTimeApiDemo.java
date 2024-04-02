package java8;

import java.time.*;

public class DateTimeApiDemo {
    public static void main(String[] args) {
        // LocalDate
        LocalDate today = LocalDate.now();
        LocalDate customDate = LocalDate.of(1998, 3, 3);
        int dayOfMonth = customDate.getDayOfMonth();
        Month month = customDate.getMonth();
        int monthValue = customDate.getMonthValue();
        int year = customDate.getYear();
        //System.out.println(customDate.getDayOfWeek());

        LocalDate yesterday = today.minusDays(1);
        /*if(today.isAfter(yesterday))
            System.out.println("Correct");*/


        // LocalTime
        LocalTime now = LocalTime.now();
        //System.out.println(now.getHour());

        LocalTime customTime = LocalTime.of(16, 20, 0);
        String time = "16:20:00";
        LocalTime parsedTime = LocalTime.parse(time);
        //System.out.println(parsedTime);

        LocalTime beforeOneHour = now.minusHours(1);
        /*if(now.isAfter(beforeOneHour))
            System.out.println("Correct");*/


        // LocalDateTime
        LocalDateTime rightNow = LocalDateTime.now();
        LocalDateTime myDate = LocalDateTime.parse("2023-03-03T16:20");
        System.out.println(myDate );
    }
}
