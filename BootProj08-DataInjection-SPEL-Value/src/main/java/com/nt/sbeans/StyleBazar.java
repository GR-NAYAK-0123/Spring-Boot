package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import lombok.ToString;

@Component("sb")
@ToString
public class StyleBazar {
	@Value("${cust.id}")
	private Integer customerID;
	@Value("${cust.name}")
	private String customerName;
	@Value("#{of.shirt + of.Tshirt + of.pant + of.jacket + of.hoodie}")
	private Double totalAmount;
	@Value("${cust.discount}")
	private Double discount;
	
	private Double finalAmount;

	@PostConstruct
	public void setFinalAmount() {
		this.finalAmount = totalAmount - (totalAmount * (discount/100));
	}
	
	
}
