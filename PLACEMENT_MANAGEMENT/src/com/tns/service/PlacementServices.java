package com.tns.service;

import com.tns.entities.Placement;

public interface PlacementServices {
	
	public abstract void addPlacement(Placement placement);
	public abstract void updatePlacement(Placement placement);
	public abstract void cancelPlacementById(int Id);
	
	//public abstract Placement findPlacementById(int Id);
	public abstract Placement searchPlacementById(int Id);
}
