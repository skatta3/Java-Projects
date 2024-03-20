package com.training.idrbt;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;  

@Path("/UserService") 
public class UserService {  
   UserDao userDao = new UserDao();  
   
   @GET 
   @Path("/users") 
   @Produces(MediaType.APPLICATION_JSON) 
   public List<User> getUsers(){ 
      return userDao.getAllUsers(); 
   }  
   
//   @GET 
//   @Path("/allusers") 
//   @Produces(MediaType.APPLICATION_JSON) 
//   public List<User> getUsers(){ 
//      return userDao.getAllUsers(); 
//   }  
   
//   @POST 
//   @Path("/adduser") 
//   @Produces(MediaType.APPLICATION_JSON) 
//   public String addUser(){ 
//      return userDao.adduser(); 
//   }  
}