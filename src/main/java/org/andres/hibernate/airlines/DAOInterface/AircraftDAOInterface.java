package org.andres.hibernate.airlines.DAOInterface;

import java.util.List;
import org.andres.hibernate.airlines.models.Aircraft;

public interface AircraftDAOInterface {
	public List<Aircraft> selectAll ();
	public void insert (Aircraft aircraft);
}
