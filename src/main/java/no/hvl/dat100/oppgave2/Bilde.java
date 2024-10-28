package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;

public class Bilde extends Tekst {

	// TODO - objekt variable
	protected String url;
	

	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.tekst = tekst;
		this.url = url;
		
		
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
		this.tekst = tekst;
		this.url = url;
		
	}
	
	public String getUrl() {
		return url;

	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		String tilStreng = "BILDE" + "\n" + id + "\n" + bruker + "\n" + dato + "\n" + likes
				+ "\n" + tekst + "\n" + url;
		return tilStreng;
	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		String tilHTML = "<h2>" + bruker + "@" + dato + "[" + id + "]" + "</h2>" + "\n" + "<p>" + tekst + "</p> \n" + "<iframe src=" + url + "height=600px width=800px></iframe><hr> " ;
		
		return tilHTML;
	}
}
