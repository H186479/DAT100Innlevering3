package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	// TODO: objektvariable 
	protected Innlegg[] innleggtabell;
	protected int nesteLedig;

	public Blogg() {
		this.innleggtabell = new Innlegg[20];
		this.nesteLedig = 0;
	}

	public Blogg(int lengde) {
		this.innleggtabell = new Innlegg[lengde];
		this.nesteLedig= 0;
	}

	public int getAntall() {
		return nesteLedig;
			
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		int finnesDet = 0;
		for (int i = 0; i < nesteLedig; i++) 
				if (innleggtabell[i].erLik(innlegg)) {
					finnesDet = i;
					break;
			} else {
		finnesDet = -1;
			}
		return finnesDet;
	}
	
	public boolean finnes(Innlegg innlegg) {
		for (int i = 0; i <innleggtabell.length; i++) {
			if (innleggtabell[i] != null && innleggtabell[i].getId() == innlegg.getId()) {
				return true;
			}
		}
		return false;
		}
	
	public boolean ledigPlass() {
		if (nesteLedig < innleggtabell.length) {
			return true;
		}
		return false;

	}
	
	public boolean leggTil(Innlegg innlegg) {
		if (nesteLedig < innleggtabell.length) {
			innleggtabell[nesteLedig] = innlegg;
			nesteLedig ++;
			return true;
		} else {
			return false;
		}
		
	}
	
	public String toString() {
		String tilStreng = nesteLedig + "\n";
		for (int i = 0; i < innleggtabell.length; i++) {
			tilStreng += innleggtabell[i] + "\n";
		}
		return tilStreng;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}