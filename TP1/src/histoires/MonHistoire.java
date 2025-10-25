package histoires;
import personnages.Humains;
import personnages.principaux.*;
import personnages.secondaires.*;

public class MonHistoire {
	public static void main(String[] agr) {
		//Humains humain = new Humains("Prof", 10, "Porto");
		//humain.direBonjour();
		//humain.boire();
		
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
		
		Samourais s = new Samourais("Samourais", 100, "Soda", "S");
		s.boire("thé");
		s.boire();
		s.direBonjour();
		s.donner(20, commercant);
		s.provoquer(y);
		
		Traitres t = new Traitres("Ti",10,"Jus","S");
		t.extorquer(commercant);
		t.extorquer(commercant);
		t.direBonjour();
		t.faireLeGentil(commercant, 25);
		t.direBonjour();
		t.boire("Soda");
		
		GrandMere GM = new GrandMere("GM1");
		GM.direBonjour();
		GM.faireConnaissanceAvec(commercant);
		GM.faireConnaissanceAvec(yakusa);
		GM.faireConnaissanceAvec(ronin);
		GM.faireConnaissanceAvec(y);
		GM.faireConnaissanceAvec(s);
		GM.faireConnaissanceAvec(t);
		GM.ragoter();
		
		Colporteurs C1 = new Colporteurs("Colp",5);
		C1.direBonjour();
		y.extorquer(C1);
		C1.direBonjour();
		
		Ninjas n = new Ninjas("Ninja",10,"Soda","Clan");
		n.direBonjour();
		n.extorquer(C1);
		n.direBonjour();
	}
}
