package main;


import java.awt.Canvas;
public class main extends Canvas implements Runnable{

	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 600, HEIGHT = WIDTH /12*9;
	protected static time timeA;
	protected static time timeB;
	protected static execAC ACAO;
	static boolean running = false;
	int contagemfalhas = 0;
	protected static int ntA, ntB, mortos = 0;
	//protected main main;
	
	//tenho que admitir, vou ter que refazer tudo
	
	public main() {
		start();//inicializa jogo
		run();//roda testes*
	}



	public static void main (String []args) {
		
		System.out.println("INICIANDO \n" );
		new main();
		
	}




	public void start() {
		//"COMEÇA" a partida em si, Thread talvez ajude
		
		running = true;
		timeA = new time();
		timeB = new time();
		
		ACAO = new execAC();
		
		
		//nick usuários
		timeA.DefTime("A");
		timeB.DefTime("B");
		
		
		//checar teambuilder
		//perhaps a melhor forma de fazer isso é ter um gerador de "texto" inicialmente, não deve ter a opção de mudar moveset
		timeA.adcionando(new Personagem("Golor", "A"));
		timeA.adcionando(new Personagem("Absovitae", "A"));
		timeA.adcionando(new Personagem("Island", "A"));
		
		timeB.adcionando(new Personagem("Purpurapur", "B"));
		timeB.adcionando(new Personagem("Miliatimor", "B"));
		timeB.adcionando(new Personagem("Miku", "B"));
		
		
		//define número de arautos
		ntA = timeA.Nlef();
		ntB = timeB.Nlef();
		
		//teste
		timeA.checatime();
		timeB.checatime();
		
		
		//roda
		//run();
		
	}
		
	public void run() {
		//VER O QUE FAZER DISSO.
		while(running) {
		ACAO.acao(timeA,timeB);
		//CHECAGEM();
		}
		
	}
	
	public static int CHECAGEM() {
		//CHECAGEM DE FIM DE TURNO(vitoria, derrota, mortes, BUFFS)
		
		int SizeA = timeA.time.size();
		int SizeB = timeB.time.size();
		
		//PARECE QUE TEM ALGO ERRADO
		
		System.out.println("Time A");
		
		for(int i = 0; i<SizeA; i++) {
			Personagem temp = timeA.Get(i);
			System.out.print(temp.nome + "|||" + temp.vida + "/" + temp.vidaMAX);
			if(temp.VIVO == false) {System.out.println(" RETIRADO, MORTO ");timeA.retirando(temp);SizeA=timeA.time.size();mortos++;
			}else {System.out.println("");}
		}
			
		
		System.out.println("\nTime B");
		for(int i = 0; i<SizeB; i++) {
			Personagem temp = timeB.Get(i);

			System.out.print(temp.nome + "|||" + temp.vida + "/" + temp.vidaMAX);
			
			if(temp.VIVO == false) {System.out.println(" RETIRADO, MORTO ");
			timeB.retirando(temp);SizeB=timeB.time.size();mortos++;}else {System.out.println("");}

			if(SizeA==0 && SizeB == 0) {running=false;System.out.println("\nEMPATE"); return 0;
			}else if(SizeA == 0){running=false;System.out.println("\nTime B GANHOU"); return 0;
			}else if(SizeB == 0) {running=false;System.out.println("\nTime A GANHOU"); return 0;
			}
		
		
		}
		
		System.out.println("");
		
		
	

	return mortos;//SERÁ MUDADO FUTURAMENTE
}
	
	
}