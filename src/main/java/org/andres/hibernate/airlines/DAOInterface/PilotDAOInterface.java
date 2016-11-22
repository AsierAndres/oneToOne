package org.andres.hibernate.airlines.DAOInterface;

import java.util.List;

import org.andres.hibernate.airlines.models.Pilot;

public interface PilotDAOInterface {
	public List<Pilot> selectAll ();
	public void insert (Pilot pilot);
}
