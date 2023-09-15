package com.speakingclock.speakingclock.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.speakingclock.speakingclock.service.TimeConversionService;

public class TimeConversionServiceTest {

    @Autowired
    private TimeConversionService timeConversionService;


    @Test
    public void testConvertTimeToWords_ValidTime() {
    	timeConversionService = new TimeConversionService();
        String time = "08:34";
        String expected = "It's eight thirty-four";
        String result = timeConversionService.convertTimeToWords(time);
        assertEquals(expected, result);
    }

    @Test
    public void testConvertTimeToWords_Midday() {
    	timeConversionService = new TimeConversionService();
        String time = "12:00";
        String expected = "It's Midday";
        String result = timeConversionService.convertTimeToWords(time);
        assertEquals(expected, result);
    }

    @Test
    public void testConvertTimeToWords_Midnight() {
    	timeConversionService = new TimeConversionService();
        String time = "00:00";
        String expected = "It's Midnight";
        String result = timeConversionService.convertTimeToWords(time);
        assertEquals(expected, result);
    }

    @Test
    public void testConvertTimeToWords_InvalidTime1() {
    	timeConversionService = new TimeConversionService();
        String time = "25:60"; 
        String expected = "Invalid input time";
        String result = timeConversionService.convertTimeToWords(time);
        assertEquals(expected, result);
    }
    
    @Test
    public void testConvertTimeToWords_InvalidTime2() {
    	timeConversionService = new TimeConversionService();
        String time = "22:30:11"; 
        String expected = "Invalid time format pls use ':' in the input time";
        String result = timeConversionService.convertTimeToWords(time);
        assertEquals(expected, result);
    }
}
