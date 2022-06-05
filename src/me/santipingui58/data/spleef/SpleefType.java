package me.santipingui58.data.spleef;

public enum SpleefType {

	SPLEEF,
	TNTRUN,
	SPLEGG,
	POTSPLEEF,
	BOWSPLEEF;
	
	
	
	
	 public String getName() {
		 switch (this) {
		default:break;
		case SPLEEF: return "§b§lSpleef";
		case SPLEGG: return "§e§lSplegg";
		case TNTRUN: return "§c§lTNT Run";
		
		 }
		 return null;
	 }
}
