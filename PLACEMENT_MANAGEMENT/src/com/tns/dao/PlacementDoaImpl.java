package com.tns.dao;

import javax.persistence.EntityManager;
import com.tns.entities.Placement;


public  class PlacementDoaImpl  implements PlacementDao {

private EntityManager entityManager;
	
	public PlacementDoaImpl() {
	entityManager = JPAUtil.getEntityManager();
	}
	
	@Override
	public Placement searchPlacementById(int  Id) {
	Placement placement = entityManager.find(Placement.class, Id);
	return placement;
	}

	@Override
	public void addPlacement(Placement placement) {
	entityManager.persist(placement);
	}
	
	@Override
	public void updatePlacement(Placement placement) {
	entityManager.merge(placement);
	}
	
	
	@Override
	public void beginTransaction() {
	entityManager.getTransaction().begin();
	}
	
	@Override
	public void commitTransaction() {
	entityManager.getTransaction().commit();
	}

	@Override
	public void searchPlacement(int id) {
		// TODO Auto-generated method stub
		
	}
}
