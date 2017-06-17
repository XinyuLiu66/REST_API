package org.HY_LXY.Parking_saver.model;

import java.util.*;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {

	private int id;
	private String userName;
	private Map<String, Integer> reservationStatus;
	
	
	public User(){
		
	}
	public User(int id, String userName) {
		this.id = id;
		this.userName = userName;
		reservationStatus = new HashMap<String, Integer>();

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Map<String, Integer> getReservationStatus() {
		return reservationStatus;
	}
	public void setReservationStatus(Map<String, Integer> reservationStatus) {
		this.reservationStatus = reservationStatus;
	}

	
}
