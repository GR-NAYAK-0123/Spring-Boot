package com.nt.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("cmp")
@Data
@ConfigurationProperties(prefix = "org.info")
public class Company {
	//Normal Properties
	private String cName;
	private String cValueation;
	
	//Array type properties
	private String colours[];
	
	//Collection type properties
	private List<String>nickName;
	private Set<Long>phoneNumber;
	private Map<String, Object>details;
	
	//HAS-A properties
	private Project project;
}
