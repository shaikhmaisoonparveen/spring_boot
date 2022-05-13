package com.tns.dao;

import com.tns.entities.Placement;

public interface PlacementDao {

	public abstract void addPlacement(Placement placement);
	public abstract void updatePlacement(Placement placement);
	public abstract void searchPlacement(int id);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();
	//public abstract Placement getPlacementById(int id);
	Placement searchPlacementById(int Id);
	
}

