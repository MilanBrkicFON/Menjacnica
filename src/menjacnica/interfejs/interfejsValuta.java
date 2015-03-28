package menjacnica.interfejs;

import java.util.GregorianCalendar;
import menjacnica.Kurs;
import menjacnica.Valute;


public interface interfejsValuta {

	public void dodavanjeKursaValuteNaDan(Valute valuta,GregorianCalendar zaDan, Kurs kurs) throws Exception;
	public void brisanjeKursaValuteNaDan(Valute valuta, GregorianCalendar zaDan);
	public Kurs pronadjiKursValuteNaDan(String naziv, String skraceniNaziv, GregorianCalendar dan);
}
