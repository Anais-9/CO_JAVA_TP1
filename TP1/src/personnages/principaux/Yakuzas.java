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
		String msg = "Je viens d'extorquer un commercant";
		this.parler(msg);
	}
	
	public void gagnerDuel() {
		this.reputation+=1;
		this.parler("J'ai gagné le duel !");
		
	}
	
	public int perdreDuel() {
		int argentPerdue = this.getArgent();
		String msg="J'ai perdu le duel et mes "+argentPerdue+" sous...";
		this.parler(msg);
		this.perdreArgent(argentPerdue);
		this.reputation-=1;
		return argentPerdue;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		String message="J'appartiens au clan "+this.Clan+".";
		this.parler(message);
	}
	
}




