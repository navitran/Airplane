package edu.mum.cs545.jsf;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import cs545.airline.model.Airline;
import cs545.airline.model.Flight;
import cs545.airline.service.FlightService;

@Named
@ApplicationScoped
public class FlightJsfController {

	@Inject
	private FlightService flightService;

	private List<Flight> listOfFlights;

	public List<Flight> getListOfFlights() {
		return flightService.findAll();
	}

	public void setListOfFlights(List<Flight> listOfFlights) {
		this.listOfFlights = listOfFlights;
	}

	public String findByAirline(String name) {
		try {
			Airline airline = new Airline(name);
			this.listOfFlights = flightService.findByAirline(airline);
		} catch (Exception e) {
			return "flight";
		}
		return "flight";

	}

}
