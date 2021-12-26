package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.EmployeePayrollData;



@RestController
@RequestMapping("/employeePayrollservice")
/**
 * Controller : EmployeePayRollController
 * @author Yogendra Lalit Sharma
 *
 */
public class EmployeePayRollController {
	
	/**
	 * Call Get method
	 * @return : Http Status
	 */
	@RequestMapping(value = {"","/","/get"})
	public ResponseEntity<String> getEmployeePayrollData(){
		return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
	}
	
	/**
	 * Call Get method
	 * @param empId : Employee Id
	 * @return : Employee id of the employee
	 */
	@GetMapping("/get/{empId}")
	public ResponseEntity<String> getEmployeePayrollData(@PathVariable("empId") int empId){
		return new ResponseEntity<String>("Get Call Success for Id: "+ empId, HttpStatus.OK);
	}
	
	/**
	 * Call post method to add details
	 * @param empPayrollDTO : Employee details id, name & salary
	 * @return : id, name & salary
	 */
	@PostMapping("/create")
	public ResponseEntity<String> getEmployeePayrollData(@RequestBody EmployeePayrollData empPayrollData){
		return new ResponseEntity<String>("Created Employee Payroll Data for: "+ empPayrollData, HttpStatus.OK);
	}
	
	/**
	 * Call put method to update details
	 * @param empPayrollDTO : Employee details id, name & salary 
	 * @return : id, name & salary
	 */
	@PutMapping("/update")
	public ResponseEntity<String> updateEmployeePayrollData(@RequestBody EmployeePayrollData empPayrollDTO){
		return new ResponseEntity<String>("Updated Employee Payroll Data for: "+ empPayrollDTO, HttpStatus.OK);
	}
	
	/**
	 * Call delete method to remove employee details
	 * @param empId : Employee id
	 * @return : Employee id which is deleted
	 */
	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<String> deleteEmployeePayrollData(@PathVariable("empId") int empId){
		return new ResponseEntity<String>("Delete call success for id: "+ empId, HttpStatus.OK);
	}
}