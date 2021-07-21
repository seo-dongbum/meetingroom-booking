package sbt.booking.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import sbt.booking.vo.Booking;

@Primary
@Repository
public class BookingDao {

	@Autowired
	private SqlSession sqlSession;
	
	public List<Booking> getBookingList(String a) throws Exception{
		return sqlSession.selectList("mapper.bookingMapper.selectBookingList", a);
	}
	
	public List<Booking> getCompanyAndRoomList(String a) throws Exception{
		return sqlSession.selectList("mapper.bookingMapper.selectCompanyAndRoomList", a);
	}
	
	public List<Booking> getRoomInfoList(String roomInfo) throws Exception{
		return sqlSession.selectList("mapper.bookingMapper.selectRoomLInfoList", roomInfo);
	}
}
