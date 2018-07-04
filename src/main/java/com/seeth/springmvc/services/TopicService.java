package com.seeth.springmvc.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.seeth.springmvc.models.Topic;

@Service
public class TopicService {
	private List<Topic> allTopics = new ArrayList<>();
	
	public TopicService() {
		allTopics.add(new Topic("1", "Spring"));
		allTopics.add(new Topic("2", "Struts"));
		allTopics.add(new Topic("3", "Django"));
	}
	

	public List<Topic> getAllTopics() {
		return allTopics;
	}

	public Topic getTopicById(String id) {
		return allTopics.stream().filter(list -> id.equals(list.getId())).findFirst().get();
	}

	public void insertTopic(Topic topic) {
		allTopics.add(topic);
	}
											
											
	
}
