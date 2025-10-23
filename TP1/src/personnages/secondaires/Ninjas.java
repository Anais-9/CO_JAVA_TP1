package personnages.secondaires;
import java.util.Random;

import personnages.principaux.*;

public class Ninjas extends Yakuzas{
	private String clanSecret;
	private static final String [] clansNinja = {"of Shadows", "of Mist", "of Clouds", "of Fog", "of Darkness"};
	
	public Ninjas (String nom, int argent, String boisson, String clan ) {
		super(nom,argent,boisson,clan);
		Random r = new java.util.Random();
		switch(r.nextInt(1,5)) {
		case 1 -> this.clanSecret = clansNinja[1];
		case 2 -> this.clanSecret = clansNinja[2];
		case 3 -> this.clanSecret = clansNinja[3];
		case 4 -> this.clanSecret = clansNinja[4];
		case 5 -> this.clanSecret = clansNinja[5];

		}
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		String msg="(mon clan secret est "+this.getClan()+" "+this.clanSecret+" et maintenant que tu le sais, je vais devoir te tuer)";
		this.parler(msg);
	}

}
