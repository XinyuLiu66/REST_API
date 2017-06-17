package org.HY_LXY.Parking_saver.resources;

import java.util.List;
import java.util.Map;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.HY_LXY.Parking_saver.model.User;
import org.HY_LXY.Parking_saver.service.UserService;




@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
public class UsersResource {

	UserService us = new UserService();

	//=================do not use any more=============
	@GET
	public List<User> getUsers() {
		return us.getAllUsers();
	}

	@GET
	@Path("/reservationstatus")
	public Map<String,Integer> getUser(@QueryParam("username") String username) {
	//	User theUser = null;
		List<User> list_users = us.getAllUsers();
		for(User user : list_users) {
			if(user.getUserName().equals(username) ) {
			//	theUser = user;
				return us.getUser(user.getId()).getReservationStatus();
				
			}
		}
		return null;
		
	}
	
//	// use to test Login
//	@GET
//	@Path("/{userId}/email")
//	// @Produces(MediaType.APPLICATION_JSON)
//	public String getUserEmail(@PathParam("userId") long id) {
//		return us.getUser(id).getEmail();
//	}
//
//	@GET
//	@Path("/{userId}/password")
//	// @Produces(MediaType.APPLICATION_JSON)
//	public String getUserPassword(@PathParam("userId") long id) {
//		return us.getUser(id).getPassword();
//	}
//
//	// TODO not work now
//	@GET
//	@Path("/?email={email}&password={password}")
//	@Produces(MediaType.APPLICATION_JSON)
//	public User checkUser(@PathParam("email") String email, @PathParam("password") String password) {
//		return us.checkUser(email, password);
//		// return us.getUser(id).getPassword();
//	}
//
//	@POST
//	public User postUser(User user) {
//		return us.addUser(user); // ID + 1
//
//	}
//
//	// TODO new clients register or modify User!
//	@PUT
//	@Path("/{userId}")
//	public User putUser(@PathParam("userId") long id, User user) {
//		if(us.getUsers().containsKey(id)){
//			return us.updateUser(user);
//		}
//		else{
//			user.setId(id);
//			return us.updateUser(user);
//		}
//
//	}
//
//	// TODO clients want to cancel account
//	@DELETE
//	@Path("/{userId}")
//	public void deleteUser(@PathParam("userId") long id) {
//		us.removeUser(id);
//	}

}
