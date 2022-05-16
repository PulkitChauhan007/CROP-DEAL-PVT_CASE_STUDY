package pulkit.CROPDETAIL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crop")
public class CropController {
	
	@Autowired
    CropRepository repo;
	
	@RequestMapping(value="/crop",method=RequestMethod.GET)
	public List<Crop> getAllCropsDetails(){
		return repo.findAll();
	}
	
	@RequestMapping(value="/crop/{id}",method=RequestMethod.GET)
	  public Optional<Crop> getCropsDetails(@PathVariable String id) {
		return repo.findById(id);
	  }
	
	@RequestMapping(value="/farmerCrop/{farmerId}",method=RequestMethod.GET)
	  public List<Crop> getByFarmerId(@PathVariable String farmerId) {
		return repo. getListByfarmerid(farmerId);
	  }
	


	  @RequestMapping(value="/addcrop",method=RequestMethod.POST)
	  public void addCropsDetails(@RequestBody Crop crops) {
		  repo.insert(crops);
	  }

	  @RequestMapping(value="/updatecrop/{id}",method=RequestMethod.PUT)
	  public void updateCrop(@PathVariable String id, @RequestBody Crop crops) {
		  repo.save(crops);
	  }

	  @RequestMapping(value="/deletecrop/{id}",method=RequestMethod.DELETE)
	  public void deleteCropsDetails(@PathVariable String id) {
	    repo.deleteById(id);
	  }

}