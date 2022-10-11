package com.cybage.app.model;

public class Offer {

	private int o_offerid;
	private String o_name;
	private double o_rate;

	public Offer() {
		super();
	}

	
	public Offer(int o_offerid) {
		super();
		this.o_offerid = o_offerid;
	}


	public Offer(String o_name, double o_rate) {
		super();

		this.o_name = o_name;
		this.o_rate = o_rate;

	}

	public Offer(int o_offerid, double o_rate) {
		super();
		this.o_offerid = o_offerid;
		this.o_rate = o_rate;
	}

	public Offer(int o_offerid, String o_name, double o_rate) {
		super();
		this.o_offerid = o_offerid;
		this.o_name = o_name;
		this.o_rate = o_rate;
	}

	public int getO_offerid() {
		return o_offerid;
	}

	public void setO_offerid(int o_offerid) {
		this.o_offerid = o_offerid;
	}

	public String getO_name() {
		return o_name;
	}

	public void setO_name(String o_name) {
		this.o_name = o_name;
	}

	public double getO_rate() {
		return o_rate;
	}

	public void setO_rate(double o_rate) {
		this.o_rate = o_rate;
	}

	@Override
	public String toString() {
		return "Offer [o_offerid=" + o_offerid + ", o_name=" + o_name + ", o_rate=" + o_rate + "]";
	}

}
