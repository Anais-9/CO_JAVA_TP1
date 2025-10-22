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
		ronin.donner(10, commercant );
		ronin.provoquer(yakusa);
		ronin.direBonjour();
	}
}
