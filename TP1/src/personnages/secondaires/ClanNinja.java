package personnages.secondaires;

public class ClanNinja {
	private final static String[] clansNinja = {"of Shadows", "of Mist", "of Clouds", "of Fog", "of Darkness"};
	private String clan;
	
	public ClanNinja(String clan) {
		this.clan = clan;
	}
	
	public final static String[] getClans() {
		return ClanNinja.clansNinja;
	}
	
	public String getClan() {
		return this.clan;
	}
}
