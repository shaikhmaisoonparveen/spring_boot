package com.tns.service;

import com.tns.dao.PlacementDao;
import com.tns.dao.PlacementDoaImpl;
import com.tns.entities.Placement;

public  class PlacementServiceImpl implements PlacementServices{
	
	private PlacementDao dao;
	public  PlacementServiceImpl()
	
	 {
	dao = new PlacementDoaImpl();
	}
	
	@Override
	public void addPlacement(Placement placement) {
		dao.beginTransaction();
		dao.addPlacement(placement);
		dao.commitTransaction();
		
	}
	
	@Override
	public void updatePlacement(Placement placement) {
		dao.beginTransaction();
		dao.updatePlacement(placement);
		dao.commitTransaction();
		
	}
	
	@Override
	public Placement searchPlacementById(int Id) { 
		Placement placement = dao.searchPlacementById(Id);
		return placement;
		
	}

	@Override
	public void cancelPlacementById(int Id) {
		// TODO Auto-generated method stub
		
	}
/*
	@Override
	public Placement findPlacementById(int Id) {
		// TODO Auto-generated method stub
		return null;
	}*/
		}

