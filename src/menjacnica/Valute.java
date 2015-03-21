package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Valute {

	private String naziv , skraceniNaziv;
	private GregorianCalendar datum;
	private LinkedList<Kurs> kurs = new LinkedList<Kurs>();
	
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		result = prime * result + ((kurs == null) ? 0 : kurs.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result
				+ ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valute other = (Valute) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (kurs == null) {
			if (other.kurs != null)
				return false;
		} else if (!kurs.equals(other.kurs))
			return false;
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
	@Override
	public String toString() {
		return "Valute [naziv=" + naziv + " [" + skraceniNaziv
				+ "] datum:" + datum + kurs + "]";
	}
	
	
	
}
