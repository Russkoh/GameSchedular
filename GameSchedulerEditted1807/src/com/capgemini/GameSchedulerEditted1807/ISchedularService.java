package com.capgemini.GameSchedulerEditted1807;

public interface ISchedularService {

	public String createGame(Game g);
	public String createPlayer(Player p);
	public String createDay(Day d);
	
	public String gameWiseReport(String gameName);
	//public String playerWiseReport(String playerName);
	//public String dayWiseReport(String dayName);
	
	
}
