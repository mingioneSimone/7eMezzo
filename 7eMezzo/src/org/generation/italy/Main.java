package org.generation.italy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> carte=new ArrayList<>();		
		HashSet<Integer> estratte=new HashSet<>();		
		String[] semi= {"denari", "bastoni", "coppe", "spade"};
		float punteggio=0;
		int pos;
		String risposta="";
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		ArrayList <String> giocatori=new ArrayList<>();
		int nplay;
		String nomi;
////////////////////////////////////////////////////////////////genero le carte 
		for (int s=0;s<4;s++) {
			for (int i=1;i<=10;i++) {
				carte.add(i+" di "+semi[s]);
		}
		}
		System.out.println("inserisci numero giocatori: ");
		nplay=Integer.parseInt(sc.nextLine());
		System.out.println("inserisci nickname giocatori:");
		for(int g=0;g<nplay;g++) {
			giocatori.add(nomi=sc.nextLine());
		}
////////////////////////////////////////////////////////////////////estrazione di una carta
		
		do {
			do {
				pos=r.nextInt(40);		
			} while (estratte.contains(pos));	
			estratte.add(pos);		
			System.out.println("E' uscito: "+carte.get(pos));
			
			pos=pos%10;		
			
			if (pos<7)
				punteggio+=pos+1;
			else
				punteggio+=0.5f;
			
			System.out.println("Punteggio: "+punteggio);
			
			if (punteggio>7.5f)
				
				System.out.println("Hai sballato!");
			
			else if (punteggio<7.5f) {
				System.out.println("\nVuoi continuare (s/n)");
				risposta=sc.nextLine();	
			}
			
		} while(risposta.equals("s") && punteggio<7.5);
		
		System.out.println("Grazie e arrivederci!");
		
		
		
		//da completare
		sc.close();
	}

}