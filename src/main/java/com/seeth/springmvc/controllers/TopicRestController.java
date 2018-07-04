package com.seeth.springmvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seeth.springmvc.models.Topic;
import com.seeth.springmvc.services.TopicService;

@RestController
@RequestMapping(value="/topics")
public class TopicRestController {
	@Autowired
	TopicService topicService;
	
	@RequestMapping(value="")
	public List<Topic> getAllTopics(){
		return topicService.getAllTopics();
	}
	
	@RequestMapping(value="/{id}")
	public Topic topicById(@PathVariable String id){
		return topicService.getTopicById(id);
	}
	
}
