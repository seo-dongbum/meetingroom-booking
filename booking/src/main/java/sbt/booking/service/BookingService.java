package sbt.booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbt.booking.dao.BookingDao;
import sbt.booking.vo.Booking;

@Service
public class BookingService {

	@Autowired
	private BookingDao bookingDao;
	
	public List<Booking> getBookingList(String a) throws Exception {
		return bookingDao.getBookingList(a);
	}
	
	public List<Booking> getCompanyAndRoomList(String a) throws Exception {
		return bookingDao.getCompanyAndRoomList(a);
	}
	
	public List<Booking> getRoomInfoList(String roomInfo) throws Exception {
		return bookingDao.getRoomInfoList(roomInfo.substring(1));
	}
}
