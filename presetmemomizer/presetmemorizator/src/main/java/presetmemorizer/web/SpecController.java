package presetmemorizer.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import presetmemorizer.domain.Category;
import presetmemorizer.domain.CategoryRepository;
import presetmemorizer.domain.Spec;
import presetmemorizer.domain.SpecRepository;

@Controller
public class SpecController {
	@Autowired
	private SpecRepository repository;
	@Autowired
	private CategoryRepository catrep;

	// perussivu /speclist
	@RequestMapping(value={"/index", "/speclist"})
	public String specList(Model model) {
		// model lisäys kirjoilla
		model.addAttribute("specs", repository.findAll());
		model.addAttribute("categories", catrep.findAll());
		// html
		return "speclist";
	}

	// lisäyslomake /add
	@PostMapping("/add")
	public String postSpec(String name, String arpseqrate, String arpseqgate, String arpseqoct, String arpseqpat, String argseqstl, String lfo1wave, String lfo2wave, String lfo1delay, String lfo2delay, String lfo1rate, String lfo2rate, String osc1wave, String osc1ptchmod, String osc1pwm, String osc2ptchmod, String osc2tonemod, String osc2ptch, String osc2lvl, String osc2sync, String noiselvl, String oct, String voc, String cat) {
		// luodaan kirjaolio string-muuttujista
		Optional<Category> katsu = catrep.findById(Long.parseLong(cat));
		Category uusiKatsu = katsu.get();
		Spec newspec = new Spec(name, arpseqrate, arpseqgate, arpseqoct, arpseqpat, argseqstl, lfo1wave, lfo2wave, lfo1delay, lfo2delay, lfo1rate, lfo2rate, osc1wave, osc1ptchmod, osc1pwm, osc2ptchmod, osc2tonemod, osc2ptch, osc2lvl, osc2sync, noiselvl, oct, voc, uusiKatsu);
		// tallennus
		repository.save(newspec);
		// uudelleenohjaus 
		return "redirect:/speclist";
	}
	
	@GetMapping("/edit/{id}/{thing}/{val}")
	public String editSpec(@PathVariable String val, @PathVariable String thing, @PathVariable String id) {
		// id  longiksi
		long iidee = Long.parseLong(id);
		
		Optional<Spec> paivitettava = repository.findById(iidee);
		Spec paivitettavaKirja = paivitettava.get();
		
		switch(thing) {
			case "category":
				Optional<Category> katsu = catrep.findById(Long.parseLong(val));
				Category uusiKatsu = katsu.get();
				paivitettavaKirja.setCategory(uusiKatsu);
				break;
			case "name":paivitettavaKirja.setName(val);break;
			//Arpeggio
			case "arpseqrate":paivitettavaKirja.setArpseqrate(val);break;
			case "arpseqgate":paivitettavaKirja.setArpseqgate(val);break;
			case "arpseqoct":paivitettavaKirja.setArpseqoct(val);break;
			case "arpseqpat":paivitettavaKirja.setArpseqpat(val);break;
			case "arpseqstl":paivitettavaKirja.setArpseqstl(val);break;
			//LFO
			case "lfo1wave":paivitettavaKirja.setLfo1wave(val);break;
			case "lfo2wave":paivitettavaKirja.setLfo2wave(val);break;
			case "lfo1delay":paivitettavaKirja.setLfo1delay(val);break;
			case "lfo2delay":paivitettavaKirja.setLfo2delay(val);break;
			case "lfo1rate":paivitettavaKirja.setLfo1rate(val);break;
			case "lfo2rate":paivitettavaKirja.setLfo2rate(val);break;
			//OSC
			case "osc1wave":paivitettavaKirja.setOsc1wave(val);break;
			case "osc1ptchmod":paivitettavaKirja.setOsc1ptchmod(val);break;
			case "osc1pwm":paivitettavaKirja.setOsc1pwm(val);break;
			case "osc2ptchmod":paivitettavaKirja.setOsc2ptchmod(val);break;
			case "osc2tonemod":paivitettavaKirja.setOsc2tonemod(val);break;
			case "osc2ptch":paivitettavaKirja.setOsc2ptch(val);break;
			case "osc2lvl":paivitettavaKirja.setOsc2lvl(val);break;
			case "osc2sync":paivitettavaKirja.setOsc2sync(val);break;
			//MISC
			case "noiselvl":paivitettavaKirja.setNoiselvl(val);break;
			case "oct":paivitettavaKirja.setOct(val);break;
			case "voc":paivitettavaKirja.setVoc(val);break;
			
		}
		
		repository.save(paivitettavaKirja);
		
		// uudelleenohjaus 
		return "redirect:/speclist";
	}
	// REST hae specit
	@GetMapping("/specs")
    public @ResponseBody List<Spec> speclistREST() {	
        return (List<Spec>) repository.findAll();
    }    
	
	// REST hae id:llä
	@GetMapping("/specs/{id}")
    public @ResponseBody Optional<Spec> findSpecREST(@PathVariable("id") Long iidee) {	
    	return repository.findById(iidee);
    }   
	

	// poistolinkki /delete/id
	@GetMapping("/delete/{no}")
	public String deleteSpec(@PathVariable String no) {
		// string longiksi
		long id = Long.parseLong(no);
		// poisto
		repository.deleteById(id);
		// uudelleenohjaus perussivulle
		return "redirect:/speclist";
	}
}