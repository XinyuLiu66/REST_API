package org.HY_LXY.Parking_saver.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.HY_LXY.Parking_saver.model.ParkingSaverInfo;
import org.HY_LXY.Parking_saver.service.ParkingSaverService;


@Path("/parkingsaver")
//@Consumes(MediaType.APPLICATION_JSON)
//@Produces(MediaType.APPLICATION_JSON)
public class ParkingSaverResource {

	ParkingSaverService parKingSaverService = new ParkingSaverService();
	
//=================do not use any more=============
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ParkingSaverInfo> getAllParkingSavers() {
		return parKingSaverService.getAllParkingSavers();
	}
	
	// ==============get coordination of a parking saver=========
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/coordination")
	public double[] getCoordinationInfo(@QueryParam("id") int id) {	
		return parKingSaverService.getSingleParkingSaver(id).getCoordination();
	}
	// ==============get status of a parking saver=========
	@GET
	@Path("/status")
	@Produces(MediaType.APPLICATION_JSON)
	public String getReservationInfo(@QueryParam("id") int id) {	
		return parKingSaverService.getSingleParkingSaver(id).getStatus();
	}
	// ==============update  a parking saver (because the blocked status has been changed)=========
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ParkingSaverInfo updateParkingSaverStatus(@QueryParam("id") int id, ParkingSaverInfo parkingSaver) {
		parkingSaver.setId(id);
		return parKingSaverService.updateParkingSaver(parkingSaver);
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ParkingSaverInfo postReservationInfo(ParkingSaverInfo parkingSaver){
		return parKingSaverService.addParkingSaver(parkingSaver);
		
	}
//	
//	@PUT
//	@Path("/{reserInfoId}")
//	public ParkingSaverInfo putReservationInfo(@PathParam("reserInfoId") long id, ParkingSaverInfo reserInfo) {
//		reserInfo.setId(id);
//		return ris.updateReservationInfo(reserInfo);
//	}
//	
//	@DELETE
//	@Path("/{reserInfoId}")
//	public void deleteReservationInfo(@PathParam("reserInfoId") long id) {
//		ris.removeReservationInfo(id);
//	}
}
