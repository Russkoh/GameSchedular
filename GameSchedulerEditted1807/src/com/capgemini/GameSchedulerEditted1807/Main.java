package com.capgemini.GameSchedulerEditted1807;


public class Main {
	
	public static void main(String args[]){
	Service service = new Service();
	
	//StringBuffer buff = service.gameWiseReport("Basketball");

	//StringBuffer buff = service.playerWiseReport("Roger");
	
	String buff = service.dayWiseReport("Day One");
	
	System.out.print(buff);
	}


}