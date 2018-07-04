package com.seeth.springmvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.seeth.springmvc.models.Topic;
import com.seeth.springmvc.services.TopicService;

@Controller
public class TopicController {
	
	@Autowired
	TopicService topicService;
	
	@RequestMapping(value="/instopic",method=RequestMethod.GET)
	public String getInsertTopic(ModelMap model){
		return "instopic";
	}
	
	@RequestMapping(value="/instopic",method=RequestMethod.POST)
	public String postInsertTopic(ModelMap model, @ModelAttribute("topic") Topic topic){
		System.out.println(topic);
		topicService.insertTopic(topic);
		model.addAttribute("success", "Inserted "+topic);
		return "instopic";
	}
}
