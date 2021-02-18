package main;

import java.util.LinkedList;

public  class Personagem {
		//IRONICAMENTE TEM NADA AQUI
	
		LinkedList<Move> Moveset = new LinkedList<Move>();
		//LinkedList<BUFFS> buffs = new LinkedList<BUFFS>();
		protected time time;
		protected String nome;
		protected int vida, vidaMAX, ataque, defesa,vel, contDANO;
		protected boolean VIVO = true;
		
		public Personagem(String nome, String TIME) {
			this.nome = nome;	
			
			initialize();
		}
		
		public int getVel() {
			return this.vel;
		}
		
		public void initialize() {
			
			DatabasePersonagens.get(this);
			//CONSIDERANDO FAZER 3 CHAMADAS PARA CADA GOLPE PARA FACILITAR MANUTENÇÃO, CONTUDO O MOVESET É PREDEFINIDO
			
		}
		public void setStats(int a, int b, int c, int d) {
			
			this.vida = a;
			this.vidaMAX = a;
			this.ataque = b;
			this.defesa = c;
			this.vel = d;
			
		}
		
		}
		
		
		
		
