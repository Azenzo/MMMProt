package main;

public class DatabaseMoves {

	
	static int A = 0, C=1 , O=2, B=3, D=4;
	
	//ERRADO POR ENQUANTO!!!
	public static void Get(String Golpe, Personagem A ) {
		
		String NOME = null;
		int BASE=0, ORIGEM=0, PRIORITY=0,TIPO=0;
		
		if(Golpe == "Mic Bash") {
			NOME = Golpe;
			TIPO = O;
			BASE = 25;
			ORIGEM = 0;
			PRIORITY = 0;
		}
		if(Golpe == "Heal") {
			NOME = Golpe;
			TIPO = C;
			BASE = 25;
			ORIGEM = 0;
			PRIORITY = 0;
		}
		if(Golpe == "Placeholder") {
			NOME = Golpe;
			TIPO = O;
			BASE = 20;
			ORIGEM = 0;
			PRIORITY = 0;
		}
		if(Golpe == "Drain") {
			NOME = Golpe;
			TIPO = O;
			BASE = 20;
			ORIGEM = 0;
			PRIORITY = 0;
		}
		if(Golpe == "Bash") {
			NOME = Golpe;
			TIPO = O;
			BASE = 30;
			ORIGEM = 0;
			PRIORITY = 0;
		}
		if(Golpe == "Stomp") {
			NOME = Golpe;
			TIPO = O;
			BASE = 20;
			ORIGEM = 0;
			PRIORITY = 0;
		}
		if(Golpe == "Slam") {
			NOME = Golpe;
			TIPO = O;
			BASE = 50;
			ORIGEM = 0;
			PRIORITY = 0;
		}
		if(Golpe == "Punch") {
			NOME = Golpe;
			TIPO = O;
			BASE = 35;
			ORIGEM = 0;
			PRIORITY = 0;
		}
		if(Golpe == "Absorb") {
			NOME = Golpe;
			TIPO = O;
			BASE = 25;
			ORIGEM = 0;
			PRIORITY = 0;
		}
		if(Golpe == "Puncture") {
			NOME = Golpe;
			TIPO = O;
			BASE = 70;
			ORIGEM = 0;
			PRIORITY = 0;
		}
		if(Golpe == "Roots") {
			NOME = Golpe;
			TIPO = C;
			BASE = 30;
			ORIGEM = 0;
			PRIORITY = 0;
		}
		
		Move move = new Move(NOME,TIPO,BASE,ORIGEM,PRIORITY);
		A.Moveset.add(move);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
