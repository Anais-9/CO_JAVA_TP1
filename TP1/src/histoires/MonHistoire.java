package histoires;
import personnages.Humains;
import personnages.principaux.*;


public class MonHistoire {
	public static void main(String[] agr) {
		Commercants c= new Commercants("Toto",10000);
		Yakuzas y= new Yakuzas("Hiro", 2000,"limonade","Humu");
		y.direBonjour();
		y.extorquer(c);
		
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
