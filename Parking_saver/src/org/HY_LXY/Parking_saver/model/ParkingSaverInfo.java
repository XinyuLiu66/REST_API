package org.HY_LXY.Parking_saver.model;


import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ParkingSaverInfo {
	
	private int id;
	private double[] coordination;
	private String status;
	

	public ParkingSaverInfo(){
		
	}
	
//	public ParkingSaverInfo(int id, double[] coordination) {
//		this.id = id;
//		this.coordination = coordination;
//		this.status ="blocked";
//		
//	}

	public ParkingSaverInfo(int id,  double[] coordination) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.coordination = coordination;
		this.status ="blocked";
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	} 
	
	
	public double[] getCoordination() {
		return this.coordination;
	}
	public void setCoordination(double[] coordination) {
		this.coordination = coordination;
	}

	
}
