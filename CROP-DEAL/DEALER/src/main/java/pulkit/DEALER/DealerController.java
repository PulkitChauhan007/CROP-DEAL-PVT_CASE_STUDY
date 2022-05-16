package pulkit.DEALER;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dealer")
public class DealerController {
	
	@Autowired
    DealerRepository repo;
	
	@RequestMapping(value="/dealer",method=RequestMethod.GET)
	public List<Dealer> getAllDealer(){
		return repo.findAll();
	}
	
	@RequestMapping(value="/dealer/{id}",method=RequestMethod.GET)
	  public Optional<Dealer> getDealer(@PathVariable String id) {
		return repo.findById(id);
	  }


	  @RequestMapping(value="/addDealer",method=RequestMethod.POST)
	  public void addDealer(@RequestBody Dealer dealers) {
		  repo.insert(dealers);
	  }

	  @RequestMapping(value="/updateDealer/{id}",method=RequestMethod.PUT)
	  public void updateDealer(@PathVariable String id, @RequestBody Dealer dealers) {
		  repo.save(dealers);
	  }

	  @RequestMapping(value="/deleteDealer/{id}",method=RequestMethod.DELETE)
	  public void deleteDealer(@PathVariable String id) {
	    repo.deleteById(id);
	  }

}