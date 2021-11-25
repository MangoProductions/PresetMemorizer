package presetmemorizer.domain;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
	//Miksi repositoryt ovat aina näin tyhjiä?
 List<Category> findByName(String name);
 
}