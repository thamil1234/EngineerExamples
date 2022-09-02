package com.example.Engineer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EngineerDaO implements EngineerRepository {
	@Autowired
	JdbcTemplate jdbcTemp;
	
	public int add(Engineer e) {
		return jdbcTemp.update("INSERT INTO information (id,name,dept,college) VALUES(?,?,?,?)", new Object[] {e.getId(),e.getName(), e.getDept(),e.getCollege()});
		
			}
	public Engineer getById(int id) {
		return (Engineer) jdbcTemp.query("SELECT * FROM information WHERE id=?",new BeanPropertyRowMapper<Engineer>(Engineer.class),id);
		
	}
	public int deleteById(int id) {
		 return jdbcTemp.update("DELETE FROM information WHERE id=?",id=1);
	}
	
	public int update(Engineer e,int id) {
		return jdbcTemp.update("UPDATE employee SET name=?,dept=?,college=? WHERE id=?", new Object[] {e.getName(), e.getDept(),e.getCollege(),id});
	}
	
	
}
