package pulkit.ADMIN;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Admin")
public class AdminController {
	
	@Autowired
    AdminRepository repo;
	
	@RequestMapping(value="/id",method=RequestMethod.GET)
	public List<Admin> getAllAdmin(){
		return repo.findAll();
	}
	
	  @RequestMapping(value="/crop",method=RequestMethod.POST)
	  public void addCropsDetails(@RequestBody Admin admin) {
		  repo.insert(admin);
	  }

	  @RequestMapping(value="/update/{id}",method=RequestMethod.PUT)
	  public void updateCrop(@PathVariable String id, @RequestBody Admin admin) {
		  repo.save(admin);
	  }

	  @RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	  public void deleteCropsDetails(@PathVariable String id) {
	    repo.deleteById(id);
	  }

}
