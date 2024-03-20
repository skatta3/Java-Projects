package com.java.redis;

import redis.clients.jedis.Jedis;

public class RedisJava {
   public static void main(String[] args) { 
	      //Connecting to Redis server on localhost 
	      Jedis jedis = new Jedis("http://3.142.218.224:6379"); 
	      System.out.println("Connection to server sucessfully"); 
	      //check whether server is running or not 
	      System.out.println("Server is running: "+jedis.ping()); 
	   }
}
