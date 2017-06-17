package org.HY_LXY.Parking_saver.service;

import java.util.*;
import org.HY_LXY.Parking_saver.database.DatabaseClass;
import org.HY_LXY.Parking_saver.model.User;


public class UserService {
	
	private Map<Integer, User> usersManager = DatabaseClass.getUsers();
  
	public UserService() {
		User user1 = new User(1, "huyue@gmail.com");
		Map<String,Integer> reservInfo1 = new HashMap<String,Integer>();
		reservInfo1.put("17/06/2017,09:00-11:00", 1);
		reservInfo1.put("17/06/2017,15:00-20:00", 3);
		user1.setReservationStatus(reservInfo1);
		usersManager.put(user1.getId(),user1);
		
		
		User user2 = new User(2, "liu@gmail.com");
		Map<String,Integer> reservInfo2 = new HashMap<String,Integer>();
		reservInfo2.put("16/06/2017,07:00-09:00", 1);
		reservInfo2.put("16/06/2017,19:00-20:00",1 );
		user2.setReservationStatus(reservInfo2);
		usersManager.put(user2.getId(),user2);
		usersManager.put(user2.getId(), user2);
	}
	
	public Map<Integer, User> getUsersManager() {
		return usersManager;
	}



	public void setUsersManager(Map<Integer, User> usersManager) {
		this.usersManager = usersManager;
	}
	
	public List<User> getAllUsers() {
		return new ArrayList<User>(usersManager.values()); 
	}
	
	public User getUser(int id) {
		return usersManager.get(id);
	}
	
	// POST
	public User addUser(User user) {
		user.setId(user.getId());
		usersManager.put(user.getId(), user);
		return user;
	}
	
	// PUT
	public User updateUser(User user) {
		if (user.getId() <= 0) {
			return null;
		}
		usersManager.put(user.getId(), user);
		return user;
	}
	
	public User removeUser(int id) {
		return usersManager.remove(id);
	}
	
	//TODO not work
//	public User checkUser(String email,String password){
//		User user = null;
//		for(int i = 0;i<users.size();i++){
//			User temp = users.get(i);
//			if(temp.getEmail().equals(email) && temp.getPassword().equals(password)){
//				user = temp;
//				break;
//			}
//		}
//		return user;
//	}
	
}
