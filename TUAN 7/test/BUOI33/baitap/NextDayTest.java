package BUOI33.baitap;

import BUOI33.thuchanh.AbsoluteNumberCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayTest {

    @Test
    @DisplayName("Test case 0")
    void findNextDay() {
        int day = 15;
        int month = 2;
        int year = 2000;

        String expect = "16/2/2000";
        assertEquals(expect, NextDay.ngayTiepTheo(day, month, year));
    }
    @Test
    @DisplayName("Test case 1")
    void findNextDay1() {
        int day = 31;
        int month = 1;
        int year = 2000;

        String expect = "1/2/2000";
        assertEquals(expect, NextDay.ngayTiepTheo(day, month, year));
    }
    @Test
    @DisplayName("Test case 2")
    void findNextDay2() {
        int day = 29;
        int month = 2;
        int year = 2000;

        String expect = "1/3/2000";
        assertEquals(expect, NextDay.ngayTiepTheo(day, month, year));
    }
    @Test
    @DisplayName("Test case 3")
    void findNextDay3() {
        int day = 31;
        int month = 12;
        int year = 2000;

        String expect = "1/1/2001";
        assertEquals(expect, NextDay.ngayTiepTheo(day, month, year));
    }
    @Test
    @DisplayName("Test case 4")
    void findNextDay4() {
        int day = 30;
        int month = 4;
        int year = 2000;

        String expect = "1/5/2000";
        assertEquals(expect, NextDay.ngayTiepTheo(day, month, year));
    }
    @Test
    @DisplayName("Test case 5")
    void findNextDay5() {
        int day = 29;
        int month = 2;
        int year = 2011;

        String expect = "-1";
        assertEquals(expect, NextDay.ngayTiepTheo(day, month, year));
    }
}