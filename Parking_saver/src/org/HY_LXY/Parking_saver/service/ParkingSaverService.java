package org.HY_LXY.Parking_saver.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.HY_LXY.Parking_saver.database.DatabaseClass;
import org.HY_LXY.Parking_saver.model.ParkingSaverInfo;

public class ParkingSaverService {
	private Map<Integer, ParkingSaverInfo> parkingSaversManager = DatabaseClass.getReserInfos();
  
	
	public ParkingSaverService() {
	//	double[] c1 = new double[]{1, 2};
	//	double[] c2 = new double[]{2, 3};
//		List<Double> c1 = new ArrayList<Double>();
//		c1.add(59.63);c1.add(88.98);
//		List<Double> c2 = new ArrayList<Double>();
//		c2.add(69.63);c1.add(98.98);
		ParkingSaverInfo ps1 = new ParkingSaverInfo(1, new double[]{11.1, 11.1});
		ParkingSaverInfo ps2 = new ParkingSaverInfo(2, new double[]{22.2, 22.2});
		parkingSaversManager.put(1, ps1);
		parkingSaversManager.put(2, ps2);
		

	}
	

	
	public List<ParkingSaverInfo> getAllParkingSavers() {
		return new ArrayList<ParkingSaverInfo>(parkingSaversManager.values()); 
	}
	
	public ParkingSaverInfo getSingleParkingSaver(int id) {
		return parkingSaversManager.get(id);
	}
	
	//POST
	public ParkingSaverInfo addParkingSaver(ParkingSaverInfo parkingSaver) {
		parkingSaver.setId(parkingSaver.getId());
		parkingSaversManager.put(parkingSaver.getId(), parkingSaver);
		return parkingSaver;
	}
	
	//PUT
	public ParkingSaverInfo updateParkingSaver(ParkingSaverInfo parkingSaver) {
		if (parkingSaver.getId() <= 0) {
			return null;
		}
		parkingSaversManager.put(parkingSaver.getId(), parkingSaver);
		return parkingSaver;
	}
	
	public ParkingSaverInfo removeParkingSaver(int id) {
		return parkingSaversManager.remove(id);
	}
}
