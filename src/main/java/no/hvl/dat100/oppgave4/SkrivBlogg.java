package no.hvl.dat100.oppgave4;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	static String MAPPE_STR = System.getProperty("user.dir") + "/src/no/hvl/dat100/oppgave4/";
	
	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		
		boolean gikkFint = false;
		
		String content = samling.toString();
		
		File fil = new File(mappe, filnavn);
		
		//filnavn = JOptionPane.showInputDialog("Hva er filnavnet på dokumentet du ønsker å skrive til?");
		
		try (PrintWriter printWriter = new PrintWriter(fil)) {
		printWriter.write(content);
		gikkFint = true;
		} catch (IOException e) {
			gikkFint = false;
			e.printStackTrace();
		}
			
		return gikkFint;
	}
}
