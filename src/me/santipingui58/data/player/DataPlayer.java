package me.santipingui58.data.player;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;


import me.santipingui58.data.DataManager;
import me.santipingui58.data.Language;
import me.santipingui58.data.spleef.SpleefType;


public class DataPlayer {
	

	private static DataPlayer manager;	
	 public static DataPlayer getPlayer() {
	        if (manager == null)
	        	manager = new DataPlayer();
	        return manager;
	    }
	 
	 
	 
	
		public void claimNameMC(UUID uuid,boolean b) {
			DataManager.getManager().set(uuid.toString()+"-votes.uuidmc", String.valueOf(b));
		}
		
		public boolean hasClaimedNameMC(UUID uuid) {
			return Boolean.valueOf(DataManager.getManager().get(uuid.toString()+"-votes.uuidmc"));
		}
		
		
		public void claimDiscord(UUID uuid,boolean b) {
			DataManager.getManager().set(uuid.toString()+"-votes.discord", String.valueOf(b));
		}
		
		public boolean hasClaimedDiscord(UUID uuid) {
			return Boolean.valueOf(DataManager.getManager().get(uuid.toString()+"-votes.discord"));
		}
		

		public void claimTwitch(UUID uuid,boolean b) {
			DataManager.getManager().set(uuid.toString()+"-votes.twitch", String.valueOf(b));
		}
		
		public boolean hasClaimedTwitch(UUID uuid) {
			return Boolean.valueOf(DataManager.getManager().get(uuid.toString()+"-votes.twitch"));
		}
		
		public void claimYoutube(UUID uuid,boolean b) {
			DataManager.getManager().set(uuid.toString()+"-votes.youtube", String.valueOf(b));
		}
		
		public boolean hasClaimedYoutube(UUID uuid) {
			return Boolean.valueOf(DataManager.getManager().get(uuid.toString()+"-votes.youtube"));
		}
		
		public void claimTwitter(UUID uuid,boolean b) {
			DataManager.getManager().set(uuid.toString()+"-votes.twitter", String.valueOf(b));
		}
		
		public boolean hasClaimedTwitter(UUID uuid) {
			return Boolean.valueOf(DataManager.getManager().get(uuid.toString()+"-votes.twitter"));
		}
		
	
	public int getParkourCurrentLevel(UUID uuid) {
		return Integer.parseInt(DataManager.getManager().get(uuid.toString()+"-parkour.current.level"));
	}
	
	public void setParkourCurrentLevel(UUID uuid,int i) {
		DataManager.getManager().set(uuid.toString()+"-parkour.current.level", String.valueOf(i));
	}
	
	
	public int getParkourPoints(UUID uuid) {
		return Integer.parseInt(DataManager.getManager().get(uuid.toString()+"-parkour.points"));
	}
	
	public void setParkourPoints(UUID uuid,int i) {
		DataManager.getManager().set(uuid.toString()+"-parkour.points", String.valueOf(i));
	}
	

	public void setParkourRecordByLevel(UUID uuid,int level,int record) {
		DataManager.getManager().set(uuid.toString()+"-parkour.level"+level, String.valueOf(record));
	}
	
	public int getParkourRecordByLevel(UUID uuid,int level) {		
		return Integer.valueOf(DataManager.getManager().get(uuid.toString()+"-parkour.level"+level));
	}
	
	
	public String getRankedArena(UUID uuid) {
		return DataManager.getManager().get(uuid.toString()+"-ranked.arena");
	}
	
	public void setRankedArena(UUID uuid,String s) {
		DataManager.getManager().set(uuid.toString()+"-ranked.arena", s);
	}
	
	public boolean joinMessageEnabled(UUID uuid) {
		return Boolean.valueOf(DataManager.getManager().get(uuid.toString()+"-join.message"));
	}
	
	public void joinMessage(UUID uuid,boolean b) {
		DataManager.getManager().set(uuid.toString()+"-join.message", String.valueOf(b));
	}
	
	public String getDefaultColorChat(UUID uuid) {
		return (DataManager.getManager().get(uuid.toString()+"-color.chat"));
	}
	
	public void setDefaultColorChat(UUID uuid,String c) {
		DataManager.getManager().set(uuid.toString()+"-color.chat", c);
	}
	
	public boolean hasAds(UUID uuid) {
		return Boolean.valueOf(DataManager.getManager().get(uuid.toString()+"-ads"));
	}
	
	public void ads(UUID uuid,boolean b) {
		DataManager.getManager().set(uuid.toString()+"-ads", String.valueOf(b));
	}
	
	public boolean hasNightVision(UUID uuid) {
		return Boolean.valueOf(DataManager.getManager().get(uuid.toString()+"-night.vision"));
	}
	
	public void nightVision(UUID uuid,boolean b) {
		DataManager.getManager().set(uuid.toString()+"-night.vision", String.valueOf(b));
	}
	
	public boolean hasTranslate(UUID uuid) {
		return Boolean.valueOf(DataManager.getManager().get(uuid.toString()+"-translate"));
	}
	
	public void translate(UUID uuid,boolean b) {
		DataManager.getManager().set(uuid.toString()+"-translate", String.valueOf(b));
	}
	
	public Language getLanguage(UUID uuid) {
		return Language.valueOf(DataManager.getManager().get(uuid.toString()+"-language"));
	}
	
	public void setLanguage(UUID uuid,Language l) {
		DataManager.getManager().set(uuid.toString()+"-language", l.toString());
	}
	
	public int getFFAWins(UUID uuid,SpleefType type) {
		return Integer.parseInt(DataManager.getManager().get(uuid.toString()+"-"+type.toString().toLowerCase()+".ffa.wins"));
	} 
	
	public void setFFAWins(UUID uuid,SpleefType type,int i) {
	DataManager.getManager().set(uuid.toString()+"-"+type.toString().toLowerCase()+".ffa.wins", String.valueOf(i));
	}
	
	public int getFFAGames(UUID uuid,SpleefType type) {
		return Integer.parseInt(DataManager.getManager().get(uuid.toString()+"-"+type.toString().toLowerCase()+".ffa.games"));
	} 
	public void setFFAGames(UUID uuid,SpleefType type,int i) {
		DataManager.getManager().set(uuid.toString()+"-"+type.toString().toLowerCase()+".ffa.games", String.valueOf(i));
	}
	
	public int getFFAKills(UUID uuid,SpleefType type) {
		return Integer.parseInt(DataManager.getManager().get(uuid.toString()+"-"+type.toString().toLowerCase()+".ffa.kills"));
	} 
	public void setFFAKills(UUID uuid,SpleefType type,int i) {
		DataManager.getManager().set(uuid.toString()+"-"+type.toString().toLowerCase()+".ffa.kills", String.valueOf(i));
	}
	
	public int getELO(UUID uuid,SpleefType type) {
		return Integer.parseInt(DataManager.getManager().get(uuid.toString()+"-"+type.toString().toLowerCase()+".elo"));
	} 
	public void setELO(UUID uuid,SpleefType type,int i) {
		DataManager.getManager().set(uuid.toString()+"-"+type.toString().toLowerCase()+".elo", String.valueOf(i));
	}
	
	public int getDuelGames(UUID uuid,SpleefType type) {
		return Integer.parseInt(DataManager.getManager().get(uuid.toString()+"-"+type.toString().toLowerCase()+".duel.games"));
	} 
	public void setDuelGames(UUID uuid,SpleefType type,int i) {
		DataManager.getManager().set(uuid.toString()+"-"+type.toString().toLowerCase()+".duel.games", String.valueOf(i));
	}
	
	public int getDuelWins(UUID uuid,SpleefType type) {
		return Integer.parseInt(DataManager.getManager().get(uuid.toString()+"-"+type.toString().toLowerCase()+".duel.wins"));
	} 
	public void setDuelWins(UUID uuid,SpleefType type,int i) {
		DataManager.getManager().set(uuid.toString()+"-"+type.toString().toLowerCase()+".duel.wins", String.valueOf(i));
	}
	
	
	public int getMonthlyFFAWins(UUID uuid,SpleefType type) {
		return Integer.parseInt(DataManager.getManager().get(uuid.toString()+"-"+type.toString().toLowerCase()+".ffa.wins.monthly"));
	} 
	
	public void setMonthlyFFAWins(UUID uuid,SpleefType type,int i) {
		DataManager.getManager().set(uuid.toString()+"-"+type.toString().toLowerCase()+".ffa.wins.monthly", String.valueOf(i));
	}
	
	public int getMonthlyFFAGames(UUID uuid,SpleefType type) {
		return Integer.parseInt(DataManager.getManager().get(uuid.toString()+"-"+type.toString().toLowerCase()+".ffa.games.monthly"));
	} 
	public void setMonthlyFFAGames(UUID uuid,SpleefType type,int i) {
		DataManager.getManager().set(uuid.toString()+"-"+type.toString().toLowerCase()+".ffa.games.monthly", String.valueOf(i));
	}
	
	public int getMonthlyFFAKills(UUID uuid,SpleefType type) {
		return Integer.parseInt(DataManager.getManager().get(uuid.toString()+"-"+type.toString().toLowerCase()+".ffa.kills.monthly"));
	} 
	public void setMonthlyFFAKills(UUID uuid,SpleefType type,int i) {
		DataManager.getManager().set(uuid.toString()+"-"+type.toString().toLowerCase()+".ffa.kills.monthly", String.valueOf(i));
	}
	
	public int getWeeklyFFAWins(UUID uuid,SpleefType type) {
		return Integer.parseInt(DataManager.getManager().get(uuid.toString()+"-"+type.toString().toLowerCase()+".ffa.wins.weekly"));
	} 
	
	public void setWeeklyFFAWins(UUID uuid,SpleefType type,int i) {
		DataManager.getManager().set(uuid.toString()+"-"+type.toString().toLowerCase()+".ffa.wins.weekly", String.valueOf(i));
	}
	
	public int getWeeklyFFAGames(UUID uuid,SpleefType type) {
		return Integer.parseInt(DataManager.getManager().get(uuid.toString()+"-"+type.toString().toLowerCase()+".ffa.games.weekly"));
	} 
	public void setWeeklyFFAGames(UUID uuid,SpleefType type,int i) {
		DataManager.getManager().set(uuid.toString()+"-"+type.toString().toLowerCase()+".ffa.games.weekly", String.valueOf(i));
	}
	
	public int getWeeklyFFAKills(UUID uuid,SpleefType type) {
		return Integer.parseInt(DataManager.getManager().get(uuid.toString()+"-"+type.toString().toLowerCase()+".ffa.kills.weekly"));
	} 
	public void setWeeklyFFAKills(UUID uuid,SpleefType type,int i) {
		DataManager.getManager().set(uuid.toString()+"-"+type.toString().toLowerCase()+".ffa.kills.weekly", String.valueOf(i));
	}
	
	
	public double getWinGameRatio(UUID uuid,SpleefType type) {
		if (getFFAGames(uuid, type)==0) {
			return (double) getFFAWins(uuid, type);
		} else {
			return (double) getFFAWins(uuid, type)/getFFAGames(uuid, type);
		}
	}
	
	public double getKillGameRatio(UUID uuid,SpleefType type) {
		if (getFFAGames(uuid, type)==0) {
			return (double) getFFAKills(uuid, type);
		} else {
			return (double) getFFAKills(uuid, type)/getFFAGames(uuid, type);
		}
	}

	public boolean isInGame(UUID uuid) {
		return Boolean.getBoolean(DataManager.getManager().get(uuid.toString()+"-is.in.game"));
	}
	
	public void game(UUID uuid,boolean b) {
		DataManager.getManager().set(uuid.toString()+"-is.in.game", String.valueOf(b));
	}
	
	public String getHelmet(UUID uuid) {
		return DataManager.getManager().get(uuid.toString()+"-helmet");
	}
	

	public int getRankingPosition(UUID uuid) {
		return Integer.valueOf(DataManager.getManager().get(uuid.toString()+"-ranking"));
	}
	
	
	public List<String> getRankingRecords(UUID uuid) {
		return DataManager.getManager().getList(uuid.toString()+"-records");
	}
	
	public boolean isHidingSpectators(UUID uuid) {
		return Boolean.getBoolean(DataManager.getManager().get(uuid.toString()+"-hiding.spectators"));
	}
	
	public void hideSpectators(UUID uuid,boolean b) {
		DataManager.getManager().set(uuid.toString()+"-hiding.spectators", String.valueOf(b));
	}
	

	public int getRankeds(UUID uuid) {
		return Integer.parseInt(DataManager.getManager().get(uuid.toString()+"-rankeds"));
	}
	
	public void setRankeds(UUID uuid,int i) {
		DataManager.getManager().set(uuid.toString()+"-rankeds", String.valueOf(i));
	}
	

	
	public int getMutationTokens(UUID uuid) {
		return Integer.parseInt(DataManager.getManager().get(uuid.toString()+"-mutation.tokens"));
	}
	
	public void setMutationTokens(UUID uuid,int i) {
		DataManager.getManager().set(uuid.toString()+"-mutation.tokens", String.valueOf(i));
	}

	 
	
	public int getLevel(UUID uuid) {
		return Integer.parseInt(DataManager.getManager().get(uuid.toString()+"-level"));
	}
	
	public void setLevel(UUID uuid,int i) {
		DataManager.getManager().set(uuid.toString()+"-level", String.valueOf(i));
	}
	
	public Date getRegisterDate(UUID uuid) {
		try {
			return new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse(DataManager.getManager().get(uuid.toString()+"-register.date"));
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void setRegisterDate(UUID uuid,Date d) {
		 SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		 DataManager.getManager().set(uuid.toString()+"-register.date",  format.format(d));
	}
	
	public Date getLastLogin(UUID uuid) {
		try {
			return new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse(DataManager.getManager().get(uuid.toString()+"-last.login"));
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void setLastLogin(UUID uuid,Date d) {
		 SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		 DataManager.getManager().set(uuid.toString()+"-last.login",  format.format(d));
	}

	  public int getCoins(UUID uuid) {
			return Integer.parseInt(DataManager.getManager().get(uuid.toString()+"-coins"));
	  }
	  
	  public void setCoins(UUID uuid,int i) {
		  DataManager.getManager().set(uuid.toString()+"-coins", String.valueOf(i));
	  }

	  
		public void setParticleEffect(UUID uuid,String s) {
			DataManager.getManager().set(uuid.toString()+"-particle.effect",s);
		}
		
		public String getParticleEffect(UUID uuid) {
			return DataManager.getManager().get(uuid.toString()+"-particle.effect");
		}
	  
		public void setParticleType(UUID uuid,String s) {
			DataManager.getManager().set(uuid.toString()+"-particle.type",s);
		}
		
		public String getParticleType(UUID uuid) {
			return DataManager.getManager().get(uuid.toString()+"-particle.type");
		}
	  
		
	  
 	public String getCountry(UUID uuid) {		
 		return DataManager.getManager().get(uuid.toString()+"-country");
	}
	
	public void setCountry(UUID uuid,String s) {
		DataManager.getManager().set(uuid.toString()+"-country",s);
	}

	public int getTotalOnlineTime(UUID uuid) {
		return Integer.parseInt(DataManager.getManager().get(uuid.toString()+"-total.online.time"));
	}
	
	public void setTotalOnlineTIme(UUID uuid,int i) {
		  DataManager.getManager().set(uuid.toString()+"-total.online.time", String.valueOf(i));
	}
	
	public int getOnlineTime(UUID uuid) {
		return Integer.parseInt(DataManager.getManager().get(uuid.toString()+"-online.time"));
	}
	
	public void setOnlineTime(UUID uuid,int i) {
		  DataManager.getManager().set(uuid.toString()+"-online.time", String.valueOf(i));
	}
	
	public int getSplinboxPoints(UUID uuid) {
		return Integer.parseInt(DataManager.getManager().get(uuid.toString()+"-splinbox.points"));
	}
	
	public void setSplinboxPoints(UUID uuid,int i) {
		  DataManager.getManager().set(uuid.toString()+"-splinbox.points", String.valueOf(i));
	}
	
	public int getDuelPermission(UUID uuid)  {
		return Integer.parseInt(DataManager.getManager().get(uuid.toString()+"-duel.permission"));
	}
	
	public void setDuelPermission(UUID uuid,int i) {
		DataManager.getManager().set(uuid.toString()+"-duel.permission",String.valueOf(i));
	}
	
	
	public int getMsgPermission(UUID uuid)  {
		return Integer.parseInt(DataManager.getManager().get(uuid.toString()+"-msg.permission"));
	}
	
	public void setMsgPermission(UUID uuid,int i) {
		DataManager.getManager().set(uuid.toString()+"-msg.permission",String.valueOf(i));
	}
	
	
	public int getDuelNotification(UUID uuid)  {
		return Integer.parseInt(DataManager.getManager().get(uuid.toString()+"-duel.notification"));
	}
	
	public void setDuelNotification(UUID uuid,int i) {
		DataManager.getManager().set(uuid.toString()+"-duel.notification",String.valueOf(i));
	}
	
	
	public void addSplinboxPoints(UUID uuid,int i) {
		  DataManager.getManager().set(uuid.toString()+"-splinbox.points", String.valueOf(getSplinboxPoints(uuid)+1));
	}
	
	
	public void resetSplinboxPoints(UUID uuid) {
		setSplinboxPoints(uuid, 0);
	}
	
	
	public String getIP(UUID uuid) {
		return DataManager.getManager().get(uuid.toString()+"-ip");
	}
	
	public void setIP(UUID uuid,String ip) {
		DataManager.getManager().set(uuid.toString()+"-ip",ip);
	}

	
	public void setHelmet(UUID uuid,String string) {
		DataManager.getManager().set(uuid.toString()+"-helmet",string);
		
	}

	
	public int getVotes(UUID uuid) {
		return Integer.parseInt(DataManager.getManager().get(uuid.toString()+"-votes"));
	}
	
	public void setVotes(UUID uuid,int i) {
		DataManager.getManager().set(uuid.toString()+"-votes", String.valueOf(i));
	}
	
	
	public void addDuelGames(UUID uuid,SpleefType type) {
		setDuelGames(uuid,type,getDuelGames(uuid,type)+1);	
	}

	public void addFFAKill(UUID uuid,SpleefType type) {
		setFFAKills(uuid,type,getFFAKills(uuid,type)+1);
		setWeeklyFFAKills(uuid,type, getWeeklyFFAKills(uuid,type)+1);
		setMonthlyFFAKills(uuid,type, getMonthlyFFAKills(uuid,type)+1);
		
	}
	
	public void addFFAGame(UUID uuid,SpleefType type) {
		setFFAGames(uuid,type, getFFAGames(uuid,type)+1);
		setWeeklyFFAGames(uuid,type,getWeeklyFFAGames(uuid,type)+1);
		setMonthlyFFAGames(uuid,type, getMonthlyFFAGames(uuid, type)+1);
	}
	
	public void addFFAWin(UUID uuid,SpleefType type) {
		setFFAWins(uuid,type,getFFAWins(uuid, type)+1);
		setWeeklyFFAWins(uuid, type,getWeeklyFFAWins(uuid,type)+1);
		setMonthlyFFAWins(uuid,type, getMonthlyFFAWins(uuid,type)+1);
	}

	public String getHideLobby(UUID uuid) {
		return DataManager.getManager().get(uuid.toString()+".hide_lobby");
	}

	public void setHideLobby(UUID uuid,String s) {
		DataManager.getManager().set(uuid.toString()+".hide_lobby",s);
	}



}

