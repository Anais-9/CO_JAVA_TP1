package histoires;
import personnages.Humains;
import personnages.principaux.*;


public class MonHistoire {
	public static void main(String[] agr) {
		Humains humain = new Humains("Prof", 10, "Porto");
		humain.direBonjour();
		humain.boire();
		
		Commercants commercant = new Commercants("Marchand",35);
		commercant.direBonjour();
		
		Yakuzas yakusa = new Yakuzas("Yaku le noir", 42,"biere", "WarSong");
		yakusa.direBonjour();
		yakusa.extorquer(commercant);
		
		Ronins ronin = new Ronins("Roro", 61, "sake");
		ronin.direBonjour();
		ronin.donner(10, commercant );
		ronin.provoquer(yakusa);
		ronin.direBonjour();
		
		Yakuzas y = new Yakuzas("Yaku", 10,"Soda", "WarSong");
		y.direBonjour();
		y.extorquer(commercant);
		y.direBonjour();
		
		ronin.donner(5, commercant);
		y.extorquer(commercant);
		ronin.donner(7, commercant);
		y.extorquer(commercant);
		
		y.extorquer(commercant);
		y.extorquer(commercant);
		
		ronin.provoquer(y);
	}
}
