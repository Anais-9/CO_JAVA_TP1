package personnages.secondaires;
import personnages.principaux.*;

public class Ninjas extends Yakuzas{
	private String clanSecret;
	private static final String [] clansNinja = {"of Shadows", "of Mist", "of Clouds", "of Fog", "of Darkness"};
	
	public Ninjas (String nom, int argent, String boisson, String clan ) {
		super(nom,argent,boisson,clan);
	}

}
