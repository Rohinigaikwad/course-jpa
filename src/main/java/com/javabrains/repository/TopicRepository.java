package com.javabrains.repository;

import com.javabrains.topic.Topic;
import org.springframework.data.repository.CrudRepository;

public abstract class TopicRepository implements CrudRepository<Topic,String> {

}
