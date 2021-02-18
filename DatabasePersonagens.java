package main;

public class DatabasePersonagens {

	//COMO FAZ UMA DATABASE MELHOR KKKK
	
	
	public static void get(Personagem A) {
		//A.setStats(vida, ataque, defesa, velocidade),
		
		
		if(A.nome == "Absovitae") {
			A.setStats(170, 3, 4, 7);
			DatabaseMoves.Get("Drain", A);
			DatabaseMoves.Get("Placeholder", A);
			DatabaseMoves.Get("Cura", A);
		}else
		if(A.nome == "Purpurapur" ) {
			A.setStats(240,1,8,1);
			DatabaseMoves.Get("Bash", A);
			DatabaseMoves.Get("Stomp", A);
			DatabaseMoves.Get("Slam", A);
		}else
		if(A.nome == "Island" ) {
			A.setStats(200,4,6,3);
			DatabaseMoves.Get("Bash", A);
			DatabaseMoves.Get("Punch", A);
			DatabaseMoves.Get("Placeholder", A);
		}else
		if(A.nome == "Golor") {
			A.setStats(180, 5, 5, 5);
			DatabaseMoves.Get("Punch", A);
			DatabaseMoves.Get("Absorb", A);
			DatabaseMoves.Get("Placeholder", A);
		}else
		if(A.nome == "Miliatimor") {
			A.setStats(160,7,3,3);
			DatabaseMoves.Get("Puncture", A);
			DatabaseMoves.Get("Slam", A);
			DatabaseMoves.Get("Roots", A);
		}else
		if(A.nome == "Miku") {
			A.setStats(170,4,5,6);
			DatabaseMoves.Get("Mic Bash", A);
			DatabaseMoves.Get("Heal", A);
			DatabaseMoves.Get("Placeholder", A);
		}else {
	}

	
	
}
}
