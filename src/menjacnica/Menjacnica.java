package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.interfejsValuta;

public class Menjacnica implements interfejsValuta{

	private LinkedList<Valute> valutaLista = new LinkedList<Valute>();

	public void brisanjeKursaValuteNaDan(Valute valuta, GregorianCalendar zaDan) {
				
		if(valutaLista.contains(valuta)){
			for (int i = 0; i < valutaLista.size(); i++) {
				if(valutaLista.get(i).getDatum().equals(zaDan)){
//					valutaLista.get(i).setKurs(null);
//					valutaLista.get(i).getKurs().setKupovniKurs(0);
//					valutaLista.get(i).getKurs().setProdajniKurs(0);
//					valutaLista.get(i).getKurs().setSrednjiKurs(0);
					valutaLista.remove(valutaLista.get(i).getKurs());
					
				}
			}
		}
		
	}

	@Override
	public Kurs pronadjiKursValuteNaDan(String naziv, String skraceniNaziv, GregorianCalendar dan) {
		
		Kurs k = new Kurs();
		
		if(naziv.isEmpty() || skraceniNaziv.isEmpty()){
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
	public void dodavanjeKursaValuteNaDan(Valute valuta, GregorianCalendar zaDan, double srednjiKurs,
			double prodajniKurs, double kupovniKurs) throws Exception {
		
		if(srednjiKurs <= 0 || prodajniKurs <= 0 || kupovniKurs <= 0){
			throw new Exception("Kurs mora da je veci od nule!");
		}
		if(valuta == null){ 
			throw new Exception("Greska! Objekat valuta je null");
		}
		
		Kurs k = new Kurs();
		k.setKupovniKurs(kupovniKurs);
		k.setProdajniKurs(prodajniKurs);
		k.setSrednjiKurs(srednjiKurs);
		
		if(valutaLista.contains(valuta)){
			for (int i = 0; i < valutaLista.size(); i++) {
				if(valutaLista.get(i).equals(valuta) && valutaLista.get(i).getDatum().equals(zaDan)){
					
					Valute v = new Valute(valuta.getNaziv(), valuta.getSkraceniNaziv(), zaDan, k);
					valutaLista.add(v);
					
				}
			}
		}
		
	}
}
