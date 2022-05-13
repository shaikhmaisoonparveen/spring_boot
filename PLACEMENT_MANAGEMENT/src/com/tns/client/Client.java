package com.tns.client;

import com.tns.entities.Placement;
import com.tns.service.PlacementServices;
import com.tns.service.PlacementServiceImpl;

public class Client {

	public static void main(String[] args) {
		
    PlacementServices service = new PlacementServiceImpl();
		
		Placement placement = new Placement();

		//create operation
		placement.setId(1);
		placement.setName("Arshaq");
		placement.setCollege("R.V college of engg");
		placement.setDate(2001-2-20);
		placement.setQulification("BTech");
		placement.setYear(2019);
		
		service.addPlacement(placement);
	    System.out.println("Record has been Successfully Created......") ; 
	    
		System.out.println("End of program");
	}

}
