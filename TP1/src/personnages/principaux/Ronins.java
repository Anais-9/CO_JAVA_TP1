package personnages.principaux;
import personnages.Humains;

public class Ronins extends Humains{
	private int honneur;
	
	public Ronins (String nom, int argent, String boisson) {
		super(nom,argent,boisson);
		this.honneur=1;
	}
	
	public void donner(int n, Commercants c) {
		c.recevoir(n);
	}
	
	public void provoquer(Yakuzas y) {
		if(this.honneur*2>y.getReputation()) {
			this.gagnerArgent(y.getArgent());
			this.honneur++;
			y.perdreDuel();
			this.parler("J'ai gagné le Duel!");
		}
		else {
			this.honneur--;
			this.parler("J'ai perdus mon duel...");
			y.gagnerDuel();
		}
	}
	
}
