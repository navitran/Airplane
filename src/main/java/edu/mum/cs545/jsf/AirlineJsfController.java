package edu.mum.cs545.jsf;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import cs545.airline.model.Airline;
import cs545.airline.service.AirlineService;

@Named
@SessionScoped
public class AirlineJsfController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private AirlineService airlineService;

	private List<Airline> listOfAirlines;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {

		this.name = name;

	}

	public List<Airline> getListOfAirlines() {
		return airlineService.findAll();
	}

	public void setListOfAirlines(List<Airline> listOfAirlines) {
		this.listOfAirlines = listOfAirlines;
	}


	public String create() {

		try {
			Airline airline = new Airline();
			airline.setName(getName());
			airlineService.create(airline);
		} catch (Exception e) {
			return "airline";
		}
		return "airline";

	}

	public String update(long airlineid, String name) {

		try {
			Airline airline = new Airline();
			airline.setId(airlineid);
			airline.setName(name);
			airlineService.update(airline);
		} catch (Exception e) {
			return "airline";
		}
		return "airline";

	}

	public String delete(long airlineid) {

		try {
			Airline airline = new Airline();
			airline.setId(airlineid);
			airlineService.delete(airline);
		} catch (Exception e) {
			return "airline";
		}
		return "airline";

	}

}
