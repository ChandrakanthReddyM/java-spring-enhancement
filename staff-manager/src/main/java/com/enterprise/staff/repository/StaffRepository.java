package com.enterprise.staff.repository;

import java.util.Map;

import com.enterprise.staff.model.Staff;

public interface StaffRepository {
	
	public void save(Staff staff);
	
	public Map<Integer, Staff> get();
	
	public Staff getById();
	
	public Staff update(Staff staff);
	
	public void delete(Staff staff);

}
