package presetmemorizer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import presetmemorizer.domain.Category;
import presetmemorizer.domain.CategoryRepository;
import presetmemorizer.domain.Spec;
import presetmemorizer.domain.SpecRepository;
@SpringBootApplication
public class PresetApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(PresetApplication.class, args);
	}
	
	
	@Bean
	public CommandLineRunner demo(SpecRepository repository, CategoryRepository catrep) {
		return (args) -> {
			//Pattern categoriat
			Category up = new Category("Up");
			Category down = new Category("Down");
			Category up_inv = new Category("Up Inverted");
			Category down_inv = new Category("Down Inverted");			
			Category up_down = new Category("Up Down");
			Category down_up = new Category("Down Up");
			Category rand = new Category("Random");
			Category chord = new Category("Chord");
			Category as_played = new Category("As Played");
			catrep.save(up);
			catrep.save(down);
			catrep.save(up_inv);
			catrep.save(down_inv);
			catrep.save(up_down);
			catrep.save(down_up);
			catrep.save(rand);
			catrep.save(chord);
			catrep.save(as_played);		
			Spec h = new Spec("Behringer Deepmind 12", "78", "28", "2", "16", "7", "Sawtooth", "Inverted Sawtooth", "2", "31", "48", "33", "Square & Sawtooth", "7", "71", "71", "23", "12", "81", "Yes", "33", "0", "12", rand);


			repository.save(h);

		};
	}

}
