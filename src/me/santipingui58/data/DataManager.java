package me.santipingui58.data;

import java.util.List;
import java.util.Set;
import java.util.UUID;

import redis.clients.jedis.Jedis;

public class DataManager {

	private static DataManager manager;	
	 public static DataManager getManager() {
	        if (manager == null)
	        	manager = new DataManager();
	        return manager;
	    }
	
	
	
	public String get(String key) {
		Jedis j = null;
		try {
		   j = Pool.getResource();
		   if (Main.password!=null) j.auth(Main.password);
		   return j.get(key);
		} finally {
		   j.close();
		}
	}
	
	public void set(String key, String value) {
		if (value==null) return;
		Jedis j = null;
		try {
		   j = Pool.getResource();
		   if (Main.password!=null)  j.auth(Main.password);
		   j.set(key, value);
		} finally {
		   j.close();
		}
	}
	
	
	
	public List<String> getList(String key) {

		Jedis j = null;
		try {
		   j = Pool.getResource();
		   if (Main.password!=null)  j.auth(Main.password);
		 return  j.lrange(key, 0, -1);
		} finally {
		   j.close();
		}
	}
	
	
	public void addToList(String key,String s) {
		Jedis j = null;
		try {
		   j = Pool.getResource();
		   if (Main.password!=null)  j.auth(Main.password);
		   if (getList(key).contains(s)) return;
		   j.lpush(key, s);
		} finally {
		   j.close();
		}
	}
	
	public void removeFromList(String key,String s) {
		Jedis j = null;
		try {
		   j = Pool.getResource();
		   if (Main.password!=null)  j.auth(Main.password);
		   j.lpush(key, s);
		   j.lrem(key, 0, s);
		} finally {
		   j.close();
		}
	}
	
	
	public void setList(String key, List<String> list) {	
		Jedis j = null;
		try {
		   j = Pool.getResource();
		   if (Main.password!=null) j.auth(Main.password);
		   for (String s : list) {
			   j.lpush(key, s);
		   }
		} finally {
		   j.close();
		}
	}
	
	
	
	public Set<String> getSet(String key) {
		Jedis j = null;
		try {
		   j = Pool.getResource();
		   if (Main.password!=null)  j.auth(Main.password);
		 return  j.smembers(key);
		} finally {
		   j.close();
		}
	}
	
	
	
	public void addToSet(String key,String value) {
		Jedis j = null;
		try {
		   j = Pool.getResource();
		   if (Main.password!=null) j.auth(Main.password);
		   j.sadd(key, value);
		} finally {
		   j.close();
		}
	}
	
	public void removeToSet(String key,String value) {
		Jedis j = null;
		try {
		   j = Pool.getResource();
		   if (Main.password!=null) j.auth(Main.password);
		   j.srem(key, value);
		} finally {
		   j.close();
		}
	}
	
	public void delete(String key) {
		Jedis j = null;
		try {
		   j = Pool.getResource();
		   if (Main.password!=null)  j.auth(Main.password);
			j.del(key);
		} finally {
		   j.close();
		}
	}
	
	
	public void movePlayer(UUID player, String server) {
				String message = player.toString()+","+server;
				addToSet("pending-move-players",message);
	}

}
