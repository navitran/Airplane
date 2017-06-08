package edu.mum.cs545.ws;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import cs545.airline.model.Airline;
import cs545.airline.model.Airport;
import cs545.airline.model.Flight;
import cs545.airline.service.AirlineService;
import cs545.airline.service.AirportService;

@Named
@Path("hello")
public class HelloRest {

	@Inject
	private AirlineService airlineService;
	@Inject
	private AirportService airportService;

	@GET
	public String helloWorld(@DefaultValue("Gorgeous") @QueryParam("name") String name) {
		return "Hello " + name + "!";
	}

	@Path("airline")
	@GET
	public String getAirlineTest() {
		String result = "Nil!";
		Airline airline = airlineService.findByName("oneworld");
		if (airline != null) {
			result = "This is an airline: " + airline.getName();
		}
		return result;
	}

	@Path("airport")
	@GET
	public List<Airport> getAllAirport() {
		List<Airport> airports = new ArrayList<>();
		if (airportService.findAll() != null) {
			airports = airportService.findAll();
			
			}
				
		return airports;
	}
	


}
