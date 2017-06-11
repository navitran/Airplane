package edu.mum.cs545.jsf;

import java.util.Collection;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import cs545.airline.model.Flight;
import cs545.airline.service.FlightService;


@Named
@ApplicationScoped
public class FlightJsfController {
	@Inject
	private FlightService flightService;
	
	private Collection<Flight> flights;

	public Collection<Flight> getAccounts() {
		return flightService.findAll();
	}

	public Collection<Flight> getFlights() {
		return flights;
	}

	public void setFlights(Collection<Flight> flights) {
		this.flights = flights;
	}


	
	public String  findAll(){
		
		
		return "findall";
	}
}
