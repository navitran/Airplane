package edu.mum.cs545.jsf;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import cs545.airline.service.FlightService;

@Named
@ApplicationScoped
public class FlightJsfController {
	@Inject
	private FlightService flightService;
	public String  findAll(){
		
		
		return "findall";
	}
}
