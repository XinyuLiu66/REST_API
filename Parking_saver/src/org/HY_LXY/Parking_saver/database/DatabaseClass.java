package org.HY_LXY.Parking_saver.database;

import java.util.HashMap;
import java.util.Map;

import org.HY_LXY.Parking_saver.model.ParkingSaverInfo;
import org.HY_LXY.Parking_saver.model.User;


public class DatabaseClass {

	private static Map<Integer, User> users = new HashMap<>();
	//private static Map<Long, Profile> profiles = new HashMap<>();
    private static Map<Integer,ParkingSaverInfo> reserInfos = new HashMap<>();
    
	
	public static Map<Integer, User> getUsers() {
		return users;
	}
	
//	public static Map<Long, Profile> getProfiles() {
//		return profiles;
//	}
	
	public static Map<Integer, ParkingSaverInfo> getReserInfos() {
		return reserInfos;
	}
	
	
	
}
