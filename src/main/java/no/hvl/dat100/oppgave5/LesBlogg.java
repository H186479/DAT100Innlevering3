package no.hvl.dat100.oppgave5;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;
import no.hvl.dat100.oppgave2.*;
import no.hvl.dat100.oppgave3.*;

import javax.swing.JOptionPane;

import org.apache.maven.surefire.shared.io.input.ReaderInputStream;

public class LesBlogg {

	private static String TEKST = "TEKST";
	private static String BILDE = "BILDE";

	public static Blogg les(String mappe, String filnavn) {
		
		Blogg blogg = new Blogg();
		File fil = new File(mappe,filnavn);
		
		try (Scanner reader = new Scanner(fil)) {
			while (reader.hasNextLine()) {
				String linje = reader.nextLine();
				Innlegg innlegg = null;
				
				if (linje.equals(TEKST)) {
					int id = Integer.parseInt(reader.nextLine());
					String bruker = reader.nextLine();
					String dato = reader.nextLine();
					String tekst = reader.nextLine();
					innlegg = new Tekst(id, bruker, dato, tekst);
				}
				if (linje.equals(BILDE)) {
					int id = Integer.parseInt(reader.nextLine());
					String bruker = reader.nextLine();
					String dato = reader.nextLine();
					String tekst = reader.nextLine();
					String url = reader.nextLine();
					innlegg = new Bilde(id, bruker, dato, tekst, url);
				}
				
				if (innlegg != null) {
					blogg.leggTil(innlegg);
				}
				
			}
		} catch (IOException e) {
			System.out.println("Lesingen fra fikk gikk galt.");
			e.printStackTrace();
		}
		return blogg;
	}
}
