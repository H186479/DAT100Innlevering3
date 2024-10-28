package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

public abstract class Innlegg {
	
	protected int id;
	protected String bruker;
	protected String dato;
	protected int likes;

	// TODO - deklarering av objektvariable
	
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = 0;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
	}
	
	public String getBruker() {
		return bruker;

	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {
		return dato;
		
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getId() {
		return id;

	}

	public int getLikes() {
		return likes;

	}
	
	public void doLike () {
		this.likes += 1;
	}
	
	public boolean erLik(Innlegg innlegg) {
		if (innlegg.getId() == getId()) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		String tilStreng = id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
				return tilStreng;
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		String tilHTML = "<h2>" + bruker + "@" + dato + "[" + id + "]" + "</h2>" + "\n" + "<p>" + "DAT100 Oppgave 6" + "</p> \n";
		
		return tilHTML;
	}
}
