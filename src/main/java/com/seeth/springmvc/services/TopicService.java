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
		allTopics.add(new Topic("4", "Node Js"));
		allTopics.add(new Topic("5", "Angular JS"));
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


	public void updateTopic(String id, Topic topic) {
		for(int i = 0; i < allTopics.size(); i++){
			if(allTopics.get(i).getId().hashCode()==id.hashCode()){
				allTopics.set(i, topic);
			}
		}
	}


	public void deleteTopic(String id) {
		allTopics.removeIf(t -> t.getId().equals(id));
	}
											
											
	
}
