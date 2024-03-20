package com.redis;

import redis.clients.jedis.Jedis; 

public class RedisJava { 
   public static void main(String[] args) { 
      //Connecting to Redis server on localhost 
      Jedis jedis = new Jedis("demo-redis.1vl0gt.clustercfg.usw1.cache.amazonaws.com:6379"); 
      System.out.println("Connection to server sucessfully"); 
      //check whether server is running or not 
      System.out.println("Server is running: "+jedis.ping()); 
   } 
} 
