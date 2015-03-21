package menjacnica.interfejs;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.Kurs;


public interface interfejsValuta {

	public void dodavanjeKursaValuteNaDan(String naziv, Kurs kurs, GregorianCalendar dan);
	public void brisanjeKursaValuteNaDan(String naziv, GregorianCalendar dan);
	public LinkedList<Kurs> pronadjiKursValuteNaDan(String naziv, String skraceniNaziv, GregorianCalendar dan);
}
