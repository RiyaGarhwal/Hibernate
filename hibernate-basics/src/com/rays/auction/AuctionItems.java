package com.rays.auction;

import java.util.Set;

public class AuctionItems {

	private int id;
	private Set bids;
	private String discription;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Set getBids() {
		return bids;
	}
	public void setBids(Set bids) {
		this.bids = bids;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	

	
}
