package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.interfejsValuta;

public class Menjacnica implements interfejsValuta{

	@Override
	public void dodavanjeKursaValuteNaDan(String naziv, Kurs kurs,
			GregorianCalendar dan) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void brisanjeKursaValuteNaDan(String naziv, GregorianCalendar dan) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LinkedList<Kurs> pronadjiKursValuteNaDan(String naziv,
			String skraceniNaziv, GregorianCalendar dan) {
		// TODO Auto-generated method stub
		return null;
	}

}
