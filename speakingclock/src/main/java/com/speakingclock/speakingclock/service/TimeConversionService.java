package com.speakingclock.speakingclock.service;

import org.springframework.stereotype.Service;

@Service
public class TimeConversionService {


	private static final String[] numNames = {
		    "", "one", "two", "three", "four", "five", "six",
		    "seven", "eight", "nine", "ten", "eleven", "twelve",
		    "thirteen", "fourteen", "fifteen", "sixteen",
		    "seventeen", "eighteen", "nineteen", "twenty", 
		    "twenty-one", "twenty-two", "twenty-three", "twenty-four", "twenty-five", 
		    "twenty-six", "twenty-seven", "twenty-eight", "twenty-nine", "thirty", 
		    "thirty-one", "thirty-two", "thirty-three", "thirty-four", "thirty-five", 
		    "thirty-six", "thirty-seven", "thirty-eight", "thirty-nine", "forty", 
		    "forty-one", "forty-two", "forty-three", "forty-four", "forty-five", 
		    "forty-six", "forty-seven", "forty-eight", "forty-nine", "fifty", 
		    "fifty-one", "fifty-two", "fifty-three", "fifty-four", "fifty-five", 
		    "fifty-six", "fifty-seven", "fifty-eight", "fifty-nine"
		};
	    
	    public String convertTimeToWords(String time) {
	        try {
	            if (time.equals("12:00")) {
	                return "It's Midday";
	            } else if (time.equals("00:00")) {
	                return "It's Midnight";
	            }

	            String[] parts = time.split(":");
	            if (parts.length != 2) {
	                return "Invalid time format pls use ':' in the input time";
	            }

	            int hours = Integer.parseInt(parts[0]);
	            int minutes = Integer.parseInt(parts[1]);

	            if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
	                return "Invalid input time";
	            }

	            String timeInWords = "It's ";

	            if (hours >= 1 && hours <= 12) {
	                timeInWords += numNames[hours];
	                if (minutes != 0) {
	                    timeInWords += " " + numNames[minutes];
	                }
	            } else {
	                timeInWords += "Invalid time format";
	            }

	            return timeInWords;
	        } catch (NumberFormatException e) {
	            return "Invalid time format";
	        }
	    }

	
}
