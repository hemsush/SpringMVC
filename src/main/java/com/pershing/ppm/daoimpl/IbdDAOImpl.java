package com.pershing.ppm.daoimpl;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pershing.ppm.dao.IbdDAO;
import com.pershing.ppm.model.IBD;

@Repository
public class IbdDAOImpl implements IbdDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	
	public List<String> searchIBD(String name){
		List<String> ibdList=new ArrayList<String>();
		
		
		String sql = "SELECT IBDID,NAME FROM IBD WHERE NAME like ?";
		List<Map<String, Object>> rows=jdbcTemplate.queryForList(
				sql, new Object[] { name });
		 for (Map<String, Object> row : rows) {
			 String ibdName= ((String)row.get("IBDID"))+"-"+((String)row.get("NAME"));
			 ibdList.add(ibdName);
		 }
		
		return ibdList;
	}
	
	
	public List<IBD> getIBD() {

		String sql = "SELECT IBDID,NAME FROM IBD";
		List<IBD> lstIbd  = getJdbcTemplate().query(
				sql, 
				new BeanPropertyRowMapper(IBD.class));
		return lstIbd;
	}

}
