package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	
	public Humain(String nom, String boissonfavorite, int argent) {
		super();
		this.nom = nom;
		this.boissonFavorite = boissonfavorite;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}

//	public void setNom(String nom) {
//		this.nom = nom;
//	}

	public int getArgent() {
		return argent;
	}

//	public void setArgent(int argent) {
//		this.argent = argent;
//	}

	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle"+ nom +" et j'aime boire du "+ boissonFavorite);
	}
	
	
	public void boire(String boisson) {
		parler("Mmmm, un bon verrre de" + boisson+" ! GLOUPS !");
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + " « " + texte + " » ");
	}
	
	private String prendreParole() {
		return nom + " : ";
	}
	
	private void gagnerArgent(int gain){
		argent += gain;
	}
	
	private void perdreArgent(int gain){
		argent -= gain;
	}
	
	public void acheter(String bien, int prix){
		if (prix>argent) {
			parler("J'ai"+ argent + "sous en poche. Je ne peux même pas m'offir" + bien + "a"+ prix + "sous." );
		}else {
			parler("J'ai"+ argent + "sous en poche. Je vais pouvoir m'offir" + bien + "a"+ prix + "sous." );
		}
	}
	
}







//public class Coommerçant extends Humain{}