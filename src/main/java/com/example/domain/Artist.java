package com.example.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "artists")
public class Artist {
	    @Id
	    private String id;
	    @Field("artistname")
	    private String artistname;
	    
	    
	    
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getArtistname() {
			return artistname;
		}
		public void setArtistname(String artistname) {
			this.artistname = artistname;
		}
	    
	    
	    
}
