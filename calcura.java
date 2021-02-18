package main;

import java.util.Random;

public class calcura extends main {

	private static final long serialVersionUID = 1L;

	public static void CURA(Move move, Personagem user, time time, int id) {
		
		  Personagem ALVO = time.Get(id);
		  
		  if(ALVO.VIVO == false) {
	       	  System.out.println(user.nome + " ia curar " + ALVO.nome + " mas o alvo morreu");
	         }else if(user.VIVO == false) {
	       	  System.out.println(user.nome + " morreu antes de poder curar");
	         }else{
		  
		  
		  
		  Random random = new Random();
	      int ATK = user.ataque;
	      int BASE = move.BASE;
	      int DEF = ALVO.defesa;
	      int vida = ALVO.vida;
	      double CalcCura;

	
	      int rand = random.nextInt((12-8) + 1) + 8;
	     
	      
	      CalcCura = (BASE + BASE*(ATK-DEF)*0.1) * rand*0.1;
	      ALVO.vida=ALVO.vida + (int)CalcCura;
	      
	      System.out.println( user.nome + " do time " + user.time.nomeT +" CURA " + ALVO.nome + " do time " + ALVO.time.nomeT +" com " + move.nome);
	      System.out.println( vida + " + " + (int) CalcCura + " = " + ALVO.vida);
	         }
	}
	
	
		
	
}
