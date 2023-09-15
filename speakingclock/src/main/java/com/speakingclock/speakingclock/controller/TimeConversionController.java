package com.speakingclock.speakingclock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.speakingclock.speakingclock.service.TimeConversionService;

@RestController
@RequestMapping("/time")
public class TimeConversionController {

	 @Autowired
	 private TimeConversionService timeConversionService;

	    @GetMapping("/convert")
	    public ResponseEntity<String> convertTime(@RequestParam String inputTime) {
	        String convertedTime = timeConversionService.convertTimeToWords(inputTime);
	        return ResponseEntity.ok(convertedTime);
	    }
}
