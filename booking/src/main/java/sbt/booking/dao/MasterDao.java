package sbt.booking.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import sbt.booking.vo.Master;

@Primary
@Repository
public class MasterDao {

	@Autowired
	private SqlSession sqlSession;
	
	public List<Master> getCompanyList(String a) throws Exception{
		return sqlSession.selectList("mapper.bookingMapper.selectCompanyList", a);
	}
	
	public List<Master> getRoomList(HashMap map) throws Exception{
		return sqlSession.selectList("mapper.bookingMapper.selectRoomList", map);
	}

}
