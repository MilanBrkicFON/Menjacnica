package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.interfejsValuta;

public class Menjacnica implements interfejsValuta{

	private LinkedList<Valute> valutaLista = new LinkedList<Valute>();

	public void brisanjeKursaValuteNaDan(Valute valuta, GregorianCalendar zaDan) {
				
		if(!valutaLista.contains(valuta)){
			throw new RuntimeException("Nepostojeca valuta");
		}
		
		for (int i = 0; i < valutaLista.size(); i++) {
			if(valutaLista.get(i).getDatum().equals(zaDan) && valutaLista.get(i).equals(valuta)){
				valutaLista.remove(valutaLista.get(i).getKurs());
			}
		}
	}

	
	public Kurs pronadjiKursValuteNaDan(String naziv, String skraceniNaziv, GregorianCalendar dan) {
		
		Kurs k = new Kurs();
		
		if(naziv.isEmpty() || naziv == "" || skraceniNaziv.isEmpty() || skraceniNaziv == ""){
			throw new RuntimeException("Prazni stringovi! ");
		}
		
			if(naziv != null && skraceniNaziv != null && dan != null){ 
				for (int i = 0; i < valutaLista.size(); i++) {
					if(skraceniNaziv.equals(valutaLista.get(i).getSkraceniNaziv()) && dan.equals(valutaLista.get(i).getDatum())){
						k = valutaLista.get(i).getKurs();
					}
				}
			}
		return k;
	}

	@Override
	public void dodavanjeKursaValuteNaDan(Valute valuta, GregorianCalendar zaDan, Kurs kurs) throws Exception {
		
		if(kurs == null){
			throw new Exception("Kurs ne sme biti null!");
		}
		if(valuta == null){ 
			throw new Exception("Greska! Objekat valuta je null");
		}
		
		if(valutaLista.contains(valuta)){
			for (int i = 0; i < valutaLista.size(); i++) {
				if(valutaLista.get(i).equals(valuta) && valutaLista.get(i).getDatum().equals(zaDan)){
					valutaLista.add(new Valute(valuta.getNaziv(), valuta.getSkraceniNaziv(), zaDan, kurs));	
				}
			}
		}
		
	}
}
