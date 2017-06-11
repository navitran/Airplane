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
			Airline airline1 = new Airline(airline.getName());
			airlineService.create(airline1);
		} catch (Exception e) {
			return "createairline";
		}
		return "listallairlines";

	}

	public String update() {

		try {
			airlineService.update(airline);
		} catch (Exception e) {
			return "updateairline";
		}
		return "listallairlines";

	}

	public String delete() {

		try {

			airlineService.delete(airline);
		} catch (Exception e) {
			return "deleteairline";
		}
		return "listallairlines";

	}

}
