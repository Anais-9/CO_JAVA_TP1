package personnages.principaux;
import personnages.Humains;

public class Yakuzas extends Humains {
	private String Clan;
	private int reputation;
	
	public Yakuzas(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson);	
		this.Clan = clan;
		this.reputation = 0;
	}
	
	public String getClan() {
		return this.Clan;
	}
	public int getReputation() {
		return this.reputation;
	}
	
	public void extorquer(Commercants c) {
		int gagnerArgent;
		gagnerArgent = c.seFaireExtroquer();
		this.gagnerArgent(gagnerArgent);
		this.reputation+=1;
		this.parler("Je viens d'extorquer un commercant");
	}
	
	public void gagnerDuel() {
		this.reputation+=1;
		this.parler("J'ai gagné le duel !");
	}
	
	public void perdreDuel() {
		this.perdreArgent(this.getArgent());
		this.reputation-=1;
		this.parler("J'ai perdu le duel...");
	}
	
	@Override
	public void direBonjour() {
		String message="Bonjour ! Je m'appelle "+ this.getNom() +" et j'aime boire du "+this.getBoisson()+". J'appartiens au clan "+this.Clan+"!!!";
		this.parler(message);
	}
	
}




