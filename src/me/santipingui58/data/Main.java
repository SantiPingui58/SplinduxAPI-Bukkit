package me.santipingui58.data;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import redis.clients.jedis.Jedis;

public class Main extends JavaPlugin {
	
	
	/**
	 * Instance of the plugin
	 */
	public static Plugin pl;
	
	public static String password;
	
	public static Configuration config;
		/**
	    * @return Returns Main plugin instance.
	    */
	public static Plugin get() {
	    return pl;
	  }	
	
    @Override
    public void onEnable() {
    	pl = this;
    	config = new Configuration("config.yml",this);
    	password= null;
   	 	if (config.getConfig().contains("redis.password")) password = config.getConfig().getString("redis.password");
    	 new Pool(config.getConfig().getString("redis.hostname"));
    	 
    		try (Jedis j = Pool.getResource()) {
 			if (password!=null) j.auth(Main.password);
 			   j.set("key", "value");
 			    Main.get().getLogger().info("Reddis connected");
 			} catch(Exception e) {
 				 Main.get().getLogger().info("Reddis could not connect to the Server");
 				e.printStackTrace();
 			}	 
    }
    
    
    

    
}