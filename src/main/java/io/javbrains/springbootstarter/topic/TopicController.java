package io.javbrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicServices topicServices;
	
	@RequestMapping("/topicsstring")
	public List<Topics> getAllTopicString() {
		return Arrays.asList(
						new Topics("10","java","java is IDE"),
						new Topics("20","JSP","JSP is javascript"),
						new Topics("30","HTML","HTML is language")
				);
	}
	
	@RequestMapping("/topics")
	public List<Topics> getAllTopics() {
		return  topicServices.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topics getTopic(@PathVariable String id){
		return topicServices.getTopic(id);
	}
	
}
