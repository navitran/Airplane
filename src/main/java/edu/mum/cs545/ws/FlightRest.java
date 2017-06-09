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
import cs545.airline.service.AirportService;
import cs545.airline.service.FlightService;

@Path("flight")
public class FlightRest {
	
	@Inject
	private FlightService flightService;
	
	
	@Path("create")
	@POST
	public Flight create(Flight flight) {
//		try {
//			airlineService.create(airplane);
//		} catch (Exception e) {
//			return "Fail to create this object";
//		}
//		return airplane"create airplane successfully";	
		flightService.create(flight);
		return flight;
	}
	
	@Path("delete")
	@DELETE
	public String delete(Flight flight) {
		try {
			flightService.delete(flight);
		} catch (Exception e) {
			return "Fail to delete this object";
		}
		return "deleted Flight successfully";	
	}
	
	@Path("update")
	@PUT
	public String update(Flight flight) {
		try {
			flightService.update(flight);
		} catch (Exception e) {
			return "Fail to update this object";
		}
		return "Updated flight successfully";	
	}
	
	@Path("findall")
	@GET
	public List<Flight> findAll() {
		return flightService.findAll();
	}
	
	@Path("findbyairline/{airline}")
	@GET
	public List<Flight> findByAirline(@PathParam("airline") Airline airline) {
		return flightService.findByAirline(airline);
	}
	
	@Path("findbyarrival/{airplane}")
	@GET
	public List<Flight> findByAirline(@PathParam("airplane") Airplane airplane) {
		return flightService.findByArrival(airplane);
	}	
	@Path("findbyarrival/{date}")
	@GET
	public List<Flight> findByArrival(@PathParam("date") Date date) {
		return flightService.findByArrival(date);
	}	
	
	@Path("findbyarrivalbetween/{date,date}")
	@GET
	public List<Flight> findByArrivalBetween(@PathParam("date") Date date1,@PathParam("date") Date date2) {
		return flightService.findByArrivalBetween
				
				(date1,date2);
	}	
	
	@Path("findbydestination/{Airport}")
	@GET
	public List<Flight> findByDestination(@PathParam("airport") Airport airport) {
		return flightService.findByDestination(airport);
	}	
	
	@Path("findbynumber/{number}")
	@GET
	public List<Flight> findByNumer(@PathParam("number") String number) {
		return flightService.findByNumber(number);
	}
	
	@Path("findbyorigin/{airport}")
	@GET
	public List<Flight> findByOrigin(@PathParam("airport") Airport airport) {
		return flightService.findByOrigin(airport);
	}
}
