package edu.mum.cs545.ws;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import cs545.airline.model.Airline;
import cs545.airline.model.Flight;
import cs545.airline.service.AirlineService;

@Named
@Path("airline")
public class AirlineRest {

	@Inject
	private AirlineService airlineService;

	@Path("create")
	@POST
	public String create(Airline airline) {
		try {
			airlineService.create(airline);
		} catch (Exception e) {
			return "Fail to create this object";
		}
		return "created airline successfully";

	}
	
	@Path("delete/{airlineid}")
	@DELETE
	public String delete(@PathParam("airlineid") long airlineid) {
		try {
			
			Airline airline = new Airline();
			airline.setId(airlineid);
			airlineService.delete(airline);
	
		} catch (Exception e) {
			return "Fail to update this object";
		}
		return "Deleted airline successfully";
	}
	

	@Path("find/{airlineid}")
	@GET
	public Airline find(@PathParam("airlineid") long airlineid) {
		Airline airline = new Airline();
		airline.setId(airlineid);
		return airlineService.find(airline);
	}

	@Path("findall")
	@GET
	public List<Airline> findAll() {
		return airlineService.findAll();
	}

	@Path("findbyflight/{flightid}")
	@GET
	public List<Airline> findByFlight(@PathParam("flightid") long flightid) {
		Flight flight = new Flight();
		flight.setId(flightid);
		return airlineService.findByFlight(flight);
	}

	@Path("findbyname/{name}")
	@GET
	public Airline findByName(@PathParam("name") String name) {
		return airlineService.findByName(name);
	}

	
	@Path("update/{airlineid}")
	@PUT
	public String update(@PathParam("airlineid") long airlineid, Airline airline) {
		try {
			airline.setId(airlineid);
			airlineService.update(airline);
	
		} catch (Exception e) {
			return "Fail to update this object";
		}
		return "Updated airline successfully";
	}
}
