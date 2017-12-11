package com.yhs.demo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration("applicationProperties")
@ConfigurationProperties
public class ApplicationProperties {
	
	private String author;
	
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor(){
		return author;
	}
}
