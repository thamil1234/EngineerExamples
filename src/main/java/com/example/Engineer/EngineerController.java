package com.example.Engineer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EngineerController {
	@Autowired
	EngineerDaO ED;
	
	@PostMapping("post")
	public String add(@RequestBody Engineer e) {
		ED.add(e);
		return "Success";
	}
	
	@GetMapping("getbyId/{id}")
	public Engineer getById(@PathVariable int id) {
		return ED.getById(id);		
	}
	
	@DeleteMapping("deleteById/{id}")
	public String deleteById(@PathVariable int id) {
		 ED.deleteById(id);
		 return "Data Erased Successfully";
	}
	@PutMapping("Update/{id}")
	public String update(@RequestBody Engineer e,@PathVariable int id) {
		return ED.update(e,id)+"Data Updated Sucessfully";
	}
	@GetMapping("engineer")
	public String getName(@RequestParam (name = "EngName") String name) {
		return "My name is "+name;
	}
	
	@GetMapping("User")
	public String getStatus(@RequestParam (defaultValue = "Currently Busy") String status) {
		return "Engineer Is "+status+" right now";
	}
	@GetMapping("Look")
	public String getlook(@RequestParam(required = false) String jk) {
		return "My Name is "+jk;
	}

}
