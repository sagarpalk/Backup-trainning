package com.cybage.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/complaints")
@CrossOrigin("*")
public class ComplaintController {
//	@Autowired
//	private ComplaintService complaintService;
//
//	@GetMapping("/getAllComplaints")
//	public ResponseEntity<List<Complaint>>getAllComplaint()
//	{
//		return new  ResponseEntity<List<Complaint>>(complaintService.getAllComplaint(),HttpStatus.OK);
//	}
//    
//
//	@PostMapping("/")
//	public ResponseEntity<String>addUser(@RequestBody Complaint complaint)
//	{
//		complaintService.addUser(user);
//		return new ResponseEntity<String>("USER ADDED SUCCESSFULLY",HttpStatus.CREATED);
//	}
//	
//	@DeleteMapping("/{id}")
//	public ResponseEntity<String>deleteUser(@PathVariable int id)
//	{
//		User index =userService.getById(id);
//		userService.removeUser(index);
//		return new ResponseEntity<String>("USER DELETED SUCCESSFULLY",HttpStatus.CREATED);
//		
//	}
//}
}
