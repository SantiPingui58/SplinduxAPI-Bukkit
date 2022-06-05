package me.santipingui58.data;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class Pool {
	    private static JedisPool pool;

	    
	    public Pool(String ip) {
	    	pool = new JedisPool(ip,6379);
	    }
	    
	    public static Jedis getResource(){
	        return pool.getResource();
	    }
	    
	    
	}
	
	

