package Auberge;
import personnages.*;


public class Auberge {
	private static Humains[] clients;
	private String nom;
	
	public Auberge(String nom, int capacite) {
		this.nom = nom;
		Auberge.clients = new Humains[capacite];
	}
	
	public void nouvelArrivant(Humains h) {
		int max = 0;
		while (max<clients.length) {
			if (clients[max] == null) {
				clients[max] = h;
				h.direBonjour();
				for(Humains personne:clients) {
					if (personne != null) {
						personne.direBonjour();
					}
				}
			}
			max++;
		}
		if (max-1 == clients.length && clients[max]!=h) {
			System.out.println("L'auberge est pleine");
		}
	}
	
	public void payerLaTournee(Humains h) {
	}
	
	public void fight() {
		
	}
}
