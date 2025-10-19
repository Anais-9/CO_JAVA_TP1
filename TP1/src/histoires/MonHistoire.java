package histoires;
import personnages.Humains;
import personnages.principaux.*;


public class MonHistoire {
	public static void main(String[] agr) {
		Commercants c= new Commercants("Toto",10000);
		Yakuzas y= new Yakuzas("Hiro", 2000,"limonade","Humu");
		y.direBonjour();
		y.extorquer(c);
	}
}
