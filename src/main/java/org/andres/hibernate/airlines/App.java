package org.andres.hibernate.airlines;


import java.util.List;

import org.andres.hibernate.airlines.DAO.AircraftDAO;
import org.andres.hibernate.airlines.DAOInterface.AircraftDAOInterface;
import org.andres.hibernate.airlines.models.Aircraft;
import org.andres.hibernate.airlines.models.Pilot;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Aircraft aircraft1 = new Aircraft("Avion 1", 12000f);
    	Aircraft aircraft2 = new Aircraft("Avion 2", 14500f);
    	aircraft1.setPilot(new Pilot("Piloto 1", 1));
    	aircraft2.setPilot(new Pilot("Piloto 2", 2));
    	
    	AircraftDAOInterface aircraftDAO = new AircraftDAO();
    	aircraftDAO.insert(aircraft1);
    	aircraftDAO.insert(aircraft2);
    	
    	List<Aircraft> aircrafts = aircraftDAO.selectAll();
		for (Aircraft aircraft : aircrafts) {
			System.out.println(aircraft.toString());
		}
    	
    }
}
