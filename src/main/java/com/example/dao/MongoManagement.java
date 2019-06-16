package com.example.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.example.domain.Artist;

@Repository(value="mongoManagement")
public class MongoManagement {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	
	
	public void doSelect() {
		List<Artist> artists = mongoTemplate.findAll(Artist.class);
		
		StringBuilder b = new StringBuilder();
		
		artists.stream().
		filter(artist->artist.getArtistname().startsWith("The")).
		map(artist->artist.getArtistname()).
		forEach(b::append);
		
		System.out.println(b.toString());
		
	}
	
	
	
	
}
