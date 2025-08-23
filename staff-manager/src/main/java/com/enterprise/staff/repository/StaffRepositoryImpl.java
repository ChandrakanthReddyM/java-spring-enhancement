package com.enterprise.staff.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.enterprise.staff.model.Staff;

@Repository
public class StaffRepositoryImpl implements StaffRepository {
	
	
	private Map<Integer, Staff> staffUsers =  new HashMap<>();
	
	@Override
	public Staff save(Staff staff) {
		staffUsers.putIfAbsent(staff.getId(), staff);
		return staff;
	}

	@Override
	public Map<Integer, Staff> get() {
		return staffUsers;
	}

	@Override
	public Staff getById(int id) {
		return staffUsers.getOrDefault(id,new Staff(0,null,null,null,null));
	}

	@Override
	public Staff update(int id, Staff staff) {
		staffUsers.replace(id, staff);
		return staff;
	}

	@Override
	public void delete(int id) {
		staffUsers.remove(id);
	}

}
