package personnages.principaux;
import personnages.Humains;

public class Ronins extends Humains{
	private int honneur;
	
	public Ronins (String nom, int argent, String boisson) {
		super(nom,argent,boisson);
		this.honneur=1;
	}
	
	public void donner(int n, Commercants c) {
		String msg = "Tiens Marchant voilà "+n+" sous.";
		this.parler(msg);
		c.recevoir(n);
		this.perdreArgent(n);
	}
	
	public void provoquer(Yakuzas y) {
		if(this.honneur*2>y.getReputation()) {
			this.honneur++;
			int gagnerArgent =y.perdreDuel();
			this.gagnerArgent(gagnerArgent);
			this.parler("J'ai gagné le Duel!");
		}
		else {
			this.honneur--;
			this.parler("J'ai perdus mon duel...");
			y.gagnerDuel();
		}
	}
	
}
