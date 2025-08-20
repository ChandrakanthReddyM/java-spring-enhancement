package com.enterprise.staff.repository;

import java.util.List;

import com.enterprise.staff.model.Staff;

public interface StaffRepository {
	
	public void save(Staff staff);
	
	public List<Staff> get();
	
	public Staff getById();
	
	public Staff update(Staff staff);
	
	public void delete(Staff staff);

}
