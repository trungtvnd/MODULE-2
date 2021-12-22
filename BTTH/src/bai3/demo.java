package bai3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class demo {
    public static void main(String[] args) {
        String date = "22/12/2021";
        LocalDate convertedDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        convertedDate = convertedDate.withDayOfMonth(
                convertedDate.getMonth().length(convertedDate.isLeapYear()));
        System.out.println(convertedDate);

        Date date1 = new Date();
        DateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String todayDate = dateFormat.format(date1);
        System.out.println(todayDate);
        String dayCheck = "31/01/2022";
        System.out.println(dayCheck.equals(todayDate));;
    }
}
