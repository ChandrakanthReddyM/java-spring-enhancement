package com.enterprise.staff.service;

import java.util.Map;

import com.enterprise.staff.model.Staff;

public interface StaffService {
	
	public Staff save(Staff staff);
	
	public Map<Integer, Staff> get();
	
	public Staff getById(int id);
	
	public Staff update(int id, Staff staff);
	
	public void delete(int id);
	
}
