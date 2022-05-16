package io.casestudy.FARMER;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/farmer")

public class FarmerController {
	
		@Autowired
	    FarmerRepository repo;
		
		@RequestMapping(value="/farmers",method=RequestMethod.GET)
		public List<Farmer> getAllFarmer(){
			return repo.findAll();
		}
		
		@RequestMapping(value="/farmer/{id}",method=RequestMethod.GET)
		  public Optional<Farmer> getFarmer(@PathVariable String id) {
			return repo.findById(id);
		  }

		  @RequestMapping(value="/addfarmer",method=RequestMethod.POST)
		  public void addFarmer(@RequestBody Farmer farmer) {
			  repo.insert(farmer);
		  }

		  @RequestMapping(value="/updatefarmer/{id}",method=RequestMethod.PUT)
		  public void updateFarmer(@PathVariable String id, @RequestBody Farmer farmers) {
			  repo.save(farmers);
		  }

		  @RequestMapping(value="/deletefarmer/{id}",method=RequestMethod.DELETE)
		  public void deleteFarmer(@PathVariable String id) {
		    repo.deleteById(id);
		  }

	}