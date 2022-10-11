package com.cybage.app.model;

public class SeatPrice {
	private double econmicClass_price;
	private double premiumClass_price;
	private double businessClass_price;
	public double getEconmicClass_price() {
		return econmicClass_price;
	}
	public void setEconmicClass_price(double econmicClass_price) {
		this.econmicClass_price = econmicClass_price;
	}
	public double getPremiumClass_price() {
		return premiumClass_price;
	}
	public void setPremiumClass_price(double premiumClass_price) {
		this.premiumClass_price = premiumClass_price;
	}
	public double getBusinessClass_price() {
		return businessClass_price;
	}
	public void setBusinessClass_price(double businessClass_price) {
		this.businessClass_price = businessClass_price;
	}
	public SeatPrice(double econmicClass_price, double premiumClass_price, double businessClass_price) {
		super();
		this.econmicClass_price = econmicClass_price;
		this.premiumClass_price = premiumClass_price;
		this.businessClass_price = businessClass_price;
	}

}
