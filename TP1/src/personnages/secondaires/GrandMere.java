package personnages.secondaires;
import personnages.Humains;
import personnages.principaux.*;
import java.util.Random;

public class GrandMere extends Humains {
	private int nbConnaissances;
	private Humains[] memoire = new Humains [30];
	private Random r = new java.util.Random();
	
	public GrandMere(String nom) {
		super(nom,0,"Tisane");
		this.nbConnaissances = 0;
	}
	
	private String humainHasard() {
		String humain="";
		for (int i = 0;i<30;i++) {
			humain = switch(r.nextInt(1,4)) {
			case 1 -> humain = "Commercant";
			case 2 -> humain = "Ronin";
			case 3 -> humain = "Yakuza";
			case 4 -> humain = "Samourai";
			default -> humain="";

			};
		}
		return humain;
	}
	
	public void ragoter() {
		String msg ="";
		for(int i=0;i<this.nbConnaissances;i++) {
			if (this.memoire[i] instanceof Traitres) {
				msg = "Je sais que "+this.memoire[i].getNom()+" est un traître";
			}
			else {
				msg = "Je crois que "+this.memoire[i].getNom()+" est un "+humainHasard();
			}
			this.parler(msg);
		}
	}
	
	public void faireConnaissanceAvec(Humains h) {
		if (this.nbConnaissances<30){
			this.memoire[this.nbConnaissances] = h;
			this.nbConnaissances ++;
		}
		else {
			String msg ="Je connais trop de monde ma mémoire va me faire défaut";
			this.parler(msg);
		}
	}
}
