package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	

	public Yakuza (String nom, String boissonfavorite, int argent, String clan) {
		super(nom,boissonfavorite,argent);	
		this.clan = "clan";
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() +", si tu tiens a la vie donne moi ta bourse !");
		int argentvole = victime.seFaireExtorquer();
		gagnerArgent(argentvole);
		reputation += 1;
		parler("J'ai pique les "+ argentvole + " sous de " + victime.getNom() + " ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !");
	}

//	public int getReputation() {
//		return reputation;
//	}
	
	public int getReputation() {
		return reputation;
	}
	
	
	public int perdre() {
		int argentdepart = getArgent();
		perdreArgent(argentdepart);
		reputation -= 1;
		parler("J'ai perdu mon duel et mes "+ argentdepart +" sous, snif... J'ai déshonoré le clan" + clan);
		return argentdepart;
	}
	

	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation += 1;
		parler("Ce ronin pensait vraiment battre " + getNom() + "du clan de "+ clan +" ? \nJe l'ai depouille de ses "+ gain +" sous."  );
	}
	
	
}
