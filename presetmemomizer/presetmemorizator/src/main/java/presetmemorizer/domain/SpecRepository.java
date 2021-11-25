package presetmemorizer.domain;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface SpecRepository extends CrudRepository<Spec, Long> {
	
 List<Spec> findByName(String name);
 
}