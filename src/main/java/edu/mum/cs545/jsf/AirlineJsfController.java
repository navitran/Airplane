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

	// private static AirlineService airlineService = new AirlineService();
	@Inject
	private AirlineService airlineService;

	private List<Airline> listOfAirlines;
	private Airline airline;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		this.name = name;
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++"+name);
	}

	public List<Airline> getListOfAirlines() {
		return airlineService.findAll();
	}

	public void setListOfAirlines(List<Airline> listOfAirlines) {
		this.listOfAirlines = listOfAirlines;
	}

	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
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
			Airline airline1 = new Airline();
			airline1.setId(airlineid);
			airline1.setName(name);
			airlineService.update(airline1);
		} catch (Exception e) {
			return "airline";
		}
		return "airline";

	}

	public String delete(long airlineid) {

		try {
			Airline airline1 = new Airline();
			airline1.setId(airlineid);
			airlineService.delete(airline1);
		} catch (Exception e) {
			return "airline";
		}
		return "airline";

	}

}
