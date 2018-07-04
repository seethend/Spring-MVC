package com.seeth.springmvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	public String postInsertTopic(ModelMap model, @ModelAttribute Topic topic){
		topicService.insertTopic(topic);
		model.addAttribute("success", "Inserted "+topic);
		return "instopic";
	}
	
	@RequestMapping(value="/updtopic/{id}")
	public String getUpdateTopic(ModelMap model, @PathVariable String id){
		model.addAttribute("id", id);
		return "updtopic";
	}
	
	@RequestMapping(value="/updtopic/{id}",method=RequestMethod.POST)
	public String postUpdateTopic(ModelMap model, @ModelAttribute Topic topic, @PathVariable String id){
		topicService.updateTopic(id,topic);
		model.addAttribute("success", "Updated "+topic);
		return "updtopic";
	}
	
	@RequestMapping(value="/deltopic/{id}")
	public String deleteTopic(ModelMap model, @PathVariable String id){
		topicService.deleteTopic(id);
		model.addAttribute("success", "Deleted Topic with id: "+id);
		return "deltopic";
	}
	
}
