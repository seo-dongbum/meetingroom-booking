package sbt.booking.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbt.booking.dao.MasterDao;
import sbt.booking.vo.Master;

@Service
public class MasterService {

	@Autowired
	private MasterDao masterDao;

	public List<Master> getCompanyList(String a) throws Exception {
		return masterDao.getCompanyList(a);
	}
	
	public List<Master> getRoomList(String building) throws Exception {
		HashMap map = new HashMap<>();
		map.put("gubun", building.substring(0, 1));
		map.put("seq", building.substring(1));
		
		return masterDao.getRoomList(map);
	}
}
