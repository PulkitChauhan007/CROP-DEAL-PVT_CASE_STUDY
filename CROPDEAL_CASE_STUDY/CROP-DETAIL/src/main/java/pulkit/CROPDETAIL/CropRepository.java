package pulkit.CROPDETAIL;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface CropRepository extends MongoRepository<Crop , String> {

	List<Crop> getListByfarmerid(String farmerid);

}