package edu.mum.cs545.ws;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import cs545.airline.model.Airline;
import cs545.airline.model.Airport;
import cs545.airline.model.Flight;
import cs545.airline.service.AirportService;

@Path("airport")
public class AirportRest {

	@Inject
	private AirportService airportService;

	@Path("create")
	@POST
	public String create(Airport airport) {
		try {
			airportService.create(airport);
		} catch (Exception e) {
			return "Fail to create this object";
		}
		return "create Airport successfully";

	}

	@Path("delete/{airportid}")
	@DELETE
	public String delete(@PathParam("airportid") long airportid) {
		try {

			Airport airport = new Airport();
			airport.setId(airportid);
			airportService.delete(airport);

		} catch (Exception e) {
			return "Fail to update this object";
		}
		return "Deleted airport successfully";
	}

	@Path("find/{airportid}")
	@GET
	public Airport find(@PathParam("airportid") long airportid) {
		Airport airport = new Airport();
		airport.setId(airportid);
		return airportService.find(airport);
	}

	@Path("findall")
	@GET
	public List<Airport> findAll() {
		return airportService.findAll();
	}

	@Path("findbyarrival/{flightid}")
	@GET
	public List<Airport> findByArrival(@PathParam("flightid") long flightid) {
		Flight flight = new Flight();
		flight.setId(flightid);
		return airportService.findByArrival(flight);
	}

	@Path("findbycity/{city}")
	@GET
	public List<Airport> findByCity(@PathParam("city") String city) {
		return airportService.findByCity(city);
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

	@Path("findbydeparture/{flightid}")
	@GET
	public List<Airport> findbydeparture(@PathParam("flightid") long flightid) {
		Flight flight = new Flight();
		flight.setId(flightid);
		return airportService.findByDeparture(flight);
	}

	@Path("findbyname/{name}")
	@GET
	public List<Airport> findByName(@PathParam("name") String name) {
		return airportService.findByName(name);
	}

	@Path("update/{airportid}")
	@PUT
	public String update(@PathParam("airportid") long airportid, Airport airport) {
		try {
			airport.setId(airportid);
			airportService.update(airport);

		} catch (Exception e) {
			return "Fail to update this object";
		}
		return "Updated airport successfully";
	}

}
