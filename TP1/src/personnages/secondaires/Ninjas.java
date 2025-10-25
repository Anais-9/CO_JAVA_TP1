package personnages.secondaires;
import java.util.Random;

import personnages.principaux.*;

public class Ninjas extends Yakuzas{
	private String clanSecret;
	private static final int SEUILARGENT = 20;
	private ClanNinja clanSecretObject;
	private static final String [] CLANSNINJA = {"of Shadows", "of Mist", "of Clouds", "of Fog", "of Darkness"};
	private Commercants memoire;
	
	public Ninjas (String nom, int argent, String boisson, String clan ) {
		super(nom,argent,boisson,clan);
		Random r = new java.util.Random();
		switch(r.nextInt(1,5)) {
		case 1 -> this.clanSecret = CLANSNINJA[1];
		case 2 -> this.clanSecret = CLANSNINJA[2];
		case 3 -> this.clanSecret = CLANSNINJA[3];
		case 4 -> this.clanSecret = CLANSNINJA[4];
		case 5 -> this.clanSecret = CLANSNINJA[5];

		}
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		String msg="(mon clan secret est "+this.getClan()+" "+this.clanSecret+" et maintenant que tu le sais, je vais devoir te tuer)";
		this.parler(msg);
	}
	
	private int extorquerMefiant(Commercants c) {
		int argent = this.getArgent();
		super.extorquer(c);
		int argentGain = this.getArgent();
		return argentGain-argent;
	}
	
	@Override
	public void extorquer(Commercants c) {
		int gain = this.extorquerMefiant(c);
		if (gain<SEUILARGENT) {
			this.memoire = c;
			this.revenirExtorquer();
		}
	}
	
	public void revenirExtorquer() {
		int montant=this.extorquerMefiant(memoire);
		while(montant<SEUILARGENT) {
			montant  = this.extorquerMefiant(memoire);
		}
	}

}






















