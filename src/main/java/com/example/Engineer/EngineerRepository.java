package com.example.Engineer;

import java.util.List;

public interface EngineerRepository {
	
	public int add(Engineer e);
	
	public Engineer getById(int id);
	
	public int update(Engineer e,int id);
	
	public int deleteById(int id);
	

}
