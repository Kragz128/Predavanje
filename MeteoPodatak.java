package main;
import java.util.ArrayList;
import java.util.Scanner;

public class MeteoPodatak {
	
	private String nazivMjerneStanice;
	private String datumVremeOcitavanja;
	private float temperatura;
	private float vlaznost;
	private float pritisak;
	public String getNazivMjerneStanice() {
		return nazivMjerneStanice;
	}
	public MeteoPodatak(String nazivMjerneStanice, String datumVremeOcitavanja, float temperatura, float vlaznost,
			float pritisak) {
		super();
		this.nazivMjerneStanice = nazivMjerneStanice;
		this.datumVremeOcitavanja = datumVremeOcitavanja;
		this.temperatura = temperatura;
		this.vlaznost = vlaznost;
		this.pritisak = pritisak;
	}
	public void setNazivMjerneStanice(String nazivMjerneStanice) {
		this.nazivMjerneStanice = nazivMjerneStanice;
	}
	public String getDatumVremeOcitavanja() {
		return datumVremeOcitavanja;
	}
	public void setDatumVremeOcitavanja(String datumVremeOcitavanja) {
		this.datumVremeOcitavanja = datumVremeOcitavanja;
	}
	public float getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}
	public float getVlaznost() {
		return vlaznost;
	}
	public void setVlaznost(float vlaznost) {
		this.vlaznost = vlaznost;
	}
	public float getPritisak() {
		return pritisak;
	}
	public void setPritisak(float pritisak) {
		this.pritisak = pritisak;
	}
	public MeteoPodatak() {
		this(null, null, 0 ,0 ,0);
	}
	@Override
	public String toString() {
		return "MeteoPodatak [nazivMjerneStanice=" + nazivMjerneStanice + ", datumVremeOcitavanja="
				+ datumVremeOcitavanja + ", temperatura=" + temperatura + ", vlaznost=" + vlaznost + ", pritisak="
				+ pritisak + "]";
	}

	public static ArrayList<MeteoPodatak> izdvojPodatkeStanice(ArrayList<MeteoPodatak> niz, String nazivStanice, String datum) {

	    ArrayList<MeteoPodatak> izdvoj = new ArrayList<>();

	    for (MeteoPodatak x : niz) {
	        if (x.getNazivMjerneStanice().equals(nazivStanice)
	                && x.getDatumVremeOcitavanja().startsWith(datum)) {
	            izdvoj.add(x);
	        }
	    }

	    return izdvoj;
	}
}

