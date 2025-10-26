package personnages.principaux;
import personnages.*;

public class Commercants extends Humains implements IPleutre{
	
	public Commercants(String nom, int argent) {
		super(nom, argent, "thé");
	}
	
	public int seFaireExtroquer() {
		int totalArgent = this.getArgent();
		this.perdreArgent(totalArgent);
		String texte = "J'ai tout perdu! le monde est trop injuste";
		this.parler(texte);
		return totalArgent;
				
	}
	
	public void recevoir(int n) {
		this.gagnerArgent(n);
		String msg = "Merci";
		this.parler(msg);
	}
	
	@Override
	public void fuir() {
		
	}
}
