package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {
	public static void main(String[] args){
		Humain prof = new Humain("Prof", "Kombucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire("Kombucha");
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		
		Commercant marco = new Commercant("Marco","Thé",20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire("thé");
		
		Yakuza yaku = new Yakuza("Yaku Le Noir", "Whiski", 30, "Warsong" );
		yaku.direBonjour();
		yaku.extorquer(marco);
		//System.out.println(yaku.getReputation());
		
		Ronin roro = new Ronin("Roro", "Shochu",60);
		roro.direBonjour();
		roro.donner(marco);
		
		

	}
}
