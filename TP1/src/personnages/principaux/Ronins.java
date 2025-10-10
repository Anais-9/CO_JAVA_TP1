package personnages.principaux;
import personnages.Humains;

public class Ronins extends Humains{
	private int honneur;
	
	public Ronins (String nom, int argent, String boisson) {
		super(nom,argent,boisson);
		this.honneur=1;
	}
	
}
