package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;

import com.example.dao.MongoManagement;

@SpringBootApplication
public class MongoDemoApplication {	
	
	
	//public static String host;
	
	public static void main(String[] args) {
		//host = args[0];
		SpringApplication.run(MongoDemoApplication.class, args);
		MongoManagement mm = (MongoManagement)SpringFactory.getbean("mongoManagement");
		mm.doSelect();
	}

/*	
	public @Bean MongoClientFactoryBean mongo() {
	    MongoClientFactoryBean mongo = new MongoClientFactoryBean();
	    mongo.setHost(host);
	    return mongo;
	}
*/	
	
}
