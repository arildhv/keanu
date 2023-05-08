package com.arildhv;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datechecker {
    public boolean checkBirthday(String keanuDate) {
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);

        String currentDate = date.toString();

        if(keanuDate.equals(currentDate)) {
            return true;
        }
        else {
            return false;
        }
    }
}
