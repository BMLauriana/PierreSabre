package personnages;

public class Commercant extends Humain {
	public Commercant(String nom, String boissonfavorite, int argent) {
		super(nom,boissonfavorite,argent);	
		}
	//est ce qu'il faut faire en sorte que la boisson favorite soit toujours le Thé ?
	
	public int seFaireExtorquer() {
		int sommeargent = getArgent();
		parler("J'ai tout perdu! Le monde est injuste...");
		return sommeargent;
	}
	
	public void recevoir(int argent) {
		 parler(argent + " sous ! Je te remercie genereux donateur!");
		 //comment modifier agent on rajoute un setter dans la classe humain ?
	}
	
	
	
}
