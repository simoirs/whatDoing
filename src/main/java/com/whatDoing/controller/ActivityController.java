package com.whatDoing.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.whatDoing.model.Activity;
import com.whatDoing.repository.ActivityRepository;

@Controller
public class ActivityController {
	
	@Autowired
	ActivityRepository activityRepository; 
	
	@GetMapping("/")
	public String index(Model model) {
		List<Activity> activities = activityRepository.findAll();
		if(activities != null) {
			Random rnd = new Random();
			Activity randomActivity = activities.get(rnd.nextInt(activities.size()));
			
			model.addAttribute("activity", randomActivity);
		}
		
		return "index";
	}
}
