package presetmemorizer.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Spec {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name, arpseqrate, arpseqgate, arpseqoct, arpseqpat, arpseqstl, lfo1wave, lfo2wave, lfo1delay, lfo2delay, lfo1rate, lfo2rate, osc1wave, osc1ptchmod, osc1pwm, osc2ptchmod, osc2tonemod, osc2ptch, osc2lvl, osc2sync, noiselvl, oct, voc;

	@ManyToOne
	@JoinColumn(name = "categoryid")
	@JsonManagedReference
	private Category category;
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Spec() {}

	public Spec(String name, String arpseqrate, String arpseqgate, String arpseqoct, String arpseqpat, String arpseqstl, String lfo1wave, String lfo2wave, String lfo1delay, String lfo2delay, String lfo1rate, String lfo2rate, String osc1wave, String osc1ptchmod, String osc1pwm, String osc2ptchmod, String osc2tonemod, String osc2ptch, String osc2lvl, String osc2sync, String noiselvl, String oct, String voc, Category category) {
		super();
		this.setName(name);
		//arp
		this.setArpseqrate(arpseqrate);
		this.setArpseqgate(arpseqgate);
		this.setArpseqoct(arpseqoct);
		this.setArpseqpat(arpseqpat);
		this.setArpseqstl(arpseqstl);
		//lfo
		this.setLfo1wave(lfo1wave);
		this.setLfo2wave(lfo2wave);
		this.setLfo1delay(lfo1delay);
		this.setLfo2delay(lfo2delay);
		this.setLfo1rate(lfo1rate);
		this.setLfo2rate(lfo2rate);
		//osc
		this.setOsc1wave(osc1wave);
		this.setOsc1ptchmod(osc1ptchmod);
		this.setOsc1pwm(osc1pwm);
		this.setOsc2ptchmod(osc2ptchmod);
		this.setOsc2tonemod(osc2tonemod);
		this.setOsc2ptch(osc2ptch);
		this.setOsc2lvl(osc2lvl);
		this.setOsc2sync(osc2sync);
		//misc
		this.setNoiselvl(noiselvl);
		this.setOct(oct);
		this.setVoc(voc);
		this.category = category;
	}
	
	public Spec(String name, String arpseqrate, String arpseqgate, String arpseqoct, String arpseqpat, String arpseqstl, String lfo1wave, String lfo2wave, String lfo1delay, String lfo2delay, String lfo1rate, String lfo2rate, String osc1wave, String osc1ptchmod, String osc1pwm, String osc2ptchmod, String osc2tonemod, String osc2ptch, String osc2lvl, String osc2sync, String noiselvl, String oct, String voc) {
		super();
		this.setName(name);
		//arp
		this.setArpseqrate(arpseqrate);
		this.setArpseqgate(arpseqgate);
		this.setArpseqoct(arpseqoct);
		this.setArpseqpat(arpseqpat);
		this.setArpseqstl(arpseqstl);
		//lfo
		this.setLfo1wave(lfo1wave);
		this.setLfo2wave(lfo2wave);
		this.setLfo1delay(lfo1delay);
		this.setLfo2delay(lfo2delay);
		this.setLfo1rate(lfo1rate);
		this.setLfo2rate(lfo2rate);
		//osc
		this.setOsc1wave(osc1wave);
		this.setOsc1ptchmod(osc1ptchmod);
		this.setOsc1pwm(osc1pwm);
		this.setOsc2ptchmod(osc2ptchmod);
		this.setOsc2tonemod(osc2tonemod);
		this.setOsc2ptch(osc2ptch);
		this.setOsc2lvl(osc2lvl);
		this.setOsc2sync(osc2sync);
		//misc
		this.setNoiselvl(noiselvl);
		this.setOct(oct);
		this.setVoc(voc);
		this.category = null;
	}

	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getOsc1pwm() {
		return osc1pwm;
	}

	public void setOsc1pwm(String osc1pwm) {
		this.osc1pwm = osc1pwm;
	}

	public String getLfo2wave() {
		return lfo2wave;
	}

	public void setLfo2wave(String lfo2wave) {
		this.lfo2wave = lfo2wave;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArpseqrate() {
		return arpseqrate;
	}

	public void setArpseqrate(String arpseqrate) {
		this.arpseqrate = arpseqrate;
	}

	public String getArpseqgate() {
		return arpseqgate;
	}

	public void setArpseqgate(String arpseqgate) {
		this.arpseqgate = arpseqgate;
	}

	public String getArpseqoct() {
		return arpseqoct;
	}

	public void setArpseqoct(String arpseqoct) {
		this.arpseqoct = arpseqoct;
	}

	public String getArpseqpat() {
		return arpseqpat;
	}

	public void setArpseqpat(String arpseqpat) {
		this.arpseqpat = arpseqpat;
	}

	public String getArpseqstl() {
		return arpseqstl;
	}

	public void setArpseqstl(String arpseqstl) {
		this.arpseqstl = arpseqstl;
	}

	public String getLfo1wave() {
		return lfo1wave;
	}

	public void setLfo1wave(String lfo1wave) {
		this.lfo1wave = lfo1wave;
	}

	public String getLfo1delay() {
		return lfo1delay;
	}

	public void setLfo1delay(String lfo1delay) {
		this.lfo1delay = lfo1delay;
	}

	public String getLfo2delay() {
		return lfo2delay;
	}

	public void setLfo2delay(String lfo2delay) {
		this.lfo2delay = lfo2delay;
	}

	public String getLfo1rate() {
		return lfo1rate;
	}

	public void setLfo1rate(String lfo1rate) {
		this.lfo1rate = lfo1rate;
	}

	public String getLfo2rate() {
		return lfo2rate;
	}

	public void setLfo2rate(String lfo2rate) {
		this.lfo2rate = lfo2rate;
	}

	public String getOsc1wave() {
		return osc1wave;
	}

	public void setOsc1wave(String osc1wave) {
		this.osc1wave = osc1wave;
	}

	public String getOsc1ptchmod() {
		return osc1ptchmod;
	}

	public void setOsc1ptchmod(String osc1ptchmod) {
		this.osc1ptchmod = osc1ptchmod;
	}

	public String getOsc2ptchmod() {
		return osc2ptchmod;
	}

	public void setOsc2ptchmod(String osc2ptchmod) {
		this.osc2ptchmod = osc2ptchmod;
	}

	public String getOsc2tonemod() {
		return osc2tonemod;
	}

	public void setOsc2tonemod(String osc2tonemod) {
		this.osc2tonemod = osc2tonemod;
	}

	public String getOsc2ptch() {
		return osc2ptch;
	}

	public void setOsc2ptch(String osc2ptch) {
		this.osc2ptch = osc2ptch;
	}

	public String getOsc2lvl() {
		return osc2lvl;
	}

	public void setOsc2lvl(String osc2lvl) {
		this.osc2lvl = osc2lvl;
	}

	public String getOsc2sync() {
		return osc2sync;
	}

	public void setOsc2sync(String osc2sync) {
		this.osc2sync = osc2sync;
	}

	public String getNoiselvl() {
		return noiselvl;
	}

	public void setNoiselvl(String noiselvl) {
		this.noiselvl = noiselvl;
	}

	public String getOct() {
		return oct;
	}

	public void setOct(String oct) {
		this.oct = oct;
	}

	public String getVoc() {
		return voc;
	}

	public void setVoc(String voc) {
		this.voc = voc;
	}
	@Override
	public String toString() {
if (this.category != null) {
	return "Spec id=" + id + ", name=" + name + ",arpseqrate=" + arpseqrate + ",arpseqgate=" + arpseqgate + ",arpseqoct=" + arpseqoct + ",arpseqstl="+arpseqstl+",lfo1wave="+lfo1wave+"lfo2wave="+lfo2wave+",lfo1delay="+lfo1delay+",lfo2delay="+lfo2delay+",lfo1rate="+lfo1rate+",lfo2rate="+lfo2rate+",osc1wave="+osc1wave+",osc1ptchmod="+osc1ptchmod+",osc1pwm="+osc1pwm+",osc2ptchmod="+osc2ptchmod+",osc2ptch="+osc2ptch+",osc2lvl="+osc2lvl+",osc2sync="+osc2sync+",noiselvl="+noiselvl+",oct="+oct+",voc="+voc+",category=" + this.getCategory();
} //Tämä oli kivuliasta kirjoittaa oikein.
else {
	return "Spec id=" + id + ", name=" + name + ",arpseqrate=" + arpseqrate + ",arpseqgate=" + arpseqgate + ",arpseqoct=" + arpseqoct + ",arpseqstl="+arpseqstl+",lfo1wave="+lfo1wave+"lfo2wave="+lfo2wave+",lfo1delay="+lfo1delay+",lfo2delay="+lfo2delay+",lfo1rate="+lfo1rate+",lfo2rate="+lfo2rate+",osc1wave="+osc1wave+",osc1ptchmod="+osc1ptchmod+",osc1pwm="+osc1pwm+",osc2ptchmod="+osc2ptchmod+",osc2ptch="+osc2ptch+",osc2lvl="+osc2lvl+",osc2sync="+osc2sync+",noiselvl="+noiselvl+",oct="+oct+",voc="+voc;
}
}
}