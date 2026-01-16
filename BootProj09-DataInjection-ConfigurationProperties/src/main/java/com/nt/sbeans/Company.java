package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("cmp")
@ConfigurationProperties(prefix = "java.org")
@Data
public class Company {
	private String cName;
	private Integer cId;
	private Integer cSize;
	private String cValuation;
	
	@Value("${company.ceo}")
	private String ceo;
}
