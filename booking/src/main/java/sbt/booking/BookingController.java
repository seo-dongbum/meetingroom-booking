package sbt.booking;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import sbt.booking.service.BookingService;
import sbt.booking.service.MasterService;
import sbt.booking.vo.Booking;
import sbt.booking.vo.Master;

@RestController
public class BookingController {
	
	@Resource(name = "bookingService")
	private BookingService bookingService;
	
	@Resource(name = "masterService")
	private MasterService masterService;

	@PostMapping(path = "/getBookingList")
	public List<Booking> getBookingList(String a) throws Exception {
//		System.out.println(a);
		return bookingService.getBookingList(a);
	}
	
	@PostMapping(path = "/getCompanyList")
	public List<Master> getCompanyList(String a) throws Exception {
		return masterService.getCompanyList(a);
	}
	
	@GetMapping(path = "/getRoomList/{building}")
	public List<Master> getRoomList(@PathVariable String building) throws Exception {
		return masterService.getRoomList(building);
	}
	
	@GetMapping(path = "/getRoomInfoList/{roomInfo}")
	public List<Booking> getRoomInfoList(@PathVariable String roomInfo) throws Exception {
		return bookingService.getRoomInfoList(roomInfo);
	}


}
