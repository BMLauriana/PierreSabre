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
	
}
