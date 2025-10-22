package personnages.secondaires;
import personnages.Humains;
import java.util.Random;

public class GrandMere extends Humains {
	int nbConnaissances;
	Random r;
	
	public GrandMere(String nom) {
		super(nom,0,"Tisane");
	}
	
	private String humainHasard() {
		return "";
	}
	
	public void ragoter() {
		
	}
	
	public void faireConnaissanceAvec(Humains h) {
		
	}
}
