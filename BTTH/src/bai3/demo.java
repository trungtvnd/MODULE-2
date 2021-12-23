package bai3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class demo {
    public static void main(String[] args) {

        Date date1 = new Date();
        DateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String todayDate = dateFormat.format(date1);
        System.out.println(todayDate);
        String dayCheck = "31/12/2021";
        System.out.println(dayCheck.equals(todayDate));


        LocalDate convertedDate = LocalDate.parse(todayDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        convertedDate = convertedDate.withDayOfMonth(
                convertedDate.getMonth().length(convertedDate.isLeapYear()));
        System.out.println(convertedDate);

    }
}
