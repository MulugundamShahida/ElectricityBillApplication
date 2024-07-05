package com.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class electricity {
	@Id
	private int consumerid;
	private String consumername;
	private int currentreading;
	private int previousreading;
	private double units;
	private double totalbill;
	public electricity() {
		super();
	}
	public electricity(int consumerid, String consumername, int currentreading, int previousreading, double units,
			double totalbill) {
		super();
		this.consumerid = consumerid;
		this.consumername = consumername;
		this.currentreading = currentreading;
		this.previousreading = previousreading;
		this.units = units;
		this.totalbill = totalbill;
	}
	public int getConsumerid() {
		return consumerid;
	}
	public void setConsumerid(int consumerid) {
		this.consumerid = consumerid;
	}
	public String getConsumername() {
		return consumername;
	}
	public void setConsumername(String consumername) {
		this.consumername = consumername;
	}
	public int getCurrentreading() {
		return currentreading;
	}
	public void setCurrentreading(int currentreading) {
		this.currentreading = currentreading;
	}
	public int getPreviousreading() {
		return previousreading;
	}
	public void setPreviousreading(int previousreading) {
		this.previousreading = previousreading;
	}
	public double getUnits() {
		return units;
	}
	public void setUnits(double units) {
		this.units = units;
	}
	public double getTotalbill() {
		return totalbill;
	}
	public void setTotalbill(double totalbill) {
		this.totalbill = totalbill;
	}
	@Override
	public String toString() {
		return "electricity [consumerid=" + consumerid + ", consumername=" + consumername + ", currentreading="
				+ currentreading + ", previousreading=" + previousreading + ", units=" + units + ", totalbill="
				+ totalbill + "]";
	}
	
}