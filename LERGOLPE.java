package main;

import java.util.Random;

public class LERGOLPE extends main {

	private static final long serialVersionUID = 1L;

	public static void LeAcao(Personagem A, time B, int IDGOLPE) {
		
		Move temp = A.Moveset.get(IDGOLPE);
		Random random = new Random();
		
		if(B.time.size()==0) {
			
		}else {
		
		int alvo = random.nextInt(B.time.size());
		
		
		if(temp.TIPO == 1) {
			System.out.println("\nCURA\n\n");
			calcura.CURA(temp,A,B,alvo);
		}else
		{
			calcdano.calculadora(A, B, alvo);
		}
	}
		
	}
	
	
	
	
	
	
}
