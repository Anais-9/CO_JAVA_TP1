package personnages.principaux;
import personnages.Humains;

public class Samourais extends Ronins{
	private String seigneur;
	
	public Samourais(String nom, int argent, String boisson, String seigneur) {
		super(nom,argent,boisson);
		this.seigneur = seigneur;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		String msg ="Je sers le seigneur: "+this.seigneur+".";
		this.parler(msg);
	}
	
	public void boire(String boisson) {
		String message = "Mmmm, un bon verre de "+boisson+" ! GLOUPS !";
		this.parler(message);
	}

}


