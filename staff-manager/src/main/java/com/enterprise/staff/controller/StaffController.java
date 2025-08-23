package com.enterprise.staff.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.enterprise.staff.model.Staff;
import com.enterprise.staff.service.StaffService;

@RestController
public class StaffController {
	private StaffService service;
	
	public StaffController(StaffService service) {
		this.service = service;
	}
	
	@PostMapping(value="save")
	public ResponseEntity<Staff> save(@RequestBody Staff staff) {
		Staff savedStaff = service.save(staff);
		return new ResponseEntity<Staff>(savedStaff, HttpStatus.CREATED);
		
	}
	
	@GetMapping(value="getStaffs")
	public ResponseEntity<Map<Integer, Staff>> get(){
		return new ResponseEntity<Map<Integer,Staff>>(service.get(), HttpStatus.OK);
	}
	
	@PatchMapping(value="update")
	public ResponseEntity<Staff> update(Integer id, Staff staff) {
		return new ResponseEntity<Staff>(service.update(id, staff), HttpStatus.ACCEPTED);
	}
	
}
