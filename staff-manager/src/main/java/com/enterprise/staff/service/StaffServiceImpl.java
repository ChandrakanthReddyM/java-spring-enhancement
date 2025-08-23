package com.enterprise.staff.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.enterprise.staff.model.Staff;
import com.enterprise.staff.repository.StaffRepository;

@Service
public class StaffServiceImpl implements StaffService{

	private StaffRepository repository;
	
	public StaffServiceImpl(StaffRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public Staff save(Staff staff) {
		repository.save(staff);
		return staff;
		
	}

	@Override
	public Map<Integer, Staff> get() {
		// TODO Auto-generated method stub
		return repository.get();
	}

	@Override
	public Staff getById(int id) {
		// TODO Auto-generated method stub
		return repository.getById(id);
	}

	@Override
	public Staff update(int id, Staff staff) {
		// TODO Auto-generated method stub
		return repository.update(id, staff);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repository.delete(id);
	}

}
