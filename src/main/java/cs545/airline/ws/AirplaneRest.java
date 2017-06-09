package cs545.airline.ws;


import java.util.List;


import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;


import cs545.airline.model.Airplane;
import cs545.airline.service.AirplaneService;


@Named
@Path("airplane")
public class AirplaneRest {

	@Inject
	private AirplaneService airlineService;

	@Path("findall")
	@GET
	public List<Airplane> findAll() {
		return airlineService.findAll();
	}

	@Path("findbymodel/{model}")
	@GET
	public List<Airplane> findByModel(@PathParam("model") String model) {
		return airlineService.findByModel(model);
	}

	@Path("findbyserial/{serial}")
	@GET
	public Airplane findBySerial(@PathParam("serial") String serial) {
		return airlineService.findBySrlnr(serial);
	}

	@Path("findbyflight/{flightid}")
	@GET
	public List<Airplane> findByFlight(@PathParam("flightid") long flightid) {
		return airlineService.findByFlight(flightid);
	}

	@Path("create")
	@POST
	public Airplane create(Airplane airplane) {
//		try {
//			airlineService.create(airplane);
//		} catch (Exception e) {
//			return "Fail to create this object";
//		}
//		return airplane"create airplane successfully";	
		airlineService.create(airplane);
		return airplane;
	}
	
	@Path("delete")
	@DELETE
	public String delete(Airplane airplane) {
		try {
			airlineService.delete(airplane);
		} catch (Exception e) {
			return "Fail to delete this object";
		}
		return "deleted airplane successfully";	
	}
	
	@Path("update")
	@PUT
	public String update(Airplane airplane) {
		try {
			airlineService.update(airplane);
		} catch (Exception e) {
			return "Fail to update this object";
		}
		return "Updated airplane successfully";	
	}
}
