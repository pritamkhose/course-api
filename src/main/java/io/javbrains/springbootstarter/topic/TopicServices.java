package io.javbrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.boot.autoconfigure.h2.H2ConsoleAutoConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
public class TopicServices {

	private ArrayList<Topics> topicsList =  new ArrayList (Arrays.asList(
							new Topics("1","java","java is IDE"),
							new Topics("2","JSP","JSP is javascript"),
							new Topics("3","HTML","HTML is language")
					));
	
	
	public List<Topics> getAllTopics(){
		return topicsList;
	}
		
	public Topics getTopic(String id){
		//return (topics.stream().filter(t -> (String.valueOf(t.getId()).equals(id.toString()));
		//return (List<Topics>) topics.stream().filter(t -> t.getId()==id);
		return topicsList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	
	public void addTopicNoRespoance(Topics topics){
		topicsList.add(topics);
	}
	
	public List<Topics> addTopic(Topics topics){
		topicsList.add(topics);
		return topicsList;
	}

	public List<Topics> updateTopic(Topics topics, String id) {
		//System.out.println("--> "+id);
		for(int i = 0; i < topicsList.size(); i++) {
			Topics t = topicsList.get(i);
			if(t.getId().equals(id)) {
				topicsList.set(i, topics);
				//System.out.println("--> "+topics.getId()+topics.getDescription()+topics.getName());
				return topicsList;
			} 
		}
		return topicsList;
	}

	public List<Topics> deleteTopic(String id) {
		topicsList.removeIf(t -> t.getId().equals(id));
		
		return topicsList;
	}
	
}
