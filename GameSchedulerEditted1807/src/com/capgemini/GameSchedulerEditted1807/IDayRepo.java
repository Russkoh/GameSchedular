package com.capgemini.GameSchedulerEditted1807;

public interface IDayRepo {

	public String save(Day d);
	public Day findOne(String name);
	public Day[] findAll();
	
}
