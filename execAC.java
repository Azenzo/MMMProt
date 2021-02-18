package main;


import java.util.Random;

public class execAC{
		
	int mortos = 0;
	 
	
	
	public void GerarLista(time A, time B, Personagem[] ACAO) {
		
		//pega todos os arautos dos times
		
		for(int i = 0; i<A.time.size();i++) {
			Personagem temp = A.Get(i);
			ACAO[i] = temp;
		}
		for(int ii = 0; ii<B.time.size();ii++) {
			Personagem temp = B.Get(ii);
			ACAO[A.time.size() + ii] = temp;
		}
		
		
	}
	
	
	
	
	public void acao(time A, time B) {
		
		//mortos = main.CHECAGEM();
		
		Personagem[] ACAO = new Personagem[6-mortos];
		time selecao;
		GerarLista(A,B, ACAO);
		Ordem(ACAO);//REORDENA O ARRAY DE PERSONAGENS
		Print(ACAO);//printa a ordem de Ação
		
		Random random = new Random();
		
		int golpe,TIMEALVO;
		
		//RANDOM PARA SIMULAR A ESCOLHA...
		
		 	for(int i = 0; i<ACAO.length;i++) {
		 		Personagem temp = ACAO[i]; 
		 		golpe = random.nextInt(3);
				TIMEALVO = random.nextInt(2);
				
		 		if(temp.time.nomeT == A.nomeT) {
		 			if(TIMEALVO==0)LERGOLPE.LeAcao(temp, B, golpe);
		 			if(TIMEALVO==1)LERGOLPE.LeAcao(temp, A, golpe);
		 		}else if(temp.time.nomeT == B.nomeT) {
		 			if(TIMEALVO==1)LERGOLPE.LeAcao(temp, B, golpe);
		 			if(TIMEALVO==0)LERGOLPE.LeAcao(temp, A, golpe);
		 		}
		 		
		 	}
		 
		  //CHECA QUAIS ARAUTOS MORRERAM E SE ACABOU O JOGO
		 	mortos = main.CHECAGEM();
		 }
	
	
	public void Print(Personagem[] ACAO) {
		//printa ordem de Ação
		for(int iii = 0; iii<ACAO.length;iii++) {
			System.out.print(ACAO[iii].nome + " vel = " + ACAO[iii].getVel() + " -> " );
		
			}
		System.out.println("");
		
	}
	
	public void Ordem(Personagem[] ACAO) {
		//ORDENA, bubble sort por ser, no pior caso, 6
		
		for(int i = 0; i<ACAO.length-1;i++) {
			  
			for(int ii = 0; ii<ACAO.length-1;ii++) {
				
				if(ACAO[ii].getVel()<ACAO[ii+1].getVel()) {
					
					Personagem temp = ACAO[ii];
					
					ACAO[ii] = ACAO[ii+1];
					ACAO[ii+1] = temp;	
				}
				
			}
		}
	}
	
	}
	
	
	

