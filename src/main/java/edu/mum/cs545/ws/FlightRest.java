package edu.mum.cs545.ws;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import cs545.airline.model.Airline;
import cs545.airline.model.Airplane;
import cs545.airline.model.Airport;
import cs545.airline.model.Flight;
import cs545.airline.service.AirplaneService;
import cs545.airline.service.FlightService;

@Path("flight")
public class FlightRest {

	@Inject
	private FlightService flightService;

	@Path("find/{flightid}")
	@GET
	public Flight find(@PathParam("flightid") long flightid) {
		Flight flight = new Flight();
		flight.setId(flightid);
		return flightService.find(flight);
	}

	@Path("findall")
	@GET
	public List<Flight> findAll() {
		return flightService.findAll();
	}

	@Path("findbyairline/{airlineid}")
	@GET
	public List<Flight> findbByAirline(@PathParam("airlineid") long airlineid) {
		Airline airline = new Airline();
		airline.setId(airlineid);
		return flightService.findByAirline(airline);
	}

	@Path("findbyairplane/{airplaneid}")
	@GET
	public List<Flight> findbByAirplane(@PathParam("airplaneid") long airplaneid) {
		Airplane airplane = new Airplane();
		airplane.setId(airplaneid);
		return flightService.findByAirplane(airplane);
	}

	@Path("findbyarrival/{date}")
	@GET
	public List<Flight> findbByArrival( @PathParam("date") Date date) {
		return flightService.findByArrival(date);
	}

//	@Path("findbyarrivalbetween/{date1,date2}")
//	@GET
//	public List<Flight> findbByArrivalBetween(@PathParam("date") Date date1, @PathParam("date") Date date2) {
//		return flightService.findByArrivalBetween(date1, date2);
//	}
//
	@Path("findbydeparture/{date}")
	@GET
	public List<Flight> findbByDeparture(@PathParam("date") Date date) {
		return flightService.findByDeparture(date);
	}

//	@Path("findbydeparturebetween/{date1,date2}")
//	@GET
//	public List<Flight> findbByDepartureBetween(@PathParam("date") Date date1, @PathParam("date") Date date2) {
//		return flightService.findByDepartureBetween(date1, date2);
//	}
//
	@Path("findbydestination/{airportid}")
	@GET
	public List<Flight> findByDestination(@PathParam("airportid") long airportid) {
		Airport airport = new Airport();
		airport.setId(airportid);
		return flightService.findByDestination(airport);
	}
	
	@Path("findbynumber/{number}")
	@GET
	public List<Flight> findByNumber(@PathParam("number") String number) {
			return flightService.findByNumber(number);
	}
	
	@Path("findbyorigin/{airportid}")
	@GET
	public List<Flight> findByOrigin(@PathParam("airportid") long airportid) {
		Airport airport = new Airport();
		airport.setId(airportid);
		return flightService.findByOrigin(airport);
	}
	
	
}