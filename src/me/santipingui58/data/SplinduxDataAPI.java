package me.santipingui58.data;

import java.util.UUID;

import me.santipingui58.data.integration.IntegrationBukkitType;
import me.santipingui58.data.integration.IntegrationBungeeType;

public class SplinduxDataAPI {
	private static SplinduxDataAPI manager;	
	 public static SplinduxDataAPI getAPI() {
	        if (manager == null)
	        	manager = new SplinduxDataAPI();
	        return manager;
	    }
	 
	 
	 public void loadData(UUID u) { 
	 createIntegrationBungee(IntegrationBungeeType.LOAD_DATA,u.toString());
	 }
	 
	 
	 public void saveData(UUID u) {
		 createIntegrationBungee(IntegrationBungeeType.SAVE_DATA,u.toString());
	 }
	 
	 public void loadFriends(UUID u) {
		 createIntegrationBungee(IntegrationBungeeType.LOAD_FRIENDS,u.toString());
	 }
	 
	 
	 public void saveFriends(UUID u,UUID u2) {
		 createIntegrationBungee(IntegrationBungeeType.SAVE_FRIENDS,u.toString()+","+u2.toString());
		 
	 }
	 
	 public void deleteFriends(UUID u,UUID u2) {
		 createIntegrationBungee(IntegrationBungeeType.DELETE_FRIENDS,u.toString()+","+u2.toString());
	 }
	 
	 public boolean areQueuesClosed() {
		 return Boolean.getBoolean(DataManager.getManager().get("queues"));
	 }
	 public boolean isLoaded(UUID u) {
		 return DataManager.getManager().getSet("loaded-players").contains(u.toString());
	 }
	 
		public void createIntegrationBukkit(String server, IntegrationBukkitType type, String message) {
			String integration = server.toString()+";"+type.toString()+";"+message;
			if (server.matches(".*[0-9].*")) {
				DataManager.getManager().addToSet("bukkit-integration", integration);
				
			} else if (server.equalsIgnoreCase("all")) { 
				//SERVER;Type;Message
			for (String s : DataManager.getManager().getSet("loaded-servers")) {
				integration = s+";"+type.toString()+";"+message;
				DataManager.getManager().addToSet("bukkit-integration", integration);
			}
		
			} else {
				DataManager.getManager().addToSet("bungee-balancer", integration);	
			}
			}
		
		
		
		public void createIntegrationBungee(IntegrationBungeeType type, String message) {
				//Type;Message
				String integration = type.toString()+";"+message;
				DataManager.getManager().addToSet("bungee-integration", integration);		
				
		}
}
