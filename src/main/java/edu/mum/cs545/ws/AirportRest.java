package edu.mum.cs545.ws;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import cs545.airline.model.Airplane;
import cs545.airline.model.Airport;
import cs545.airline.model.Flight;
import cs545.airline.service.AirplaneService;
import cs545.airline.service.AirportService;

@Path("airport")
public class AirportRest {
	
	@Inject
	private AirportService airportService;
	
	
	@Path("create")
	@POST
	public Airport create(Airport airport) {
//		try {
//			airlineService.create(airplane);
//		} catch (Exception e) {
//			return "Fail to create this object";
//		}
//		return airplane"create airplane successfully";	
		airportService.create(airport);
		return airport;
	}
	
	@Path("delete")
	@DELETE
	public String delete(Airport airport) {
		try {
			airportService.delete(airport);
		} catch (Exception e) {
			return "Fail to delete this object";
		}
		return "deleted airport successfully";	
	}
	
	@Path("update")
	@PUT
	public String update(Airport airport) {
		try {
			airportService.update(airport);
		} catch (Exception e) {
			return "Fail to update this object";
		}
		return "Updated airplane successfully";	
	}
	
	@Path("findall")
	@GET
	public List<Airport> findAll() {
		return airportService.findAll();
	}
	
	@Path("findbycity/{city}")
	@GET
	public List<Airport> findByModel(@PathParam("city") String city) {
		return airportService.findByCity(city);
	}
	
	@Path("findbyarrival/{flight}")
	@GET
	public List<Airport> findByArrival(@PathParam("flight") Flight flight) {
		return airportService.findByArrival(flight);
	}
	
	
	@Path("findbycode/{code}")
	@GET
	public Airport findByCode(@PathParam("code") String code) {
		return airportService.findByCode(code);
	}
	
	@Path("findbycountry/{country}")
	@GET
	public List<Airport> findByCountry(@PathParam("country") String country) {
		return airportService.findByCountry(country);
	}
	
	@Path("findbydeparture/{flight}")
	@GET
	public List<Airport> findByDeparture(@PathParam("flight") Flight flight) {
		return airportService.findByDeparture(flight);
	}
	
	@Path("findbyname/{name}")
	@GET
	public List<Airport> findByName(@PathParam("flight") String name) {
		return airportService.findByName(name);
	}
	
}
