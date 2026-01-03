package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.ToString;

@Component("of")
@ToString
@Getter
public class Outfit {
	//Here the Data Injection is happened by collecting the values from properties file
	@Value("${shirt.price}")
	private Double shirt;
	@Value("${Tshirt.price}")
	private Double Tshirt;
	@Value("${pant.price}")
	private Double pant;
	@Value("${jacket.price}")
	private Double jacket;
	@Value("${hoodie.price}")
	private Double hoodie;
}
