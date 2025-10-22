package personnages.secondaires;
import personnages.principaux.*;

public class Colporteurs extends Commercants{

	public Colporteurs(String nom, int argent) {
		super(nom,argent);
	}
	
	@Override
	public int seFaireExtroquer() {
		int totalArgent = this.getArgent()/2;
		this.perdreArgent(totalArgent);
		String texte = "J'ai tout perdu! le monde est trop injuste";
		this.parler(texte);
		return totalArgent;
	}
}
