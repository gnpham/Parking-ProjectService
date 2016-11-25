package api;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import model.bean.CarParking;
import model.bo.CarParkingBO;

@Path("/carparking")
public class CarParkingAPI {
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public String getNhaXe() {
		List<CarParking> carParKing = new CarParkingBO().getListCP();
		ObjectMapper om = new ObjectMapper();
		String jsonListCarParking = null;
		try {
			jsonListCarParking = om.writerWithDefaultPrettyPrinter().writeValueAsString(carParKing);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonListCarParking;
	}
}
