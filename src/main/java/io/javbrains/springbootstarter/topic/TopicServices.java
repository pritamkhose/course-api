package io.javbrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
public class TopicServices {

	private List<Topics> topics =  Arrays.asList(
							new Topics("1","java","java is IDE"),
							new Topics("2","JSP","JSP is javascript"),
							new Topics("3","HTML","HTML is language")
					);
	
	
	public List<Topics> getAllTopics(){
		return topics;
	}
		
	public Topics getTopic(String id){
		//return (topics.stream().filter(t -> (String.valueOf(t.getId()).equals(id.toString()));
		//return (List<Topics>) topics.stream().filter(t -> t.getId()==id);
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
}
