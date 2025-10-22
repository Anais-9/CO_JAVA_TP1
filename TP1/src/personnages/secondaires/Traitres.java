package personnages.secondaires;
import personnages.*;
import personnages.principaux.*;
public class Traitres extends Samourais{
	private float traitrise;
	
	public Traitres(String nom, int argent, String boisson, String seigneur) {
		super(nom,argent,boisson,seigneur);
	}
	
	public void extorquer (Commercants c) {
		if (this.traitrise<3) {
			int gagnerArgent;
			gagnerArgent = c.seFaireExtroquer();
			this.gagnerArgent(gagnerArgent);
			this.traitrise+=1;
			String msg = "Je viens d'extorquer un commercant";
			this.parler(msg);
		}
		else {
			String msg = "Je ne peux plus extorquer...";
			this.parler(msg);
		}
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		String msg="Mon niveau de traîtrise est de "+this.traitrise;
		this.parler(msg);
	}
	
	public void faireLeGentil(Humains h, int argent) {
		h.gagnerArgent(argent);
		this.perdreArgent(argent);
		
		float diminue = this.traitrise /10;
		if (this.traitrise - diminue <0) {
			this.traitrise-=this.traitrise;
		}
		else {
			this.traitrise -=diminue;
		}
		
		String msg = "Je fais amis-amis";
		this.parler(msg);
		
	}
}
