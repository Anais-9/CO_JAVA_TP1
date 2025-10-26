package Auberge;
import personnages.*;
import personnages.principaux.*;
import personnages.secondaires.*;


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
				for(Humains personne: clients) {
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
		h.perdreArgent(5);
		for (Humains personne: clients) {
			if (personne != null) {
				personne.boire();
			}
		}
	}
	
	public void fight() {
		for (Humains personne: clients) {
			if(personne instanceof Traitres ) {
				((Traitres)personne).fuir();;
			}
			else if(personne instanceof Commercants ) {
				((Commercants)personne).fuir();;
			}
			//else if(personne instanceof Samourais ) {
				//((Samourais)personne).combattre();;
			//}
			//else if(personne instanceof Yakuzas ) {
				//((Yakuzas)personne).combattre();;
			//}
		}
	}
}
