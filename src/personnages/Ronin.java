package personnages;

public class Ronin extends Humain{
	private int honneur = 1;

	public Ronin(String nom, String boissonfavorite, int argent) {
		super(nom, boissonfavorite, argent);	}
	
	public void donner(Commercant beneficiaire) {
		int argentRonin = getArgent();
		int don = (int) (argentRonin*0.1) ;
		parler(beneficiaire.getNom()+" prend ces "+ don +" sous.");
		perdreArgent(don);
		beneficiaire.recevoir(don);
	}
	
	public void provoquer(Yakuza adversaire) {
		if (2*honneur>=adversaire.getReputation()) {
			int gain = adversaire.getArgent();
			gagnerArgent(gain);
			honneur += 1; //gagne combien en honneur ?
			parler("Je t'ai retrouve vermine, tu vas payer ce que tu as fait a ce pauvre marchand!");
			parler("Je t'ai eu petit yakusa!");
			adversaire.perdre();
		}else {
			honneur -= 1;
			int perte = getArgent();
			perdreArgent(perte);
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup.");
			adversaire.gagner(perte);
			
		}
		
	}
	
}
