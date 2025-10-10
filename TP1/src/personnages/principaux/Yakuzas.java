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
		return this.getClan();
	}
	public int getReputation() {
		return this.reputation;
	}
	
}
