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
	//Simple type properties
	private String cName;
	private String cCeo;
	private Integer cId;
	
	//Array type properties
	private String colours[];
	
	//Collection type properties
	private List<String>nickName;
	private Set<Long>phoneNo;
	private Map<String, Object>details;
	
	//HAS-A properties
	private Project project;
}
