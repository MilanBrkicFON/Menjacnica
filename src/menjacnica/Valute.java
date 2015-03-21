package menjacnica;

import java.util.GregorianCalendar;

public class Valute extends Kurs{

	private String naziv , skraceniNaziv;
	private GregorianCalendar datum;
	private Kurs kurs = new Kurs();
	
	
	public Valute(String naziv, String skraceniNaziv, GregorianCalendar datum,
			Kurs kurs) {
		super();
		this.naziv = naziv;
		this.skraceniNaziv = skraceniNaziv;
		this.datum = datum;
		this.kurs = kurs;
	}
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv == null)
			throw new RuntimeException("Naziv ne sme biti null");
		this.naziv = naziv;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		if(skraceniNaziv != null && skraceniNaziv.length() == 3 && skraceniNaziv.equalsIgnoreCase(skraceniNaziv))
			this.skraceniNaziv = skraceniNaziv;
		else throw new RuntimeException("Skraceni naziv ima 3 karaktera ili je lose unet.");
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		if(!(datum.before(new GregorianCalendar())))
			this.datum = datum;
		else throw new RuntimeException("Datum je pogresno unet.");
	}
	
	public Kurs getKurs() {
		return kurs;
	}
	public void setKurs(Kurs kurs) {
		this.kurs = kurs;
		
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result
				+ ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		return result;
	}
	

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valute other = (Valute) obj;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (skraceniNaziv == null) {
			if (other.skraceniNaziv != null)
				return false;
		} else if (!skraceniNaziv.equals(other.skraceniNaziv))
			return false;
		return true;
	}

	public String toString() {
		return "Valute [naziv=" + naziv + " [" + skraceniNaziv
				+ "] datum:" + datum + kurs + "]";
	}
	
	
	
}
