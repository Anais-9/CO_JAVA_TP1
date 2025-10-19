package personnages.principaux;
import personnages.Humains;

public class Samourais extends Ronins{
	String seigneur;
	
	public Samourais(String nom, int argent, String boisson, String seigneur) {
		super(nom,argent,boisson);
		this.seigneur = seigneur;
	}
	
	@Override
	public void direBonjour() {
		String message="Bonjour ! Je m'appelle "+ this.getNom() +" et j'aime boire du "+this.getBoisson()+". Je sers le seigneur: "+this.seigneur+".";
		this.parler(message);
	}
	
	public void boire(String boisson) {
		String message = "Mmmm, un bon verre de "+boisson+" ! GLOUPS !";
		this.parler(message);
	}

}

class Test{
	public static void main(String[] args) {
		Samourais s = new Samourais("Akimoto",20,"the","Miyamoto");
		s.direBonjour();
		s.boire();
		s.boire("café");
		int argent = s.getArgent();
		System.out.println(argent);
		s.gagnerArgent(2);
		argent =s.getArgent();
		System.out.println(argent);

	}
}
