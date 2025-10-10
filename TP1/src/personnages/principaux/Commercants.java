package personnages.principaux;
import personnages.Humains;
public class Commercants extends Humains {
	
	public Commercants(String nom, int argent) {
		super(nom, argent, "thé");
	}
	
	public int seFaireExtroquer() {
		int totalArgent = this.getArgent();
		this.perdreArgent(this.getArgent());
		String texte = "Ouin Ouin, le monde est trop injuste";
		this.parler(texte);
		return totalArgent;
				
	}
	
	public void recevoir(int n) {
		this.gagnerArgent(n);
		String texte = "Merci";
		this.parler(texte);
	}
}
